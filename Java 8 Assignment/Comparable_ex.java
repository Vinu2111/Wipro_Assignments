package com.rk.solid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Sorting by id
    public int compareTo(Student s) {
        return this.id - s.id;
    }
}

public class Comparable_ex {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(); // ✅ fixed here
        list.add(new Student(4, "Rohit"));
        list.add(new Student(1, "Aman"));
        list.add(new Student(5, "Sneha"));
        list.add(new Student(2, "Zoya"));
        list.add(new Student(3, "Varun"));

        Collections.sort(list);  // uses compareTo()

        for (Student s : list)
            System.out.println(s.id + " " + s.name);
    }
}



/*

Updated Full Code (Sorting by Name):
java
Copy
Edit
package com.rk.solid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 🔁 Sorting by name (instead of id)
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }
}

public class Comparable_ex {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(4, "Rohit"));
        list.add(new Student(1, "Aman"));
        list.add(new Student(5, "Sneha"));
        list.add(new Student(2, "Zoya"));
        list.add(new Student(3, "Varun"));

        Collections.sort(list);  // uses compareTo()

        for (Student s : list)
            System.out.println(s.id + " " + s.name);
    }
}
*/