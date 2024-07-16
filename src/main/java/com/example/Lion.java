package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private Felines felines;

    public Lion(String sex,Felines felines) throws Exception {
        this.felines=felines;

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    //Feline feline = new Feline();

    public int getKittens() {
        return felines.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return felines.eatMeat();
    }
}
