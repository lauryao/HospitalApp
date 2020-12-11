package com.company.Menu;


import java.util.Scanner;

import com.company.direction.Place;
import com.company.direction.Road;

public class GameMenu {

    public GameMenu() {

        //Register the name of the player
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your username -> ");
        String nomHero = scanner.nextLine();

        System.out.println("Welcome in Colossal Cave  " + nomHero + ".");

        //Because the player spawn on the road, it initiate here
        Place place = new Road();

        while (true){
            //The 'while' will end if the player write 'quit' when he is on the place name 'Road'
            place.description();
            String direction = scanner.nextLine();
            place = place.chgDirection(direction);
        }
    }
}
