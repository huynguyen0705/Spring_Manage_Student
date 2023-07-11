package Spring_Manage_Student.service;

import Spring_Manage_Student.model.Admin;
import Spring_Manage_Student.model.Student;
import Spring_Manage_Student.model.StudentResponse;
import Spring_Manage_Student.model.Teacher;
import Spring_Manage_Student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudentByUsernameAndPassword (String username, String password) {
        Student student = studentRepository.findStudentByUsernameAndPassword(username, password);
        return student;
    }

    public Student registerStudent (Student student) {
        return studentRepository.save(student);
    }

    public String deleteStudent (Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isEmpty()) {
            return "Teacher not found";
        }
        studentRepository.deleteById(id);
        return "Delete teacher success";
    }

    public List<Student> getStudentAll(){
        return studentRepository.findAll();
    }

    public Student updateStudent (Student student) {
        return studentRepository.save(student);
    }

    public List<StudentResponse> getAllStudentsWithScore() {
        return studentRepository.findAllStudentsByScore();
    }

    public List<Long> getAllStudentClass() {
        return studentRepository.findAllStudentClasses();
    }
}
