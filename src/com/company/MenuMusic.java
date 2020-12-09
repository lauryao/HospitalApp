package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MenuMusic {
    public MenuMusic()  {
        boolean start = true;

        while(start) {
            System.out.print("""
                    
                    
                    What do you want to do?
                    1- Add a song
                    2- View a playlist
                    3- Delete a song
                    4- Delete a playlist
                    5- Exit
                    Selection:\s""");

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

    public void musicDescription() {
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
