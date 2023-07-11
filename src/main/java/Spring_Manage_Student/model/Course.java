package Spring_Manage_Student.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40)
    private String courseName;

    @Column(length = 40)
    private String academicYear;

    @Column(length = 40)
    private String term;

    @Column
    private Long teacherId;

    @Column(length = 40)
    private String commitStatus;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<Grade> grades = new HashSet<>();

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<Gradedraft> gradedrafts = new HashSet<>();

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<Choosecourse> choosecourses = new HashSet<>();

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

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getCommitStatus() {
        return commitStatus;
    }

    public void setCommitStatus(String commitStatus) {
        this.commitStatus = commitStatus;
    }

    public Set<Grade> getGrades() {
        return grades;
    }

    public void setGrades(Set<Grade> grades) {
        this.grades = grades;
    }

    public Set<Gradedraft> getGradedrafts() {
        return gradedrafts;
    }

    public void setGradedrafts(Set<Gradedraft> gradedrafts) {
        this.gradedrafts = gradedrafts;
    }

    public Set<Choosecourse> getChoosecourses() {
        return choosecourses;
    }

    public void setChoosecourses(Set<Choosecourse> choosecourses) {
        this.choosecourses = choosecourses;
    }
}
