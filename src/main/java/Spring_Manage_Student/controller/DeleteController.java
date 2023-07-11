package Spring_Manage_Student.controller;

import Spring_Manage_Student.model.Response;
import Spring_Manage_Student.service.StudentService;
import Spring_Manage_Student.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/delete")
public class DeleteController {
    private final StudentService studentService;
    private final TeacherService teacherService;

    @Autowired
    public DeleteController(StudentService studentService, TeacherService teacherService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
    }

    @DeleteMapping("/teacher/{id}")
    public Response deleteTeacher(@PathVariable Long id){
        String message = teacherService.deleteTeacher(id);
        return new Response(message);
    }

    @DeleteMapping("/student/{id}")
    public Response deleteStudent(@PathVariable Long id){
        String message = studentService.deleteStudent(id);
        return new Response(message);
    }
}
