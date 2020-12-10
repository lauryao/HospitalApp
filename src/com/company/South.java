package com.company;

import java.util.Scanner;

public class South{

    static void mainRoom2(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vous etes maintenant dans la direction Sud");

        System.out.println("Retour a la piece principal: tapez Main room ->");
        String choice2 = scanner.nextLine();

        switch (choice2) {
            case "Main room":
                System.out.println("Vous etes dans la piece principal.");
                break;
            default:
                System.out.println("Vous etes encore dans la direction Sud. Reessayez !");
        }
    }
}
