package com.atguigu.springboot.mapper;


import com.atguigu.springboot.bean.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author darren
 * @create 2020-11-21 21:51
 */
@Repository
public interface EmployeeMapper {

    public void addEmployee(Employee emp);
    public void deleteEmployee(int id);
    public void updateEmployee(Employee emp);
    public List<Employee> selectEmployee();
}
