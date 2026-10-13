package ru.ranepa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Напишите имя студента");
        String name = scanner.nextLine();

        ArrayList<Integer> marks = new ArrayList<>();

        int mark = 1;
        while(true){
            System.out.println("Введите оцентку студента, чтобы заокнчить цикл напишите 0");
            mark = scanner.nextInt();
            marks.add(mark);
            if(mark == 0) break;
        }
        Student student = new Student(name, marks);

        System.out.println("\nРезультаты");
        System.out.println("Имя" + student.name);
        System.out.println("Оценка" + student.grades);
    }
}
