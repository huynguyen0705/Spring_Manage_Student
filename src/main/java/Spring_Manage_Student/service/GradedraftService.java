package Spring_Manage_Student.service;

import Spring_Manage_Student.model.Grade;
import Spring_Manage_Student.model.Gradedraft;
import Spring_Manage_Student.repository.GradedraftRepository;
import org.springframework.stereotype.Service;

@Service
public class GradedraftService {
    private final GradedraftRepository gradedraftRepository;

    public GradedraftService(GradedraftRepository gradedraftRepository) {
        this.gradedraftRepository = gradedraftRepository;
    }


    public Gradedraft registerGradedraft (Gradedraft gradedraft) {
        return gradedraftRepository.save(gradedraft);
    }
}
