package com.example.mybestproject;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserInfoDAO {

    @Query("SELECT * FROM user_infos")
    List<UserInfo> getAll();

    @Insert
    void insertUserInfo(UserInfo userInfo);
}
