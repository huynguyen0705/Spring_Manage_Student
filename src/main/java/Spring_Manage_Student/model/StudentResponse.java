package Spring_Manage_Student.model;

public class StudentResponse {
    private Long id;
    private String studentCode;
    private String name;
    private Long score;

    public StudentResponse(Long id, String studentCode, String name, Long score) {
        this.id = id;
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }



    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }
}
