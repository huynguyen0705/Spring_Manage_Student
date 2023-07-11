package Spring_Manage_Student.controller;

import Spring_Manage_Student.model.Student;
import Spring_Manage_Student.model.Teacher;
import Spring_Manage_Student.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/teacher")
public class TeacherController {
    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/login")
    public Teacher getTeacherByUsernameAndPassword (@RequestParam String username, @RequestParam String password) {
        return teacherService.getTeacherByUsernameAndPassword(username, password);
    }

    @GetMapping("/get")
    public List<Teacher> getTeacherAll() {
        return teacherService.getTeacherAll();
    }
}
