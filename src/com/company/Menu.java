package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Menu {
    public Menu() throws FileNotFoundException {
        boolean start = true;
        
        while(start) {
            System.out.print("\nWhat do you want to do?"
                    + "\n1- Add a song"
                    + "\n2- View a playlist"
                    + "\n3- Delete a song"
                    + "\n4- Delete a playlist"
                    + "\n5- Leave"
                    + "\nSelection: ");

            Scanner scan = new Scanner(System.in);
            String selectOption = scan.nextLine();
            
            switch ((selectOption)) {
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
