package com.programmeringTorun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecordBook {

    //Constuctor
    public RecordBook() {
        studentGrades = new ArrayList<>();
    }

    public RecordBook(List<Integer> grades) {
        studentGrades = grades;
    }

    //States
    private List<Integer> studentGrades;

    //Behaviour
    public List<Integer> getStudentGrades() {
        return studentGrades;
    }

    public int CalcAverage() {
        int total = 0;
        for (var g : studentGrades
        ) {
            total = total + g;
        }
        var average = total / studentGrades.size();
        return average;
    }

    public Integer CalcMaxValue() {
        Collections.sort(studentGrades);
        return studentGrades.get(studentGrades.size()-1);
    }

    public Integer CalcMinValue() {
        Collections.sort(studentGrades);
        return studentGrades.get(0);
    }
}
