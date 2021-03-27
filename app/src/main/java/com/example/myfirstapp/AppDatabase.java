package com.example.myfirstapp;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database( entities = {Listing.class, Copy.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ListingDao listingDao();

    public abstract CopyDao copyDao();

    public static AppDatabase INSTANCE;

    public static AppDatabase getDb(Context context) {
        if (INSTANCE == null) {
            AppDatabase tempInstance = Room.databaseBuilder(
                    context,
                    AppDatabase.class,
                    "inventory-database"
            ).build();
            INSTANCE = tempInstance;
        }
        return INSTANCE;
    }
}