package Spring_Manage_Student.model;

public class Response {
    private String message;
    private Admin admin;
    private Student student;
    private Teacher teacher;

    public Response(String message) {
        this.message = message;
    }

    public Response(Admin admin) {
        this.message = "Dang nhap thanh cong";
        this.admin = admin;
    }

    public Response(Student student) {
        this.message = "Dang nhap thanh cong";
        this.student = student;
    }

    public Response(Teacher teacher) {
        this.message = "Dang nhap thanh cong";
        this.teacher = teacher;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
