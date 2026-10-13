package ru.ranepa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name");
        String name = scanner.nextLine();

        ArrayList<Integer> marks = new ArrayList<>();

        int mark = 1;
        while(true){
            System.out.println("Enter Grades");
            mark = scanner.nextInt();
            marks.add(mark);
            if(mark == 0) break;
        }
        Student student = new Student(name, marks);

        System.out.println("\nResult");
        System.out.println("Name " + student.name);
        System.out.println("Grade " + student.grades);
        System.out.println("Average Grade " + student.average());
        System.out.println("Status " + student.status());
    }
}
