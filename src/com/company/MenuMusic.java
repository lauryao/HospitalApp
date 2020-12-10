package com.company;

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
                case "Song","1" -> switchSong();
                case "Playlist","2" -> switchPlaylist();
                case "Exit","3" -> start= false;
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

        new Music(name,author,time);

    }
    public void switchSong() {
        Scanner scanSwitchSong = new Scanner(System.in);
        boolean start = true;

        while(start) {
        System.out.print("""

                What do you want to do?
                1- Add a song
                2- Delete a song
                3- Listen a song
                4- Go back"
                5- Exit"
                Selection:\s""");
        String switchSong = scanSwitchSong.nextLine();
        switch ((switchSong)) {
            case "Add","1" -> musicDescription();
            case "Delete","2" -> System.out.println("2");
            case "Listen","3" -> listenSong();
            case "Back", "4" -> { start = false; }
            case "Exit","5" -> System.exit(0);
        }
        }
    }
    public void switchPlaylist() {
        Scanner scanSwitchPlaylist = new Scanner(System.in);
        boolean start = true;

        while(start) {
        System.out.print("""

                What do you want to do?
                1- Add a playlist
                2- Delete a playlist
                3- Listen a playlist
                4- Go back
                5- Exit
                Selection:\s""");
        String switchSong = scanSwitchPlaylist.nextLine();
        switch ((switchSong)) {
            case "4" -> start = false;
            case "5" -> System.exit(0);
        }
        }
    }
                         
     public void listenSong() {
           System.out.println("Choisissez une chanson à écouter :");
           Scanner listenSong = new Scanner(System.in);
           String searchMusic = listenSong.nextLine();
           System.out.println("Vous écoutez :");
           Music.searchMusic(searchMusic);
    }
}
