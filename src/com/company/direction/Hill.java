package com.company.direction;

import java.util.Scanner;
import com.company.Menu.GameMenu;

public class Hill extends GameMenu{

    public void hill(){

        Forest myForest = new Forest();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vous etes maintenant dans la direction Hill");

        System.out.println("Pour aller dans la prochaine direction: tapez Forest ->");
        String choice4 = scanner.nextLine();

        //Choix de la direction
        switch (choice4) {
            case "Forest":
                System.out.println("Vous etes dans la direction Forest.");
                myForest.forest();
                break;
            default:
                System.out.println("Vous etes encore dans la direction Hill. Reessayez !");
        }
    }
}
