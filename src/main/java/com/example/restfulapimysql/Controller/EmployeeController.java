package com.example.restfulapimysql.Controller;


import com.example.restfulapimysql.Model.Employee;
import com.example.restfulapimysql.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class EmployeeController {


    @Autowired
    EmployeeService service;

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee ){
        service.saveOrUpdate(employee);
        return employee;
    }
    @GetMapping("/list")
    public List<Employee> list(){
        return service.getAllEmployee();
    }

    @GetMapping("/list/{id}")
    public Employee getById(@PathVariable Long id){
        return service.getByid(id);
    }


    @DeleteMapping("/delete/{id}")
    public String  deleteEmployee(@PathVariable(name = "id") long id){
        service.deleteEmployee(id);
        return "Xoa thanh cong" +id;
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@RequestBody Employee employee, @PathVariable long id) {
        try {
            Employee emp = service.getByid(id);
            service.saveOrUpdate(employee);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
