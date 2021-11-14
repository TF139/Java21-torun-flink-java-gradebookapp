package com.programmeringTorun;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Recordcatalogue catalogue = new Recordcatalogue();
        File file = new File("C:\\Users\\Safer\\OneDrive\\Skrivbord\\grade.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            var array = st.split(":");
            List<Integer> numberList = new ArrayList<>();
            var grades = array[1].split(",");
            for (var b : grades) {
                numberList.add(Integer.parseInt(b.trim()));
            }
            catalogue.addStudent(new Student(array[0], new RecordBook(numberList)));
        }
        for (var item : catalogue.getStudents()){
            System.out.println(item.getName() + item.getRecordBook().getStudentGrades());
        }
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b){
            System.out.println("Enter 1 to continue to students");
            System.out.println("Enter 0 to exit");
            System.out.println("Enter a number: ");
            int inputNumber = sc.nextInt();
            switch (inputNumber){
                case 1: System.out.print("Enter student name: ");
                    String inputName = sc.next().toLowerCase(Locale.ROOT).trim();
                    Student s1 = catalogue.searchStudent(inputName);
                    if (catalogue.searchStudent(inputName) == null){
                        System.out.println("Could not find student.");
                    }
                    else{
                        System.out.println("Student Name: " + s1.getName());
                        System.out.println("Grades: " + s1.getRecordBook().getStudentGrades());
                        System.out.println("Max Grade: " + s1.getRecordBook().CalcMaxValue());
                        System.out.println("Min Grade: " + s1.getRecordBook().CalcMinValue());
                        System.out.println("Average Grade: " + s1.getRecordBook().CalcAverage());
                        System.out.println("***********************");
                    }
                    break;
                case 0: b=false;
                    break;
            }
        }
    }
}
