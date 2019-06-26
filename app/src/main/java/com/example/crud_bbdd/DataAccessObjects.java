package com.example.crud_bbdd;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

public interface DataAccessObjects {

    @Dao
    public interface UserDao {
        @Query("SELECT * FROM User")
        List<Estructura_BBDD.User> getAll();

        @Query("SELECT * FROM User WHERE uid IN (:userIds)")
        List<Estructura_BBDD.User> loadAllByIds(int[] userIds);

        @Query("SELECT * FROM User WHERE first_name LIKE :first AND " +
                "last_name LIKE :last LIMIT 1")
        Estructura_BBDD.User findByName(String first, String last);

        @Insert
        void insert (Estructura_BBDD.User user);

        @Update
        public void updateUsers(Estructura_BBDD.User user);

        @Delete
        void delete(Estructura_BBDD.User user);

    }
}
