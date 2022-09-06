package com.example;
import java.util.List;

public class Lion extends Animal implements Predator {
    boolean hasMane;
    int kittensCount;

    public Lion(String sex) throws Exception {
           if ("Самец".equals(sex)) {
            hasMane = true;
            kittensCount = 0;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
            kittensCount = 1;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
    public int getKittens() {
        return kittensCount;}
    public boolean doesHaveMane() {
        return hasMane;}
    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }
}

