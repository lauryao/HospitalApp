package com.company.direction;

import java.util.Scanner;
import com.company.Menu.GameMenu;

public class Road{

    public void road(){

        Forest myForest = new Forest();
        Valley myValley = new Valley();
        BrickBuilding myBrickBuilding = new BrickBuilding();
        Hill myHill = new Hill();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down where you want to go: Forest, Valley, Hill or Brick building ->");
        String direction = scanner.nextLine();

        //Choix de la direction
        switch (direction) {
            case "Forest":
                myForest.forest();
                break;
            case "Valley":
                myValley.valley();
                break;
            case "Brick building":
                myBrickBuilding.brickBuilding();
                break;
            case "Hill":
                myHill.hill();
                break;
            default:
                System.out.println("Error. You're not allowed to do that.");
        }
    }
}
