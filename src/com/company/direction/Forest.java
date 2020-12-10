package com.company.direction;

import java.util.Scanner;
import com.company.Menu.GameMenu;

public class Forest extends GameMenu {

    public void forest(){

        Road myRoad = new Road();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vous etes maintenant dans la direction Forest");

        System.out.println("Vous pouvez revenir sur la route: tapez Road ->");
        String choice = scanner.nextLine();

        //Choix de la direction
        switch (choice) {
            case "Road":
                System.out.println("Vous etes sur la Road.");
                myRoad.road();
                break;
            default:
                System.out.println("Vous etes encore dans la direction Forest. Reessayez !");
        }
    }
}
