package com.epam;

import java.util.ArrayList;

public class Aquarium {
    private int id = 0;
    private ArrayList<Fish> listOfFishes = new ArrayList<Fish>();

    public Aquarium() {
    }

    public void seeAllFishes() {
        for (Fish listOfFish : listOfFishes) {
            System.out.println(listOfFish);
        }
    }
    public Fish getFishById(int id){
        for (Fish fish : listOfFishes) {
            if (fish.getId()==id)
                return fish;
        }
        return new Fish();
    }

    public void addFish(Fish fish) {
        listOfFishes.add(fish);
        fish.setId(increaseId());
    }

    private int increaseId(){
        return id++;
    }

    public void killFish(Fish fish){
        listOfFishes.remove(fish);
    }


}
