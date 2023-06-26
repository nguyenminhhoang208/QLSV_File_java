package menu.feature;

import menu.Menu;
import student.Student;
import student.StudentIO;

import java.util.Scanner;

public class AddStudent extends Feature {
    public AddStudent(int key) {
        super(key, "Add Student");
    }

    @Override
    public void run() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap ten sinh vien: ");
        String name = input.nextLine();

        System.out.println("Nhap tuoi sinh vien: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Nhap dia chi sinh vien: ");
        String andress = input.nextLine();

        System.out.println("Nhap GPA sinh vien: ");
        double gpa = input.nextDouble();

        Student newStudent = new Student(name, age, gpa,andress);
        StudentIO.write(newStudent);
        Menu.showMenu();
    }
}
