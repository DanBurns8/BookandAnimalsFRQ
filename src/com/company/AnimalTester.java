package com.company;

public class AnimalTester {
    public static void main(String[] args) {
        Animal Sean = new Animal("Sean","Lion","Carnivore");
        Herbivore Steve =  new Herbivore("Giraffe","Steve");
        Elephant David = new Elephant("David", 5.0);

        System.out.println(Sean);
        System.out.println(Steve);
        System.out.println(David);
    }
}
//    Sean the Lion is a Carnivore
//    Steve the Giraffe is a Herbivore
//    David the Elephant is a Herbivore with tusks 5.0 meters long.
