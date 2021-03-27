package com.example.myfirstapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

@Dao
public interface ListingDao {
    @Insert
    void insertAll(Listing... listings);

    @Delete
    void delete(Listing listing);

    @Query("SELECT * FROM Listing")
    List<Copy> getAll();

    @Transaction
    @Query("SELECT * FROM Listing")
    public List<ListingWithCopies> getListingWithCopies();
}
