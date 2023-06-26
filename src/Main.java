import menu.Menu;
import menu.feature.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Menu.listMenu.add(new AddStudent(1));
        Menu.listMenu.add(new EditStudentById(2));
        Menu.listMenu.add(new RemoveStudentById(3));
        Menu.listMenu.add(new ShowStudents(4));
        Menu.listMenu.add(new SortStudentByName(5));
        Menu.listMenu.add(new SortStudentByGPA(6));

        Menu.showMenu();
    }
}