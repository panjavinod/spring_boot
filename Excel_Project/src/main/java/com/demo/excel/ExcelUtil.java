package com.demo.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.demo.model.Employee;

public class ExcelUtil {

    public static List<Employee> readExcel(String filePath) {
        List<Employee> employees = new ArrayList<>();

        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            Sheet sheet = workbook.getSheetAt(0); // Assuming the data is in the first sheet

            Iterator<Row> rowIterator = sheet.iterator();
            // Skip the header row if it exists
            if (rowIterator.hasNext()) {
                rowIterator.next();
            }

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Employee employee = createEmployeeFromRow(row);
                employees.add(employee);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return employees;
    }

    private static Employee createEmployeeFromRow(Row row) {
        Employee employee = new Employee();
        Iterator<Cell> cellIterator = row.iterator();

        while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            int columnIndex = cell.getColumnIndex();

            switch (columnIndex) {
                case 0:
                    employee.setId((long) cell.getNumericCellValue());
                    break;
                case 1:
                    employee.setName(cell.getStringCellValue());
                    break;
                case 2:
                    employee.setDesignation(cell.getStringCellValue());
                    break;
                // Add more cases for additional columns if needed
            }
        }

        return employee;
    }

    public static void writeExcel(String filePath, List<Employee> employees) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Employee Data");

            // Create header row
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Id");
            headerRow.createCell(1).setCellValue("Name");
            headerRow.createCell(2).setCellValue("Designation");

            // Populate data rows
            for (int i = 0; i < employees.size(); i++) {
                Row row = sheet.createRow(i + 1);
                writeEmployeeToRow(employees.get(i), row);
            }

            // Write to file
            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeEmployeeToRow(Employee employee, Row row) {
        row.createCell(0).setCellValue(employee.getId());
        row.createCell(1).setCellValue(employee.getName());
        row.createCell(2).setCellValue(employee.getDesignation());
        
    }
}
