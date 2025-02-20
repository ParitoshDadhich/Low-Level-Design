package builderDesignPattern;

import java.util.List;

public interface StudentBuilder {
    StudentBuilder setRollNo(int rollNo);
    StudentBuilder setAge(int age);
    StudentBuilder setName(String name);
    StudentBuilder setFatherName(String fatherName);
    StudentBuilder setMotherName(String motherName);
    StudentBuilder setSubjects(List<String> subjects);
    Student build();

    // add getters
    int getRollNo();
    int getAge();
    String getName();
    String getFatherName();
    String getMotherName();
    List<String> getSubjects();
}
