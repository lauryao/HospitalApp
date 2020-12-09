package com.company;

import java.util.Scanner;

public class Menu {
    public Menu() {
        boolean start = true;
        
        while(start) {
            System.out.print("\nQue voulez faire?"
                    + "\n1- Ajouter une chanson"
                    + "\n2- Voir une playlist"
                    + "\n3- Supprimer une chanson"
                    + "\n4- Supprimer une playlist"
                    + "\n5- Quitter"
                    + "\nSéléction: ");

            Scanner scan = new Scanner(System.in);
            String selectOption = scan.nextLine();
            switch ((Scanner)) {
                case "1" -> musicDescription();
                case "2" -> System.out.println("2");
                case "3" -> System.out.println("3");
                case "4" -> System.out.println("4");
                case "5" -> System.exit(0);
        }
        System.out.print("\n");
        }
    }
        public void musicDescription(){
        Scanner scanName = new Scanner(System.in);
        System.out.println("Enter the music name : ");
        String name = scanName.nextLine();

        Scanner scanAuthor = new Scanner(System.in);
        System.out.println("Enter the music author : ");
        String author = scanAuthor.nextLine();

        Scanner scanTime = new Scanner(System.in);
        System.out.println("Enter the music duration : ");
        String time= scanTime.nextLine();

        Music music = new Music(name,author,time);
    }
}
