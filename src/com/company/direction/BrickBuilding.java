package com.company.direction;

import java.util.Scanner;
import com.company.Menu.GameMenu;

public class BrickBuilding extends GameMenu{

    public void brickBuilding(){

        Road myRoad = new Road();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vous etes maintenant dans la direction Brick building");

        System.out.println("Vous pouvez revenir a la piece principal: tapez Road ->");
        String choice3 = scanner.nextLine();

        //Choix de la direction
        switch (choice3) {
            case "Road":
                System.out.println("Vous etes arriver sur la Road.");
                myRoad.road();
                break;
            default:
                System.out.println("Vous etes encore dans la direction Brick building. Reessayez !");
        }
    }
}
