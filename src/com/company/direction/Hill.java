package com.company.direction;

public class Hill extends Place implements ListPlace{

    @Override
    public void description() {
        System.out.println("You're now on a Hill");
        System.out.println("To go in direction of the forest: write 'Forest' ->");
    }

    @Override
    public Place chgDirection(String direction) {
        //Choix de la direction
        Place newPlace = null;
        switch (direction) {
            case "Forest" -> {newPlace = myForest;}
            default -> printError();
        }
        return newPlace;
    }
}
