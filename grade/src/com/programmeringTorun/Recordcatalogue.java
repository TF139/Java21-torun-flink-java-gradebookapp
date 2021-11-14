package com.programmeringTorun;

import java.util.ArrayList;
import java.util.List;

public class Recordcatalogue {

    //States
    private List <Student> students;

    //Constuctor
    public Recordcatalogue(){
        students = new ArrayList<>();
    }
    //Behaviour

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student s){
        students.add(s);
    }

    public Student searchStudent(String name){
        Student student;
        for (int i=0; i<students.size(); i++){
            student=students.get(i);
            if (name.equals(student.getName()))
                return student;
        }
        return null;
    }

}