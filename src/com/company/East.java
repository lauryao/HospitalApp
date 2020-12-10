package com.company;

import java.util.Scanner;

public class East {

    static void mainRoom3(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vous etes maintenant dans la direction Est");

        System.out.println("Retour a la piece principal: tapez Main room ->");
        String choice3 = scanner.nextLine();

        switch (choice3) {
            case "Main room":
                System.out.println("Vous etes dans la piece principal.");
                break;
            default:
                System.out.println("Vous etes encore dans la direction Est. Reessayez !");
        }
    }
}