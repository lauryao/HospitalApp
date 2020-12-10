package com.company.direction;

import java.util.Scanner;

public class Place {
    Road myRoad = new Road();
    Forest myForest = new Forest();
    Valley myValley = new Valley();
    BrickBuilding myBrickBuilding = new BrickBuilding();
    Hill myHill = new Hill();

    Scanner scanner = new Scanner(System.in);

    public static void printError(){
        System.out.println("Error. You're not allowed to do that.");
    }
}
