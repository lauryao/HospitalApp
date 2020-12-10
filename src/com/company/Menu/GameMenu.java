package com.company.Menu;


import java.util.Scanner;
import com.company.direction.Road;

public class GameMenu {

    public static void main(String[] args) {

        //Recuperation du nom taper par le joueur
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your username -> ");
        String nomHero = scanner.nextLine();

        System.out.println("Welcome in Colossal Cave  " + nomHero + ".");

        Road myRoad = new Road();
        myRoad.road();
    }
}
