package com.example.myfirstapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface CopyDao {
    @Insert
    void insertAll(Copy... copies);

    @Delete
    void delete(Copy copy);

    @Query("SELECT * FROM copies")
    List<Copy> getAll();
}
