package com.example.springbootwebapp2.controller;

import com.example.springbootwebapp2.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class WebController {

    @RequestMapping("/your_marks")
    public String yourMarks() {

        return "marks";
    }


    @RequestMapping("/demo_file")
    public String demoFile(){

        return "demo_file";
    }

    @RequestMapping("/new")
    public String newPage(){
        return "newpage";

    }

    @RequestMapping("/demo")
    public String demo(){
        return "demo_page";

    }

    @RequestMapping("/home")
    public String defaultMapping(){

        return "index";
    }

    @RequestMapping("/mypage")
    public String myPage(){

        return "mypage";
    }

    @RequestMapping("/filename")
    public String myPageFile(){

        return "filename";
    }

    @RequestMapping(value = "/hello",method = POST)
    public String sayHello(@RequestParam("name") String name, Model model){
        model.addAttribute("USER_ID", name);
        model.addAttribute("name","JAVA");
        Student student=new Student("Rahul", 12, "CS");
        model.addAttribute("Student", student);
        return "hello";



    }





}
