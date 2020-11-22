package com.atguigu.springboot.service;

import com.atguigu.springboot.bean.Employee;

import java.util.List;

/**
 * @author darren
 * @create 2020-11-22 14:49
 */
public interface EmployeeService {
    public void addEmployee(Employee emp);
    public void deleteEmployee(int id);
    public void updateEmployee(Employee emp);
    public List<Employee> selectEmployee();

}
