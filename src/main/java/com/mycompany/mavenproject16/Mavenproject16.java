package com.mycompany.mavenproject16;
public class Mavenproject16 {

    static void printBirds(Cage<? extends Bird> cage) {
        for (int i = 0; i < cage.items.size(); i++) {
            Bird b = cage.items.get(i);
            System.out.println("Bird: " + b.name);
        }
    }

    static void addCanary(Cage<? super Canary> cage) {
        cage.add(new Canary());
    }

    public static void main(String[] args) {
        BirdCage<Canary> canaryCage = new BirdCage<>();
        canaryCage.add(new Canary());

        BirdCage<Bird> birdCage = new BirdCage<>();
        birdCage.add(new Zebra());

        addCanary(birdCage);

        printBirds(canaryCage);
        printBirds(birdCage);

        birdCage.makeAllSing();
    }
}