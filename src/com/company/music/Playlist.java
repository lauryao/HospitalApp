package com.company.music;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Playlist {
    File playlist;
    /**
     * To create a Playlist
     * @param name of the playlist
     */
    public Playlist(String name){
        playlist = new File("src/music/"+name+"_/");
        if (!playlist.exists()) {
            playlist.mkdir();
            System.out.println ("Playlist created !");
        }
        else{
            System.out.println ("Already have a playlist with that name.");
        }
    }

    /**
     * delete a playlist
     * @param playlist to delete
     */
    public static void delete(String playlist){
        try {
            Files.delete(Paths.get(playlist));
            System.out.println("Delete Successfully !");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("That playlist name does not exist.");
        }
    }

    /**
     * Copying a music file to a sub directory which represents the playlist
     * @param music, the music to copy
     */
    public void addSongToPlaylist(String music) {
        try {
            //Will search for the music the user write to
            ArrayList<File> musicFound = Music.searchMusic(music);

            //If it found something it will the song in the sub directory
            if (!musicFound.isEmpty()){

                //because musicFound is an ArrayList which countains Object, we have to transform them
                BufferedReader br = new BufferedReader(new FileReader(musicFound.get(0)));
                String pathPlaylist = playlist.toString();

                String stringValueMusic = String.valueOf(musicFound.get(0));
                String newLocation = pathPlaylist+"/"+ Paths.get(stringValueMusic).getFileName();

                System.out.println("New Location created : "+ newLocation);
                BufferedWriter bw = new BufferedWriter(new FileWriter(newLocation));

                String line;

                //The step where we write in the new file the same content as the original one
                do {
                    line = br.readLine();
                    bw.write(line+"\n");
                } while (line != null);
                bw.close();
                System.out.println("Add successfully !");
            }
            else{
                System.out.println("No music Found");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Gone Wrong, Music or Playlist does not exist.");
        }
    }

    /**
     * Delete a music from a Playlist
     * @param music, the music to delete
     */
    public void delSongFromPlaylist(String music) {
        try {
            Files.delete(Paths.get(music));
            System.out.println("Delete Successfully !");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Gone Wrong, Music or Playlist does not exist.");
        }
    }
    public static File[] allPlaylist(){
        return new File("src/music").listFiles((dir, name) -> name.toLowerCase().endsWith("_"));
    }
    public static void seeAllPlaylist(){
        int i;
        File[] playlist_ = allPlaylist();
        for(i=0;i<=playlist_.length-1;i++){
            System.out.println(playlist_[i].getName());
        }
    }

}
