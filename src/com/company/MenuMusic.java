package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MenuMusic {
    public MenuMusic()  {
        boolean start = true;

        while(start) {
            System.out.print("\nWhat do you want to do?"
                    + "\nSong"
                    + "\nPlaylist"
                    + "\nExit"
                    + "\nSelection: ");

            Scanner scan = new Scanner(System.in);
            String selectOption = scan.nextLine();

            switch ((selectOption)) {
                case "Song" -> switchSong();
                case "Playlist" -> System.out.println("3");
                case "Exit" -> System.exit(0);
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
        public void switchSong() {

        Scanner scanSwitchSong = new Scanner(System.in);

            System.out.print("\nWhat do you want to do?"
                    + "\n1- Add a song"
                    + "\n2- Delete a song"
                    + "\n3- Listen a song"
                    + "\n4- Exit"
                    + "\nSelection: ");
            String switchSong = scanSwitchSong.nextLine();
            switch ((switchSong)) {
                case "1" -> musicDescription();
                case "2" -> System.out.println("2");
                case "3" -> System.out.println("3");
                case "4" -> System.exit(0);
            }
        }
}
