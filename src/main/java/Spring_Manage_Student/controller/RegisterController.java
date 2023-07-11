package Spring_Manage_Student.controller;

import Spring_Manage_Student.model.*;
import Spring_Manage_Student.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/register")
public class RegisterController {
    private final StudentService studentService;
    private final TeacherService teacherService;
    private final CourseService courseService;
    private final ChoosecourseService choosecourseService;
    private final GradeService gradeService;
    private final GradedraftService gradedraftService;

    @Autowired
    public RegisterController(StudentService studentService, TeacherService teacherService, CourseService courseService, ChoosecourseService choosecourseService, GradeService gradeService, GradedraftService gradedraftService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.courseService = courseService;
        this.choosecourseService = choosecourseService;
        this.gradeService = gradeService;
        this.gradedraftService = gradedraftService;
    }

    @PostMapping("/student")
    public Student registerStudent(@RequestBody Student student) {
        return studentService.registerStudent(student);
    }

    @PostMapping("/teacher")
    public Teacher registerTeacher(@RequestBody Teacher teacher) {
        return teacherService.registerTeacher(teacher);
    }

    @PostMapping("/course")
    public Course registerCourse(@RequestBody Course course) {
        return courseService.registerCourse(course);
    }

    @PostMapping("/choosecourse")
    public Choosecourse registerChoosecourse(@RequestBody Choosecourse choosecourse) {
        return choosecourseService.registerChoosecourse(choosecourse);
    }
    @PostMapping("/grade")
    public Grade registerGrade(@RequestBody Grade grade){
        return gradeService.registerGrade(grade);
    }
    @PostMapping("/gradedraft")
    public Gradedraft registerGradedraft(@RequestBody Gradedraft gradedraft){
        return gradedraftService.registerGradedraft(gradedraft);
    }
}
