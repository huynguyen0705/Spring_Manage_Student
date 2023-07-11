package Spring_Manage_Student.repository;

import Spring_Manage_Student.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository <Grade, Long> {
}
