package Spring_Manage_Student.controller;

import Spring_Manage_Student.model.Student;
import Spring_Manage_Student.model.Teacher;
import Spring_Manage_Student.service.StudentService;
import Spring_Manage_Student.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/update")
public class UpdateController {
    private final StudentService studentService;
    private final TeacherService teacherService;

    @Autowired
    public UpdateController(StudentService studentService, TeacherService teacherService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @PutMapping("/teacher")
    public Teacher updateTeacher(@RequestBody Teacher teacher) {
        return teacherService.updateTeacher(teacher);
    }
}
