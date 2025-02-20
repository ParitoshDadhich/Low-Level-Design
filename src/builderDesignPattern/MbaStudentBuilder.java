package builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MbaStudentBuilder implements StudentBuilder{

    private int rollNo;
    private int age;
    private String name;
    private String fatherName;
    private String motherName;
    private List<String> subjects = new ArrayList<>();


    @Override
    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    @Override
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    @Override
    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    @Override
    public StudentBuilder setSubjects(List<String> subjects) {
        this.subjects.addAll(subjects);
        System.out.println(this.subjects + "");
        return this;
    }

    public Student build(){
        return new Student(this);
    }

    @Override
    public int getRollNo() {
        return this.rollNo;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getFatherName() {
        return this.fatherName;
    }

    @Override
    public String getMotherName() {
        return this.motherName;
    }

    @Override
    public List<String> getSubjects() {
        return this.subjects;
    }
}
