package com.company.direction;

public class Place {
    Road myRoad = new Road();
    Forest myForest = new Forest();
    Valley myValley = new Valley();
    BrickBuilding myBrickBuilding = new BrickBuilding();
    Hill myHill = new Hill();

    public static void printError(){
        System.out.println("Error. You're not allowed to do that.");
    }
}
