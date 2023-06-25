import menu.Menu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        boolean flag = false;
        do {
            int key =  menu.showMenuAndGetKey();
            flag = menu.selectFeature(key);
        }
        while (!flag);

    }
}