package menu;

import menu.feature.AddStudent;
import menu.feature.Feature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    private ArrayList<Feature> listMenu = new ArrayList<Feature>();

    public Menu() {

        listMenu.add(new AddStudent(1));
        listMenu.add(new AddStudent(2));
        listMenu.add(new AddStudent(3));
        listMenu.add(new AddStudent(4));
        listMenu.add(new AddStudent(5));

    }
    public int showMenuAndGetKey() {
        for (int i = 1; i <= 15; i++) {
            System.out.print("*");
        }
        System.out.print(" MENU ");
        for (int i = 1; i <= 15; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (Feature feature : listMenu
        ) {
            System.out.println(feature.getKey() + ": " + feature.getFeatureName());
        }
        System.out.println("0: Exit");
        for (int i = 1; i <= 36; i++) {
            System.out.print("*");
        }
        Scanner input = new Scanner(System.in);
        System.out.println("\nSelect option: ");
        int key = input.nextInt();
        return key;
    }

    public boolean selectFeature(int key) {
        System.out.println();
        for (Feature feature : listMenu) {
            if (key == feature.getKey()) {
                feature.run();
                return true;
            }
        }
        return false;
    }


}
