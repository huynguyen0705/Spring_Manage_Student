package Spring_Manage_Student.service;

import Spring_Manage_Student.model.Choosecourse;
import Spring_Manage_Student.model.Course;
import Spring_Manage_Student.repository.ChoosecourseRepository;
import org.springframework.stereotype.Service;

@Service
public class ChoosecourseService {
    private final ChoosecourseRepository choosecourseRepository;

    public ChoosecourseService(ChoosecourseRepository choosecourseRepository) {
        this.choosecourseRepository = choosecourseRepository;
    }
    public Choosecourse registerChoosecourse (Choosecourse choosecourse) {
        return choosecourseRepository.save(choosecourse);
    }
}
