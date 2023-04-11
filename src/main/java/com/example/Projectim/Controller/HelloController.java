package com.example.Projectim.Controller;

import com.example.Projectim.RepositoryPage.StudentRepository;
import com.example.Projectim.StudentFolder.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/student")
public class HelloController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public String lister(){
        return "home";
    }

    @GetMapping("/index")
    public String studentMapping(Model model){
        Iterable<Student> students = studentRepository.findAll();
        model.addAttribute("students" , students);
        return "index";

    }

}
