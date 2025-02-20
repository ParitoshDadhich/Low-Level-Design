package builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Director {
    StudentBuilder builder;
    Director(StudentBuilder builder){
        this.builder = builder;
    }

    Student createStudent(){
        if(this.builder instanceof EngineerStudentBuilder){
            return this.createEngineerStudent();
        }
        else if(this.builder instanceof MbaStudentBuilder){
            return this.createMbaStudent();
        }
        else{
            throw new IllegalArgumentException("Invalid Student!");
        }
    }

    private Student createMbaStudent() {
        List<String> subjectList = new ArrayList<>();
        subjectList.add("Finance");
        subjectList.add("Economics");

        return this.builder
                .setAge(22)
                .setName("Aman")
                .setFatherName("Raj")
                .setMotherName("Komal")
                .setSubjects(subjectList)
                .build();
    }

    private Student createEngineerStudent() {
        List<String> subjectList = new ArrayList<>();
        subjectList.add("DSA");
        subjectList.add("Algo");

        return this.builder
                .setAge(25)
                .setName("Paritosh")
                .setFatherName("Nand Kumar")
                .setMotherName("Sonika")
                .setSubjects(subjectList)
                .build();
    }
}
