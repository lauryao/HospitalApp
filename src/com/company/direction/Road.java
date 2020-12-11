package com.company.direction;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Road extends Place{

    @Override
    public void description() {
        System.out.println("Write down, where you want to go:\n" +
                "Forest, Valley, Hill or Brick building ->");
        System.out.println("Or 'quit' if you want to quit.");
        }

    @Override
    public Place chgDirection(String direction) {
        //Change the direction
        Place newPlace = null;
        switch (direction) {
            case "Forest" -> {newPlace = myForest;}
            case "Valley" -> {newPlace =myValley;}
            case "Brick building" -> {newPlace =myBrickBuilding;}
            case "Hill" -> {newPlace = myHill;}
            case "quit" -> System.exit(0);
            default -> printError();
        }
        return newPlace;
    }
}
