package com.mycompany.mavenproject16;
import java.util.ArrayList;
public class Cage<T> {


    ArrayList<T> items = new ArrayList<>();

    void add(T item) {
        items.add(item);
    }
}

