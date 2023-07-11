package Spring_Manage_Student.controller;

import Spring_Manage_Student.model.CourseResponse;
import Spring_Manage_Student.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/course")
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/get")
    public List<CourseResponse> getCourseAndTeacherName() {
        return courseService.getCourseAndTeacherName();
    }

    @GetMapping("/getallname")
    public List<String> getAllCourseNames() {
        return courseService.getAllCourseNames();
    }
}
