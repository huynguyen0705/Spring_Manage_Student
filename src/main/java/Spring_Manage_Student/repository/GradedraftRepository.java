package Spring_Manage_Student.repository;

import Spring_Manage_Student.model.Gradedraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradedraftRepository extends JpaRepository<Gradedraft, Long> {
}
