package student_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import student_management_system.entity.Student;
import student_management_system.service.StudentService;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public Student create(@RequestBody Student s){
        return service.save(s);
    }

    @GetMapping
    public List<Student> getAll(){
        return service.findAll();
    }


    @DeleteMapping("/{id}")
    public  void delete(@PathVariable Long id){
        service.delete(id);
    }
}
