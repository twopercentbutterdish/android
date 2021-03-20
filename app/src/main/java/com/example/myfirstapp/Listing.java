package com.example.myfirstapp;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;

public class Listing {
    /**
     * Representation of {@code this}.
     */
    private Map.Entry<String, Queue<Copy>> game;
    /**
     *  Listing's price
     */
    private double price;
    /**
     *  Copies sold.
     */
    private int sold;
    /**
     * Constructor.
     */
    public Listing(String name, double cost){
        price = cost;
        Queue<Copy> copies = new ArrayDeque<>();
        game = new AbstractMap.SimpleEntry(name, copies);
    }
    /*
     * Methods.
     */
    // TO_DO
    // Add copy
    // Get quantity.
    // Change price.
    // Increment sold.
}
