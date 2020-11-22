package com.atguigu.springboot.service;

import com.atguigu.springboot.bean.Employee;
import com.atguigu.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author darren
 * @create 2020-11-22 14:50
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public void addEmployee(Employee emp) {
        employeeMapper.addEmployee(emp);
    }

    @Override
    public void deleteEmployee(int id) {

    }

    @Override
    public void updateEmployee(Employee emp) {

    }

    @Override
    public List<Employee> selectEmployee() {
        List<Employee> employees = employeeMapper.selectEmployee();
        return employees;
    }
}
