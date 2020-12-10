package com.company.Menu;


import java.util.Scanner;
import com.company.direction.BrickBuilding;
import com.company.direction.Forest;
import com.company.direction.Road;
import com.company.direction.Hill;
import com.company.direction.Valley;


public class GameMenu {

    public static void main(String[] args) {

        //Recuperation du nom taper par le joueur
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre nom -> ");
        String nomHero = scanner.nextLine();

        System.out.println("Bienvenu dans Colossal cave " + nomHero + ".");


        Road myRoad = new Road();
        myRoad.road();
        Forest myForest = new Forest();
        myForest.forest();
        Valley myValley = new Valley();
        myValley.valley();
        BrickBuilding myBrickBuilding = new BrickBuilding();
        myBrickBuilding.brickBuilding();
        Hill myHill = new Hill();
        myHill.hill();


    }
}
