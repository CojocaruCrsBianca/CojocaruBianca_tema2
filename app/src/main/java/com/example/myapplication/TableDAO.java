package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TableDAO {
    @Query("SELECT * FROM TableEntity")
    List<TableEntity> getAll();
    @Query("SELECT * FROM TableEntity WHERE id IN (:userIds)")
    List<TableEntity> loadAllByIds(int[] userIds);
    @Query("SELECT * FROM TableEntity WHERE nume LIKE :first AND " +
            "prenume LIKE :last LIMIT 1")
    TableEntity findByName(String first, String last);
    @Insert
    void insertAll(TableEntity... users);
    @Delete
    void delete(TableEntity user);
}
