package com.epam;

import java.util.ArrayList;

public class Aquarium {
    private static int id = 0;
    private ArrayList<Fish> listOfFishes = new ArrayList<Fish>();

    public Aquarium() {
    }

    public void seeAllFishes() {
        for (Fish listOfFish : listOfFishes) {
            System.out.println(listOfFish);
        }
    }

    public void addFish(Fish fish) {
        listOfFishes.add(fish);
        fish.setId(increaseId());
    }

    private static int increaseId(){
        return id++;
    }

    public void killFish(Fish fish){
        listOfFishes.remove(fish);
    }


}
