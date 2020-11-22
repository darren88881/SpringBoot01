package com.atguigu.springboot.handle;

import com.atguigu.springboot.bean.Employee;
import com.atguigu.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author darren
 * @create 2020-11-22 14:53
 */
@Controller
public class EmployeeHandle {

    @Autowired
    private EmployeeService employeeService;

    /**
     * MVC 参数注解及应用：
     *  from 表单参数接受注解
     *      @ModelAttribute标签
     *         出现在方法上：表示当前方法会在控制器方法执行前线执行。有返回值，则自动将该返回值加入到ModelMap中
     *         出现在参数上：获取指定的数据给参数赋值。
     *          参考：https://www.cnblogs.com/MaxElephant/p/8134811.html
     *      @RequestParam
     *          获取某个请求参数，如@RequestParam("name")
     *  get请求：
     *      @PathVariable
     *          获取请求url 的参数
     *  非get请求
     *      @RequestBody
     *          获取请求体中的参数(et方法不行)
     *  所有请求：
     *      @RequestHeader
     *          获取请求头中的参数
     *      @CookieValue
     *          获取Cookie中的参数
     * @param emp
     * @return
     */
    @RequestMapping(value = "/addEmployee",method = {RequestMethod.POST})
    @ResponseBody
    public String addEmployee(Employee emp){
        employeeService.addEmployee(emp);
        return "success";
    }

    @RequestMapping(value = "/selectEmployee")
    @ResponseBody
    public List<Employee> selectEmployee(){
        List<Employee> employees = employeeService.selectEmployee();
        return employees;
    }
}
