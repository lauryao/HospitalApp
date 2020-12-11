package com.company.Menu;

import com.company.music.Music;
import com.company.music.Playlist;

import java.io.*;
import java.util.Scanner;

public class MenuMusic {
     /**
     * Choose option between Song, playlist, Exit
     * boolean start for loop the program while true
     */
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
    /**
     * If the user choose song
     */
    public void switchSong() throws IOException{
        boolean start = true;

        while(start) {
            System.out.print("""
    
                    What do you want to do?
                    1- Add a song
                    2- Delete a song
                    3- Listen a song
                    4- Go back"
                    5- Exit"
                    \nSelection:\s""");
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
     /**
     * If the user choose playlist
     */
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
                    \nSelection:\s""");
            String switchSong = scan.nextLine();
            switch ((switchSong)) {
                case "1" -> addPlaylist();
                case "2" -> delPlaylist();
                case "4" -> start = false;
                case "5" -> System.exit(0);
            }
        }
    }

    private void delPlaylist() throws FileNotFoundException {
        System.out.println("Which playlist you want to delete ?");
        Playlist.seeAllPlaylist();
        String playlistToDel = scan.nextLine();
        Playlist.delete(playlistToDel);
    }

    private void addPlaylist() throws FileNotFoundException {
        System.out.println("The name of the new playlist :");
        Playlist playlist = new Playlist(scan.nextLine());
        boolean addSong = true;
        while (addSong){
            System.out.println("Select song you want to add into:");
            Music.seeAllMusics();
            System.out.println("\nOr quit");
            String choice = scan.nextLine();
            if (choice.equals("quit")){
                addSong = false;
            }
            else {
                playlist.addSongToPlaylist(choice);
            }
        }
    }

     /**
     * To listen a song
     * "path" is th path of the files
     * existingSong to read the .txt files
     */
    public void listenSong() throws IOException {
        String path;
        path = "src/music/";
        String line;
        
        System.out.println("Choose a song to listen :");

        Music.seeAllMusics();
        System.out.print("""
           \nSelection:\s""");

        String searchMusic = scan.nextLine();
        BufferedReader existingSong = new BufferedReader(new FileReader(path + searchMusic + ".txt"));

        System.out.println("\nYour listening to :\n");
        while (true) {
            while((line = existingSong.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("\nWrite <Stop> to stop listening");
            String listeningMusic = scan.nextLine();
            if ("Stop".equals((listeningMusic))) { break; }
            else if ("Next".equals((listeningMusic))) { nextSong();}
            else if ("Previous".equals((listeningMusic))) { previousSong();}
        }
    }
     /**
     * If the user choose to delete a song
     */
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
     /**
     * To add a song
     */                   
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
     /**
     * To navigate to the next song
     */                     
    public void nextSong() throws FileNotFoundException {
        Music.allMusics();
        int i = 0;
        File[] musics = Music.allMusics();
        Music.readFile(musics[i + 1]);
    }
    /**
     * To navigate to the previous song
     */
    public void previousSong() throws FileNotFoundException {
        Music.allMusics();
        int i = 0;
        File[] musics = Music.allMusics();
        Music.readFile(musics[i - 1]);
    }               
}
