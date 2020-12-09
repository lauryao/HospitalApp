package com.company;

import java.util.Scanner;

public class Direction{

    private String location;

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public Direction(){
        Scanner scanner = new Scanner(System.in);
        if (location == "nord") {
            System.out.println("Vous etes maintenant dans la direction Nord");
        }
        if (location == "sud"){
            System.out.println("Vous etes maintenant dans la direction Sud");
        }
        if (location == "ouest"){
            System.out.println("Vous etes maintenant dans la direction Ouest");
        }
        if (location == "est"){
            System.out.println("Vous etes maintenant dans la direction Est");
        }else {
            System.out.println("Cette destination n'existe pas. Veuillez reessayer.");
        }
    }
}
