package Spring_Manage_Student.controller;

import Spring_Manage_Student.model.Admin;
import Spring_Manage_Student.model.Student;
import Spring_Manage_Student.model.StudentResponse;
import Spring_Manage_Student.model.Teacher;
import Spring_Manage_Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/login")
    public Student getStudentByUsernameAndPassword (@RequestParam String username, @RequestParam String password) {
        return studentService.getStudentByUsernameAndPassword(username, password);
    }

    @GetMapping("/get")
    public List<Student> getStudentAll() {
        return studentService.getStudentAll();
    }

    @GetMapping("/getscore")
    public List<StudentResponse> getAllStudentsWithScore() {
        return studentService.getAllStudentsWithScore();
    }

    @GetMapping("/getclass")
    public List<Long> getAllStudentClass() {
        return studentService.getAllStudentClass();
    }
}
