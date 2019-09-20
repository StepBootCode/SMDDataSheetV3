package ru.bootcode.smddatasheet;

import androidx.room.*;

@Database(entities = {Component.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ComponentDAO componentDAO();
}