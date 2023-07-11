package Spring_Manage_Student.service;

import Spring_Manage_Student.model.Course;
import Spring_Manage_Student.model.CourseResponse;
import Spring_Manage_Student.model.Student;
import Spring_Manage_Student.model.Teacher;
import Spring_Manage_Student.repository.CourseRepository;
import Spring_Manage_Student.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;
    private final TeacherRepository teacherRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository, TeacherRepository teacherRepository) {
        this.courseRepository = courseRepository;
        this.teacherRepository = teacherRepository;
    }

    public List<CourseResponse> getCourseAndTeacherName() {
        return courseRepository.findAllCourseByIdTeacher();
    }

    public Course registerCourse (Course course) {
        return courseRepository.save(course);
    }

    public List<String> getAllCourseNames() {
        return courseRepository.findAllCourseNames();
    }
}
