package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeRepo;
import com.demo.model.Employe;

@Service
public class EmployeService {
	@Autowired
	EmployeRepo emprepo;
	
	public List<Employe> getAllUsers(Employe employe){
		  return emprepo.findAll();
		}
	
    public Optional<Employe> getUser(int id) {
	      return emprepo.findById(id);
	    }
   
    public void SvaeEmploye(Employe employe) {
	       emprepo.save(employe);
	    }
    public void deleteEmploye(int id) {
    	emprepo.deleteById(id);
    	
    }
   
}
