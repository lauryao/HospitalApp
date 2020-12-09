package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Music {
    public Music(String name, String author, String time){

        BufferedWriter myBfw = null;

        try{
            myBfw = new BufferedWriter(new FileWriter(name+".txt"));
            myBfw.write("Music Name: "+name+"\n");
            myBfw.write("Author: "+author+"\n");
            myBfw.write("Duration: "+time+"\n");
            System.out.println("New Music added : " +name);

        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                if(myBfw != null) {
                    myBfw.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
