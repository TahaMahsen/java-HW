package com.mycompany.mavenproject16;
public class BirdCage<T extends Bird> extends Cage<T>{
    void makeAllSing() {
        for (int i = 0; i < items.size(); i++) {
            T b = items.get(i);
            b.Sing();
        }
    }
}
    
