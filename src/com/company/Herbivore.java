package com.company;

public class Herbivore extends Animal{
    private String species;
    private String name;
    public Herbivore(String s, String n){
        super(n,s,"Herbivore");
    }
    public String toString(){
        return super.toString();
    }
}
