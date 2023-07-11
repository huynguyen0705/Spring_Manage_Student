package Spring_Manage_Student.controller;

import Spring_Manage_Student.model.Admin;
import Spring_Manage_Student.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/admin")
public class AdminController {
    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }


    @GetMapping("/login")
    public Admin getAdminByUsernameAndPassword (@RequestParam String username, @RequestParam String password) {
        return adminService.getAdminByUsernameAndPassword(username, password);

    }
}
