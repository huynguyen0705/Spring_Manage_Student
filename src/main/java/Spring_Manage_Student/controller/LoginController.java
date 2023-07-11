package Spring_Manage_Student.controller;

import Spring_Manage_Student.model.Admin;
import Spring_Manage_Student.model.Response;
import Spring_Manage_Student.model.Student;
import Spring_Manage_Student.model.Teacher;
import Spring_Manage_Student.service.AdminService;
import Spring_Manage_Student.service.StudentService;
import Spring_Manage_Student.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LoginController {
    private final AdminService adminService;
    private final StudentService studentService;
    private final TeacherService teacherService;

    @Autowired
    public LoginController(AdminService adminService, StudentService studentService, TeacherService teacherService) {
        this.adminService = adminService;
        this.studentService = studentService;
        this.teacherService = teacherService;
    }

    //type = 1 -> admin
    //type = 2 -> student
    //type = 3 -> teacher
    @GetMapping("/login")
    public Response login(@RequestParam(name = "type") int type,
                          @RequestParam(name = "username") String username,
                          @RequestParam(name = "password") String password) {
        if (type < 1 || type > 3) {
            return new Response("type khong hop le");
        }
        if (username.isEmpty()) {
            return new Response("khong duoc de trong ten dang nhap");
        }
        if (password.isEmpty()) {
            return new Response("khong duoc de trong ten mat khau");
        }

        if (type == 1) {
            Admin result = adminService.getAdminByUsernameAndPassword(username, password);
            if (result == null) {
                return new Response("ten dang nhap hoac mat khau khong dung");
            }
            return new Response(result);
        } else if (type == 2) {
            Student result = studentService.getStudentByUsernameAndPassword(username, password);
            if (result == null) {
                return new Response("ten dang nhap hoac mat khau khong dung");
            }
            return new Response(result);
        } else {
            Teacher result = teacherService.getTeacherByUsernameAndPassword(username, password);
            if (result == null) {
                return new Response("ten dang nhap hoac mat khau khong dung");
            }
            return new Response(result);
        }
    }
}
