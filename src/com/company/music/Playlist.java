package com.company.music;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Playlist {
    /**
     * To created a Playlist
     * @param name of the playlist
     */
    public Playlist(String name){
        File playlist = new File("/src/music/"+name+"/");

        if (!playlist.exists()) {
            playlist.mkdir();
            System.out.println ("Playlist created !");
        }
        else{
            System.out.println ("Already have a playlist with that name.");
        }
    }

    public void delPlaylist(String playlist){
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
     * @param playlist, the playlist to add the music
     */
    public void addSongToPlaylist(String music, String playlist) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(music));

            String newLocation = playlist+Paths.get(music).getFileName();
            BufferedWriter bw = new BufferedWriter(new FileWriter(newLocation));

            while (!br.readLine().equals("")){
                bw.write(br.readLine());
            }
            System.out.println("Add successfully !");
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

}
