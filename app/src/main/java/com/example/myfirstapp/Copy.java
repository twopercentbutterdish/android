package com.example.myfirstapp;

import java.time.Clock;
import java.time.Instant;

public class Copy {
    /**
     *  Field representing copy's completeness: 1 = complete, 0 = incomplete.
     */
    private int complete;
    /**
     *  Field tracking the time from copy's creation to purchase.
     */
    private Clock time;
    /**
     *  Time stamp of copy's creation.
     */
    private Instant creation;
    /**
     *  Time stamp of copy's purchase.
     */
    private Instant purchase;
    /**
     *  Amount of time copy spent as listed.
     */
    private String lifespan;
}
