package ru.bootcode.smddatasheet;

import androidx.room.*;
import java.util.List;

import io.reactivex.Flowable;
//import io.reactivex.rxjava3.core.Flowable;


@Dao
public interface ComponentDAO {
    @Query("SELECT id, name, body, label,  prod, func, datasheet, favorite, islocal FROM components")
    public abstract Flowable<List<Component>> getAll();

    @Query("SELECT id, name, body, label,  prod, func, datasheet, favorite, islocal FROM components WHERE id = :id")
    Component getById(long id);

    @Insert
    public abstract void insert(Component employee);

    @Update
    void update(Component employee);

    @Delete
    void delete(Component employee);
}
