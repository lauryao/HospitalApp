package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MenuMusic {
    public MenuMusic()  {
        boolean start = true;

        while(start) {
            System.out.print("""

                    What do you want to do?
                    1 - Song
                    2 - Playlist
                    3 - Exit
                    Selection:\s""");

            Scanner scan = new Scanner(System.in);
            String selectOption = scan.nextLine();

            switch ((selectOption)) {
                case "Song" -> switchSong();
                case "Playlist" -> System.out.println("2");
                case "Exit" -> start= false;
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
        boolean start = true;
        while (start) {
        Scanner scanSwitchSong = new Scanner(System.in);

        System.out.print("\nWhat do you want to do?"
                    + "\n1- Add a song"
                    + "\n2- Delete a song"
                    + "\n3- Listen a song"
                    + "\n4- Go back"
                    + "\n5- Exit"
                    + "\nSelection: ");
            
        String switchSong = scanSwitchSong.nextLine();
            switch ((switchSong)) {
                case "1" -> musicDescription();
                case "2" -> System.out.println("2");
                case "3" -> System.out.println("3");
                case "4" -> { start = false; }
                case "5" -> System.exit(0);
            }
        }
  }
                         
    public void switchPlaylist() {
        boolean start = true;
        while (start) {
        Scanner scanSwitchPlaylist = new Scanner(System.in);

        System.out.print("\nWhat do you want to do?"
                + "\n1- Add a playlist"
                + "\n2- Delete a playlist"
                + "\n3- Listen a playlist"
                + "\n4- Go back"
                + "\n5- Exit"
                + "\nSelection: ");
            
        String switchSong = scanSwitchPlaylist.nextLine();
            switch ((switchSong)) {
                case "1" -> System.out.println("1");
                case "2" -> System.out.println("2");
                case "3" -> System.out.println("3");
                case "4" -> { start = false; }
                case "5" -> System.exit(0);
             }
        }
    }
}
