package com.example.springboot.controller;

import org.springframework.web.bind.annotation.*;

import com.example.springboot.entity.Employee;

@RestController
//@Controller
//ResponseBody
public class EmployeeController {

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String message(){
        return "Spring Example";
    }

//    @PathVariable
    @RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
    public String message1(@PathVariable String name){
        return "Some Message: " + name;
    }
//    @RequestParam
    @RequestMapping(value = "/param",method = RequestMethod.GET)
    public String message2(@RequestParam(defaultValue = "Param required") String fName,@RequestParam String lName){
        return "Request Param Example:  " + fName + " " + lName;
    }

//    @RequestBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Employee addEmployee(@RequestBody Employee employee){
        return employee;
    }
}

