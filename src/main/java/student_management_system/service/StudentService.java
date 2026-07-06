package student_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import student_management_system.entity.Student;
import student_management_system.repo.StudentRepository;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    private StudentRepository repo;

    public Student save(Student s) {
        return repo.save(s);
    }

    public List<Student> findAll() {
        return repo.findAll();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}
