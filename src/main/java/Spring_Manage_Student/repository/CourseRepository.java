package Spring_Manage_Student.repository;

import Spring_Manage_Student.model.Course;
import Spring_Manage_Student.model.CourseResponse;
import Spring_Manage_Student.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository <Course, Long> {
    @Query("SELECT new Spring_Manage_Student.model.CourseResponse(c.id, c.courseName, c.academicYear, c.term, t.name) " +
            "FROM Course as c inner join Teacher as t ON c.teacherId = t.id")
    List<CourseResponse> findAllCourseByIdTeacher();

    @Query("SELECT c.courseName FROM Course as c")
    List<String> findAllCourseNames();
}

