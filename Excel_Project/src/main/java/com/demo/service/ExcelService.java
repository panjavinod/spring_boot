package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.excel.ExcelUtil;
import com.demo.model.Employee;

@Service
public class ExcelService {

    public  String excelFilePath = "C:\\Users\\pvinod\\Documents\\employees.xlsx"; // Change this to your Excel file path
    
   
    public List<Employee> readExcel() {
    	System.out.println("------"+excelFilePath);
        return ExcelUtil.readExcel(excelFilePath);
    }

    public Employee createEmployee(Employee employee) {
        List<Employee> employees = ExcelUtil.readExcel(excelFilePath);
        employees.add(employee);
        ExcelUtil.writeExcel(excelFilePath, employees);
        return employee;
    }

    public Employee updateEmployee(Employee employee) {
        List<Employee> employees = ExcelUtil.readExcel(excelFilePath);
        int index = employees.indexOf(employee);
        if (index != -1) {
            employees.set(index, employee);
            ExcelUtil.writeExcel(excelFilePath, employees);
            return employee;
        }
        return null;
    }

    public void deleteEmployee(Long id) {
        List<Employee> employees = ExcelUtil.readExcel(excelFilePath);
        employees.removeIf(employee -> employee.getId().equals(id));
        ExcelUtil.writeExcel(excelFilePath, employees);
    }
}
