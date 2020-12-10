package com.company.music;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Playlist {

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
    public void addSongToPlaylist(String music, String playlist) {
        try {
            Files.move(Paths.get(music), Paths.get(playlist));
            System.out.println("Add successfully !");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Gone Wrong, Music or Playlist does not exist.");
        }
    }
    public void delSongFromPlaylist(String music, String playlist) {
        try {
            Files.move(Paths.get(playlist), Paths.get(music));
            System.out.println("Delete Successfully !");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Gone Wrong, Music or Playlist does not exist.");
        }
    }

}
