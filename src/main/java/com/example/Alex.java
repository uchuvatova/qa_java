package com.example;

import java.util.List;

public class Alex extends Lion {

    public Alex(String sex) throws Exception {
        super("Самец");
    }
    @Override
    public int getKittens() {
        return kittensCount;}

    public List<String> getFriends() { return List.of("Марти", "Глория", "Мелман");}

    public String getPlaceOfLiving() { return "Нью-Йоркский зоопарк";}

    }