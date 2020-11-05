package com.example.mybestproject;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {UserInfo.class}, version = 2, exportSchema = false)
public abstract class UserInfoDB extends RoomDatabase {

        public abstract UserInfoDAO userDao();

        private static UserInfoDB instance;

        public static UserInfoDB getDB(Context context){
            if (instance ==null){
                instance = Room.databaseBuilder(context, UserInfoDB.class, "user_info_db")
                        .fallbackToDestructiveMigration().build();
            }
            return instance;
        }
}
