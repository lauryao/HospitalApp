package com.company;

import java.util.Scanner;

public class GameMenu {

    public GameMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom -> ");
        String nomHero = scanner.nextLine();

        System.out.println("Bienvenu à vous " + nomHero + ".");

        System.out.println("Saisissez votre destination: Nord, Sud, Ouest ou Est ->");
        String direction = scanner.nextLine();

        //Choix de la direction
        switch (direction) {
            case "Nord" -> System.out.println("Vous etes maintenant dans la direction Nord");
            case "Sud" -> System.out.println("Vous etes maintenant dans la direction Sud");
            case "Ouest" -> System.out.println("Vous etes maintenant dans la direction Ouest");
            case "Est" -> System.out.println("Vous etes maintenant dans la direction Est");
            default -> System.out.println("Cette direction n'existe pas. Veuillez reessayer.");
        }
    }
}
