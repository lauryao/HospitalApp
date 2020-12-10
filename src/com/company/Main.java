package com.company;

import com.company.Menu.GameMenu;
import com.company.Menu.MenuMusic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome !\n");
        System.out.print("""
                        What do you want to do ?
                        1/ Some music ?
                        2/ Or just a game ?
                        3/ Quit.
                        Selection :\s"""
                );
        String choice = sc.next();
        switch (choice) {
            case "1" -> new MenuMusic();
            case "2" -> new GameMenu();
            case "3" -> System.exit(0);
            default -> System.out.println("I don't understand your choice. Choose before Christmas !");
        }
    }
}