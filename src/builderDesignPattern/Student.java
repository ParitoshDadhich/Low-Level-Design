package builderDesignPattern;

import java.util.List;

public class Student {
    private final int rollNo;
    private final int age;
    private final String name;
    private final String fatherName;
    private final String motherName;
    private final List<String> subjects;

    Student(StudentBuilder builder){
        this.rollNo = builder.getRollNo();
        this.age = builder.getAge();
        this.name = builder.getName();
        this.fatherName = builder.getFatherName();
        this.motherName = builder.getMotherName();
        this.subjects = builder.getSubjects();
    }

    public String toString(){
        return ""+ " roll number: " + this.rollNo +
                " age: " + this.age +
                " name: " + this.name +
                " father name: " + this.fatherName +
                " mother name: " + this.motherName +
                " subjects: " + subjects.get(0) + "," + subjects.get(1) ;
    }

}
