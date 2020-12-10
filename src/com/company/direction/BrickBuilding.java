package com.company.direction;

import java.util.Scanner;
import com.company.Menu.GameMenu;

public class BrickBuilding extends Place{

    public void brickBuilding(){

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
                printError();
        }
    }
}
