package javaBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Topic_02_HashMap_ArrayList {
    // HashMap<String, Student> map = new HashMap<>();// Declaration and initialization a HashMap
    //List<Student> students = new ArrayList<>();// Declaration and initialization a List

    Student student1 = new Student("1", "Ha");
    Student student2 = new Student("2", "Anh");
    Student student3 = new Student("3", "Huyen");

    public void addStudentsToList() {
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        // Get a student Name by index: 0, 1, 2
        students.get(0).printName();
        students.get(1).printName();
        students.get(02).printName();
    }

    public void addStudentsToMap() {
        HashMap<String, Student> map = new HashMap<>();
        map.put(student1.getId(), student1);
        map.put(student2.getId(), student2);
        map.put(student3.getId(), student3);
        // Get a student Name by id: 1, 2, 3
        map.get("1").printName();
        map.get("2").printName();
        map.get("3").printName();
    }

    public void updateStudentName() {
        // Update student's name and print the updated information
        student1.setAndPrintName("Ha Tran");
        student2.setAndPrintName("Anh Nguyen");
        student3.setAndPrintName("Huyen Le");
    }


}