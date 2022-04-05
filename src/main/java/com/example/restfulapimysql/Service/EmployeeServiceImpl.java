package com.example.restfulapimysql.Service;

import com.example.restfulapimysql.Model.Employee;
import com.example.restfulapimysql.Repostory.EmployeeRepostory;
import com.example.restfulapimysql.Service.EmployeeService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired

    EmployeeRepostory repostory;

    @Override
    public List<Employee> getAllEmployee() {

        return (List<Employee>)repostory.findAll();
    }

    @Override
    public Employee getByid(Long id) {
        return repostory.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Employee employee) {
            repostory.save(employee);
    }

    @Override
    public void deleteEmployee(long id) {
           repostory.deleteById(id);
    }

}
