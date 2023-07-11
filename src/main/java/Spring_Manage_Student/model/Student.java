package Spring_Manage_Student.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 40)
    private String username;
    @Column(length = 40)
    private String password;
    @Column(length = 64)
    private String studentCode;
    @Column(length = 20)
    private String name;
    @Column
    private Long studentClass;
    @Column
    private Long age;
    @Column(length = 4)
    private String sex;
    @Column
    private Date birthday;
    @Column(length = 64)
    private String address;
    @Column(length = 64)
    private String phone;
    @Column(length = 64)
    private String email;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<Grade> grades = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Long getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(Long studentClass) {
        this.studentClass = studentClass;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<Gradedraft> gradedrafts = new HashSet<>();

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<Choosecourse> choosecourses = new HashSet<>();
}
