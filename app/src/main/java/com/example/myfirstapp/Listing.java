package com.example.myfirstapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
@Entity(tableName = "listings")
public class Listing {
    @PrimaryKey
    public String name;
}
