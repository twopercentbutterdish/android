package com.example.myfirstapp;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Listing {
    /**
     * Representation of {@code this}.
     */
    private Map.Entry<String, List<Double>> game;
    /**
     * Required list size.
     */
    private final int INITIAL_CAPACITY = 2;
    /*
     * Constructor.
     */
    public Listing(String name, double copyCount, double price){
        List stats = new ArrayList(INITIAL_CAPACITY);
        stats.add(0, copyCount);
        stats.add(1, price);
        game = new AbstractMap.SimpleEntry(name, stats);
    }


}
