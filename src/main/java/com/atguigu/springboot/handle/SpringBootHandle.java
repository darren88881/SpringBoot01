package com.atguigu.springboot.handle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author darren
 * @create 2020-11-22 13:30
 */
@Controller
public class SpringBootHandle {

    @RequestMapping(value="/hello")
    @ResponseBody
    public String handle01(){
        System.out.println("hello!");
        return "success";
    }
}
