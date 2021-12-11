package com.csa.samplefullstack.controllers;

import java.util.List;
import com.csa.samplefullstack.entity.Employee;
import com.csa.samplefullstack.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class EmployeeController {
    
    @Autowired                                      // spring process - dependency injection 
    private EmployeeRepository employeeRepository;
    
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    
    @PostMapping("/employees")
    public Employee postEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
    
    @GetMapping("/employees/{id}")
    public Employee getEmployeeFromID(@PathVariable Long id){
        return employeeRepository.findById(id).get();
    }
    
    @PutMapping("/employees")
    public Employee putEmployee(@RequestBody Employee employee){                // this is for updating records
        return employeeRepository.save(employee);
    }
    
    
   @DeleteMapping("/employees/{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable Long id){
        employeeRepository.deleteById(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
                
    }
}
