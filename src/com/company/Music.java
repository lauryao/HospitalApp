package com.company;

import java.io.*;

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
    public static void searchMusic() throws FileNotFoundException {
        int i;
        File[] musics = new File("src/music").listFiles();
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
}