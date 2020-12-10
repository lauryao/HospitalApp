package com.company.Menu;


import java.util.Scanner;

import com.company.direction.Place;
import com.company.direction.Road;

public class GameMenu {

    public GameMenu() {

        //Recuperation du nom taper par le joueur
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your username -> ");
        String nomHero = scanner.nextLine();

        System.out.println("Welcome in Colossal Cave  " + nomHero + ".");

        Place place = new Road();
        while (true){
            place.description();
            String direction = scanner.nextLine();
            place = place.chgDirection(direction);
        }
    }
}
