package ru.ranepa;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public List<Integer> grades = new ArrayList<>();

    public Student(String name, ArrayList<Integer> mark) {
        this.name = name;
        this.grades = mark;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }
    public double average() {
        if(grades.isEmpty()) return 0.0;
        int sum = 0;
        for(int g : grades){
            sum += g;
        }
        return (double) sum / grades.size();
    }

    public String status() {
        double avg = average();
        if (avg >= 4.5) return "отличник";
        if (avg >= 3.5) return "хорошист";
        if (avg >= 2.5) return "троечник";
        return "двоечник";
    }
}
