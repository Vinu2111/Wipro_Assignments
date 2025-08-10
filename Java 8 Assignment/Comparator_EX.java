package com.rk.solid.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

// Comparator to sort by name
class NameSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

// Comparator to sort by age
class AgeSort implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}

public class Comparator_EX {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(22, "John"));
        list.add(new Student(18, "Alex"));

        Collections.sort(list, new NameSort()); // Sort by name
        // Collections.sort(list, new AgeSort()); // Sort by age

        for (Student s : list)
            System.out.println(s.age + " " + s.name);
    }
}


