package menu;

import menu.feature.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static ArrayList<Feature> listMenu = new ArrayList<Feature>();

    public static void showMenu() {
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
        boolean flag;
        do {
            flag = selectFeature(key);
        }
        while (!flag);
    }

    public static boolean selectFeature(int key) {
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
