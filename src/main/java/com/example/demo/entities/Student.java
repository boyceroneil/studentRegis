package com.example.demo.entities;
import javax.persistence.*;
@Entity
@Table(name="register")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="student_id")
    private int studentId;

    @Column(name="status")
    private String status;

    @Column(name="attending")
    private boolean attending;

    @Column(name="activity")
    private String activity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public boolean isAttending() {
        return attending;
    }

    public void setAttending(boolean attending) {
        this.attending = attending;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public String getAttending() {
//        return attending;
//    }
//
//    public void setAttending(String attending) {
//        this.attending = attending;
//    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentId=" + studentId +
                ", status='" + status + '\'' +
                ", attending=" + attending +
                ", activity='" + activity + '\'' +
                '}';
    }
}
