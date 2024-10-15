package javaBasic;

public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void setId() {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAndPrintName(String name) {
        setName(name);
        System.out.println(name);
    }
    public void printId() {
        System.out.println(id);
    }

    public void printName() {
        System.out.println(name);
    }



}
