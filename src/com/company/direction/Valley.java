package com.company.direction;

import java.util.Scanner;
import com.company.Menu.GameMenu;

public class Valley extends GameMenu{

    public void valley(){

        Hill myHill = new Hill();
        Road myRoad = new Road();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vous etes maintenant dans la direction Valley");

        System.out.println("Vous pouvez retourner sur la route: tapez Road OU aller dans la direction de la colline: tapez Hill ->");
        String choice2 = scanner.nextLine();

        //Choix de la direction
        switch (choice2) {
            case "Road":
                System.out.println("Vous etes revenu a la Road.");
                myRoad.road();
                break;
            case "Hill":
                System.out.println("Vous etes dans la direction Hill.");
                myHill.hill();
                break;
            default:
                System.out.println("Vous etes encore dans la direction Valley. Reessayez !");
        }
    }
}
