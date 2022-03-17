package com.company;

public class Elephant extends Herbivore {
    private String name;
    private Double length;

    public Elephant(String n, Double l){
        super("Elephant",n);
        length=l;
    }
    public String toString(){
        return super.toString() +" with tusks "+length+" meters long.";
    }
}
