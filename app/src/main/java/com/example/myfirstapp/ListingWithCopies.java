package com.example.myfirstapp;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.Queue;


public class ListingWithCopies {
    @Embedded public Listing listing;
    @Relation(
            parentColumn = "name",
            entityColumn = "parentListing"
    )
    public Queue<Copy> copies;
}
