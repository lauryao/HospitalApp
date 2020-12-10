package com.company.direction;

import java.util.Scanner;


public abstract class Place {

    Scanner scanner = new Scanner(System.in);

    public abstract void description();
    public abstract Place chgDirection(String direction);

    public static void printError(){
        System.out.println("Error. You're not allowed to do that.");
    }
}
