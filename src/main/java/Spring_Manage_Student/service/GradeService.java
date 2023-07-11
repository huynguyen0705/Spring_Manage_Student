package Spring_Manage_Student.service;

import Spring_Manage_Student.model.Grade;
import Spring_Manage_Student.repository.GradeRepository;
import org.springframework.stereotype.Service;

@Service
public class GradeService {
    private final GradeRepository gradeRepository;

    public GradeService(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }
    public Grade registerGrade (Grade grade) {
        return gradeRepository.save(grade);
    }
}
