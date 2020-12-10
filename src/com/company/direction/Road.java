package com.company.direction;

import java.util.Scanner;
import com.company.Menu.GameMenu;

public class Road extends GameMenu{

    public void road(){

        Forest myForest = new Forest();
        Valley myValley = new Valley();
        BrickBuilding myBrickBuilding = new BrickBuilding();
        Hill myHill = new Hill();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez votre destination: Forest, Valley, Hill ou Brick building ->");
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
                System.out.println("Cette direction n'existe pas. Veuillez reessayer.");
        }
    }
}
