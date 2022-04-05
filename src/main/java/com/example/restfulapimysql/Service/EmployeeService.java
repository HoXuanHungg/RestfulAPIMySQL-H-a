package com.example.restfulapimysql.Service;

import com.example.restfulapimysql.Model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();

    public Employee getByid(Long id);

    public void saveOrUpdate(Employee employee);

    public  void deleteEmployee(long id);

}
