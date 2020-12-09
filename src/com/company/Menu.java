package com.company;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nQue voulez faire?"
                + "\n1- Ajouter une chanson"+ "\n2- Voir une playlist"
                + "\n3- Supprimer une chanson" + "\n4- Supprimer une playlist"
                + " \n5- Quitter" + "\nSelection: ");

        String Scanner = scan.nextLine();
        switch ((Scanner)) {
            case "1" -> System.out.println("1");
            case "2" -> System.out.println("2");
            case "3" -> System.out.println("3");
            case "4" -> System.out.println("4");
            case "5" -> System.out.println("5");
        }
        System.out.print("\n");

    }
}
