package Spring_Manage_Student.service;

import Spring_Manage_Student.model.Admin;
import Spring_Manage_Student.model.Student;
import Spring_Manage_Student.model.Teacher;
import Spring_Manage_Student.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Admin getAdminByUsernameAndPassword (String username, String password) {
        Admin admin = adminRepository.findAdminByUsernameAndPassword(username, password);
        return admin;
    }
}
