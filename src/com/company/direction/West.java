package com.company.direction;

import java.util.Scanner;

public class West {

    public static void mainRoom4(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vous etes maintenant dans la direction Ouest");

        System.out.println("Retour a la piece principal: tapez Main room ->");
        String choice4 = scanner.nextLine();

        switch (choice4) {
            case "Main room":
                System.out.println("Vous etes dans la piece principal.");
                break;
            default:
                System.out.println("Vous etes encore dans la direction Ouest. Reessayez !");
        }
    }
}