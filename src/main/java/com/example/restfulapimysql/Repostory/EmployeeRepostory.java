package com.example.restfulapimysql.Repostory;

import com.example.restfulapimysql.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepostory extends CrudRepository<Employee, Long> {




}
