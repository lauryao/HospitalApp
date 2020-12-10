package com.company.music;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Music {
    /**
     * To initiate a song creation
     * @param name of the music
     * @param author of the music
     * @param time, the duration of the music
     */
    public Music(String name, String author, String time){

        BufferedWriter myBfw = null;
        String path;

        try{
            path = "src/music/";
            myBfw = new BufferedWriter(new FileWriter(path+name+".txt"));
            myBfw.write("Music Name: "+name+"\n");
            myBfw.write("Author: "+author+"\n");
            myBfw.write("Duration: "+time+"\n");
            System.out.println("New Music added : " +name);

        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try{ if(myBfw != null) {
                    myBfw.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    /**
     * To see all music the user create
     * @return a File[] which contains all the music.txt
     */
    public static File[] allMusics(){
        return new File("src/music").listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
    }

    /**
     * Print all music in the directory
     * @throws FileNotFoundException if there no music
     */
    public static void seeAllMusics() throws FileNotFoundException {
        int i;
        File[] musics = allMusics();
        for(i=0;i<=musics.length-1;i++){
            readFile(musics[i]);
        }
    }

    /**
     * Will read the first line of a music fill, this line contains their name
     * @param filePath of the music that we need to read
     * @throws FileNotFoundException if there no file with that name
     */
    public static void readFile(File filePath) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        try {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to read the music");
        }
    }

    /**
     * To delete a music
     * @param filePath of the music we want to delete
     */
    public static void deleteFile(File filePath){
        try{
            Files.delete(Paths.get(String.valueOf(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Will search for a music in the directory, with the entry value of the user.
     * @param musiqueToSearch, a string the user give to search his music
     */
    public static ArrayList<File> searchMusic(String musiqueToSearch){
        ArrayList<File> result = new ArrayList<>();
        String currentName;
        File[] musics = allMusics();
        for(int i = 0; i<=musics.length-1;i++) {
            currentName = musics[i].getName();
            if (currentName.contains(musiqueToSearch)){
                System.out.println("Found '"+currentName+"'");
                result.add(musics[i]);
            }
        }
        return result;
    }
}
