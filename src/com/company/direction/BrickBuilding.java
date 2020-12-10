package com.company.direction;

import java.util.Scanner;
import com.company.Menu.GameMenu;

public class BrickBuilding extends GameMenu{

    public void brickBuilding(){

        Road myRoad = new Road();

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are nom in direction of Brick building.");

        System.out.println("You can return to the main room: Write 'Road' ->");
        String choice3 = scanner.nextLine();

        //Choix de la direction
        switch (choice3) {
            case "Road":
                System.out.println("You have return to the Road.");
                myRoad.road();
                break;
            default:
                System.out.println("Error. You're not allowed to do that.");
        }
    }
}
