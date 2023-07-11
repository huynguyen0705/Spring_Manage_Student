package Spring_Manage_Student.repository;

import Spring_Manage_Student.model.Student;
import Spring_Manage_Student.model.StudentResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {
    Student findStudentByUsernameAndPassword (String username, String password);

    @Query ("SELECT new Spring_Manage_Student.model.StudentResponse(s.id, s.studentCode, s.name, g.score) " +
            "FROM Student as s INNER JOIN s.grades as g inner join s.choosecourses as cc")
    List<StudentResponse> findAllStudentsByScore();

    @Query("SELECT s.studentClass FROM Student as s")
    List<Long> findAllStudentClasses();
}
