package com.example.crud_bbdd;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.RoomDatabase;

public class Estructura_BBDD {
    @Entity
    public static class User {
        @PrimaryKey
        public int uid;

        @ColumnInfo(name = "first_name")
        public String firstName;

        @ColumnInfo(name = "last_name")
        public String lastName;
    }




    @Database(entities = {User.class}, version = 1)
    public abstract class DatosTrabajadores extends RoomDatabase {
        public abstract DataAccessObjects.UserDao userDao();
    }

}
