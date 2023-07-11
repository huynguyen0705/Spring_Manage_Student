package Spring_Manage_Student.repository;

import Spring_Manage_Student.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository <Teacher, Long> {
    Teacher findTeacherByUsernameAndPassword (String username, String password);
}
