package javaBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        //Topic_01_Statement_Loop tp1 = new Topic_01_Statement_Loop();
        Student student1 = new Student("1", "Ha");
        Student student2 = new Student("2", "Anh");
        Student student3 = new Student("3", "Huyen");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.get(0).printName();

        HashMap<String, Student> map = new HashMap<>();
        map.put(student1.getId(), student1);
        map.put(student2.getId(), student2);
        map.put(student3.getId(), student3);
        map.get("1").printName();

        student1.setAndPrintName("Ha Tran");
        student2.setAndPrintName("Anh Nguyen");
        student3.setAndPrintName("Huyen Le");

    }

}