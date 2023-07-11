package Spring_Manage_Student.model;

public class CourseResponse {
    private Long id;
    private String courseName;
    private String academicYear;
    private String term;
    private String teacherName;

    public CourseResponse(Long id, String courseName, String academicYear, String term, String teacherName) {
        this.id = id;
        this.courseName = courseName;
        this.academicYear = academicYear;
        this.term = term;
        this.teacherName = teacherName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
