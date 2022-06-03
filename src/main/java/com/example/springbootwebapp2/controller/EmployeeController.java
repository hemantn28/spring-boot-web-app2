package com.example.springbootwebapp2.controller;

import com.example.springbootwebapp2.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @RequestMapping("/employee_name")
    public String employeeName(){
        return "employee_name";
    }

    @RequestMapping("/employees_work")
    public String employessWork(){
        return "employees_work";
    }

    @RequestMapping("/new_employee")
    public String newEmployee(){
        return "new_employee";
    }

    @RequestMapping("/employee_data")
    public String employeeInfo(Model model){
        Employee emp1=new Employee("Sameer", "Sales", 26);
        model.addAttribute("obj1", emp1);
        Employee emp2=new Employee("Vinod", "IT", 24);
        model.addAttribute("obj2", emp2);
        return "employee_data";

    }
}
