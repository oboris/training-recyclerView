package com.example.mybestproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<UserInfo> userInfos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv1);

        LinearLayoutManager linearLayoutManager = new  LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), linearLayoutManager.getOrientation()));
        recyclerView.setAdapter(new UserInfoAdapter(userInfos));

        initData();
    }

    private void initData() {
        userInfos.add(new UserInfo("user1", "info1"));
        userInfos.add(new UserInfo("user2", "info2"));
        userInfos.add(new UserInfo("user3", "info3"));
        userInfos.add(new UserInfo("user4", "info4"));
        userInfos.add(new UserInfo("user5", "info5"));
        userInfos.add(new UserInfo("user6", "info6"));
        userInfos.add(new UserInfo("user7", "info7"));
    }
}