package com.company.direction;

import java.util.Scanner;
import com.company.Menu.GameMenu;

public class Valley extends Place{

    public void valley(){

        Hill myHill = new Hill();
        Road myRoad = new Road();

        Scanner scanner = new Scanner(System.in);

        System.out.println("You're now in the middle of a valley Valley");

        System.out.println("You can return to the main road or go in the direction of the hill,");
        System.out.println("Write Road or Hill.");
        String choice2 = scanner.nextLine();

        //Choix de la direction
        switch (choice2) {
            case "Road":
                System.out.println("You have return to the Road.");
                myRoad.road();
                break;
            case "Hill":
                System.out.println("You're now ready to climb the Hill.");
                myHill.hill();
                break;
            default:
                System.out.println("Error. You're not allowed to do that.");
        }
    }
}
