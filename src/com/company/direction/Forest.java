package com.company.direction;

public class Forest extends Place implements ListPlace{

    @Override
    public void description() {
        System.out.println("You're now in direction of the Forest");
        System.out.println("You can return to the road: write Road ->");
    }

    @Override
    public Place chgDirection(String direction) {
        //Choix de la direction
        Place newPlace = null;
        switch (direction) {
            case "Road"-> {newPlace = myRoad;}
            default -> printError();
        }
        return newPlace;
    }
}
