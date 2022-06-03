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

    @RequestMapping("/java_data")
    public String dynamicData(Model model){
        model.addAttribute("a","Java");
        model.addAttribute("b","Java 8");
        model.addAttribute("c","Spring & Spring boot");
        return "java_data"; // returns java_data.jsp

    }

    @RequestMapping("/student_data")
    public String studentInfo(Model model){
        Student obj=new Student("Rashid",40,"PCB");
        model.addAttribute("std1", obj);
        Student obj1=new Student("Kalpesh",25,"Commerce");
        model.addAttribute("std2", obj1);
                
        return "student_data";

    }





}
