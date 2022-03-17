package com.company;

public class Animal {

    private String species;
    private String name;
    private String type;

    public Animal(String n, String s, String t){
        name=n;
        species=s;
        type=t;
    }

    public String toString(){
        return name+" the "+ species+" is a "+type;
    }

}
