package com.company;

import java.util.Scanner;

public class GameMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom -> ");
        String nomHero = scanner.nextLine();

        System.out.println("Bienvenu à vous " + nomHero + ".");

        System.out.println("Saisissez votre destination: Nord, Sud,Ouest ou Est ->");
        String direction = scanner.nextLine();

        //Choix de la direction
        switch (direction) {
            case "Nord":
                North.mainRoom();
                break;
            case "Sud":
                South.mainRoom2();
                break;
            case "Est":
                East.mainRoom3();
                break;
            case "Ouest":
                West.mainRoom4();
                break;
            default:
                System.out.println("Cette direction n'existe pas. Veuillez reessayer.");
        }
    }
}
