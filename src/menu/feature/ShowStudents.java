package menu.feature;

import menu.Menu;
import student.Student;
import student.StudentIO;

import java.util.List;

public class ShowStudents extends Feature {
    public ShowStudents(int key) {
        super(key,"Show All Students");
    }

    @Override
    public void run() {
        System.out.println(StudentIO.read());;
        Menu.showMenu();
    }
}