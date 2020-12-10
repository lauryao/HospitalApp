package com.company.direction;

public class Valley extends Place{

    @Override
    public void description() {
        System.out.println("You're now in the middle of a Valley");
        System.out.println("You can return to the main road or go in the direction of the hill,");
        System.out.println("Write Road or Hill.");
    }

    @Override
    public Place chgDirection(String direction) {
        //Choix de la direction
        Place newPlace = null;
        switch (direction) {
            case "Road" -> {newPlace = myRoad;}
            case "Hill" -> {newPlace = myHill;}
            default -> printError();
        }
        return newPlace;
    }
}
