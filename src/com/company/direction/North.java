package com.company.direction;

import java.util.Scanner;

public class North{

    public static void mainRoom(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vous etes maintenant dans la direction Nord");

        System.out.println("Retour a la piece principal: tapez Main room ->");
        String choice = scanner.nextLine();

        switch (choice) {
            case "Main room":
                System.out.println("Vous etes dans la piece principal.");
                break;
            default:
                System.out.println("Vous etes encore dans la direction Nord. Reessayez !");
        }
    }

}
