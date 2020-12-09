package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Music {
    public Music(String name, String author, String time){

        BufferedWriter myBfw = null;
        String path = "";

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
    public static File[] allMusics(){
        return new File("src/music").listFiles();
    }

    public static void seeAllMusics() throws FileNotFoundException {
        int i;
        File[] musics = allMusics();
        for(i=0;i<=musics.length;i++){
            readFile(musics[i]);
        }
    }
    public static void readFile(File filePath) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        try {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void deleteFile(File filePath){
        try{
            Files.delete(Paths.get(String.valueOf(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList searchMusic(String musiqueToSearch){
        ArrayList result = new ArrayList();
        String currentName;
        File[] musics = allMusics();
        for(int i = 0; i<=musics.length-1;i++) {
            currentName = musics[i].getName();
            if (currentName.contains(musiqueToSearch)){
                result.add(currentName);
                System.out.println(result);
            }
        }
        return result;
    }
}