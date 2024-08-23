package org.example.model;
import jakarta.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table

public class Teacher implements Serializable {

    @Serial

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue( strategy=GenerationType.IDENTITY )
    private int teacherId;
    private String salary;
    private String teacherName;

    @OneToOne(cascade = CascadeType.ALL)
    private model.Address address;

    public model.Address getAddress() {
        return address;
    }

    public void setAddress(model.Address address) {
        this.address = address;
    }


    public Teacher( String salary, String teacherName) {
        super();
        this.salary = salary;
        this.teacherName = teacherName;    }
    public Teacher() {}
    public Teacher(String salary, String teacherName, model.Department department) {
        this.salary = salary;
        this.teacherName = teacherName;
    }
    public int getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;    }
}
