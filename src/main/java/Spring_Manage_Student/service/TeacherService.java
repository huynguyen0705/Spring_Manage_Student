package Spring_Manage_Student.service;

import Spring_Manage_Student.model.Student;
import Spring_Manage_Student.model.Teacher;
import Spring_Manage_Student.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher getTeacherByUsernameAndPassword (String username, String password) {
        Teacher teacher = teacherRepository.findTeacherByUsernameAndPassword(username, password);
        return teacher;
    }

    public Teacher registerTeacher (Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public String deleteTeacher (Long id) {
        Optional<Teacher> optionalTeacher = teacherRepository.findById(id);
        if (optionalTeacher.isEmpty()) {
            return "Teacher not found";
        }
        teacherRepository.deleteById(id);
        return "Delete teacher success";
    }

    public List<Teacher> getTeacherAll(){
        return teacherRepository.findAll();
    }
    public Teacher updateTeacher (Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
