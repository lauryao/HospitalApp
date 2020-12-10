package com.company.Menu;

import com.company.music.Music;
import com.company.music.Playlist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MenuMusic {
    Scanner scan = new Scanner(System.in);
    public MenuMusic() throws IOException {
        boolean start = true;

        while(start) {
            System.out.print("""

                    What do you want to do?
                    1 - Song
                    2 - Playlist
                    3 - Exit
                    Selection:\s""");

            String selectOption = scan.nextLine();

            switch ((selectOption)) {
                case "Song","1" -> switchSong();
                case "Playlist","2" -> switchPlaylist();
                case "Exit","3" -> start= false;
            }
            System.out.print("\n");
        }
    }

    public void switchSong() throws IOException {
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
        String switchSong = scan.nextLine();
        switch ((switchSong)) {
            case "Add","1" -> musicDescription();
            case "Delete","2" -> deleteSong();
            case "Listen","3" -> listenSong();
            case "Back", "4" -> start = false;
            case "Exit","5" -> System.exit(0);
        }
        }
    }
    public void switchPlaylist() throws FileNotFoundException {
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
        String switchSong = scan.nextLine();
        switch ((switchSong)) {
            case "1" -> addPlaylist();
            case "4" -> start = false;
            case "5" -> System.exit(0);
        }
        }
    }

    private void addPlaylist() throws FileNotFoundException {
        System.out.println("The name of the new playlist :");
        Playlist playlist = new Playlist(scan.nextLine());
        System.out.println("Select songs you want to add :");
        Music.seeAllMusics();

        playlist.addSongToPlaylist(scan.nextLine());

    }

    public void listenSong() throws IOException {
        String path;
        path = "src/music/";
        String line;
        
        System.out.println("Choose a song to listen :");

        Music.seeAllMusics();
        System.out.print("""
           Selection:\s""");

        String searchMusic = scan.nextLine();
        BufferedReader existingSong = new BufferedReader(new FileReader(path + searchMusic + ".txt"));

        while (true) {
            System.out.println("Your listening to");
            while((line = existingSong.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Write <Stop> to stop listening");
            String listeningMusic = scan.nextLine();
            if (listeningMusic.equals("Stop")) {
                break;
            }
        }
    }
   
     public void deleteSong() throws FileNotFoundException {
        String path;
        path = "src/music/";

        System.out.println("Choose a song to delete :");
        Music.seeAllMusics();
        System.out.print("""
                Selection:\s""");
        Scanner delete = new Scanner(System.in);
        String deleteSong = delete.nextLine();

        Music.deleteFile(new File(path + deleteSong + ".txt"));
        System.out.println("The song " + deleteSong + "has been deleted");

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
                         
}
