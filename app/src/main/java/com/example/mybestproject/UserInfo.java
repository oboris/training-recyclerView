package com.example.mybestproject;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_infos")
public class UserInfo {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String info;

    public UserInfo(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }
}
