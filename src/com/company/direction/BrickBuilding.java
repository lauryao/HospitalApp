package com.company.direction;

public class BrickBuilding extends Place implements ListPlace{

    @Override
    public void description() {
        System.out.println("You are nom in direction of Brick building.");
        System.out.println("You can return to the main room: Write 'Road' ->");
    }

    @Override
    public Place chgDirection(String direction) {
        //Choix de la direction
        Place newPlace = null;
        switch (direction) {
            case "Road" -> {newPlace =myRoad;}
            default -> printError();
        }
        return newPlace;
    }
}
