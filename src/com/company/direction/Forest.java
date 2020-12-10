package com.company.direction;

import java.util.Scanner;
import com.company.Menu.GameMenu;

public class Forest{

    public void forest(){

        Road myRoad = new Road();

        Scanner scanner = new Scanner(System.in);

        System.out.println("You're now in direction of the Forest");

        System.out.println("You can return to the road: write Road ->");
        String choice = scanner.nextLine();

        //Choix de la direction
        switch (choice) {
            case "Road":
                System.out.println("You return to the road");
                myRoad.road();
                break;
            default:
                System.out.println("Error. You're not allowed to do that.");
        }
    }
}
