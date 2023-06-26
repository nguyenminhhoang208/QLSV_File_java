package student;

import java.io.Serializable;

public class Student{
    private static int currentId = 1;
    private int id;
    private String name;
    private int age;
    private String andress;
    private double gpa;

    public Student() {
    }
    public Student(int id,String name, int age,  double gpa, String andress) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.andress = andress;
        this.gpa = gpa;
    }

    public Student(String name, int age,  double gpa, String andress) {
        super();
        this.id = ++currentId;
        this.name = name;
        this.age = age;
        this.andress = andress;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getAndress() {
        return andress;
    }

    public void setAndress(String andress) {
        this.andress = andress;
    }

    @Override
    public String toString() {
        return "\n{\nid: " + this.id + ",\nname: " + this.name + ",\nandress: " + this.andress + ",\nage: " + this.age
                + ",\nGPA: " + this.gpa + "\n}";
    }
}
