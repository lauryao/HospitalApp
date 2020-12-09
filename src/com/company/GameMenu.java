package com.company;

import java.util.Scanner;

public class GameMenu {
    public GameMenu(){

        Direction direction = new Direction();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom -> ");
        String nomHero = scanner.nextLine();

        System.out.println("Bienvenu à vous " + nomHero + ".");

        System.out.println("Saisissez votre destination ->");
        direction.getLocation();
        String location = scanner.nextLine();

    }
}
