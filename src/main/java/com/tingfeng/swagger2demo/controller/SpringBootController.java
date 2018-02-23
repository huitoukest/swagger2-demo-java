package com.tingfeng.swagger2demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "test")
public class SpringBootController {  
  
    @ApiOperation(value = "获取helloWorld", notes = "简单SpringMVC请求")  
    @RequestMapping("/")  
    String home() {
        return "HELLO WORLD";  
    }  
  
    @ApiOperation(value = "获得A+B", notes = "根据url的classNo和url的studentName获得请求参数的字符串相加，RestFul风格的请求")  
    @ApiImplicitParams({@ApiImplicitParam(name = "classNo", value = "班级编号", required = true, dataType = "String"),  
    })  
    @RequestMapping(value = "/class/{classNo}/to/{studentName}", method = RequestMethod.GET)  
    String world(@PathVariable("classNo") String classNo, @PathVariable("studentName") String studentName) {  
        return classNo + "  " + studentName;  
    }
  
    @RequestMapping(value = "/swagger")
    public String index() {
        System.out.println("swagger-ui.html");
        return "redirect:swagger-ui.html";
    }
  
}  
