package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    };

 /*   public Animal() {
        getDescription();
    }*/

    public String getDescription(){
        String f;
        if(hasFur) f = "a";
        else f = "no";
        return "This animal is mostly" + color + "." +
                " It has" + numberOfPaws + "paws and" + f + "fur.";
    };

}
