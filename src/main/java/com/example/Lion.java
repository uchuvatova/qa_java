package com.example;

import java.util.List;

public class Lion extends Animal implements Predator {

    boolean hasMane;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    //Predator predator;

    //public Lion (Feline feline) {
        //this.predator = feline;}

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }
}

