package com.company.direction;

import java.util.Scanner;
import com.company.Menu.GameMenu;

public class Hill extends Place{

    public void hill(){

        Forest myForest = new Forest();

        Scanner scanner = new Scanner(System.in);

        System.out.println("You're now on a Hill");

        System.out.println("To go in direction of the forest: write 'Forest' ->");
        String choice4 = scanner.nextLine();

        //Choix de la direction
        switch (choice4) {
            case "Forest":
                System.out.println("You are go right into the Forest.");
                myForest.forest();
                break;
            default:
                System.out.println("Error. You're not allowed to do that.");
        }
    }
}
