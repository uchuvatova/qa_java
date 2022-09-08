package com.example;

import java.util.List;

public class Alex extends Lion {

    private  Feline feline;

    public Alex(Feline feline) throws Exception {
        super("Самец",feline);
    }
    @Override
    public int getKittens() {
        return 0;}

    public List<String> getFriends() { return List.of("Марти", "Глория", "Мелман");}

    public String getPlaceOfLiving() { return "Нью-Йоркский зоопарк";}
}
