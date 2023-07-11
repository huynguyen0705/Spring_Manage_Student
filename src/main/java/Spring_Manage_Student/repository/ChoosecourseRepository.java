package Spring_Manage_Student.repository;

import Spring_Manage_Student.model.Choosecourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoosecourseRepository extends JpaRepository<Choosecourse, Long> {

}
