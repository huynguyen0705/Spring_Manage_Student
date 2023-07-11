package Spring_Manage_Student.repository;
import Spring_Manage_Student.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository <Admin, Long> {
    Admin findAdminByUsernameAndPassword (String username, String password);

}
