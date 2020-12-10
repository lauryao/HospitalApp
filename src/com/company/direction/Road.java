package com.company.direction;

public class Road extends Place implements ListPlace{

    @Override
    public void description() {
        System.out.println("Write down, where you want to go:\n" +
                "Forest, Valley, Hill or Brick building ->");
    }

    @Override
    public Place chgDirection(String direction) {
        //Choix de la direction
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
