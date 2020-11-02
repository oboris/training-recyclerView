package com.example.mybestproject;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserInfoAdapter extends RecyclerView.Adapter<UserInfoAdapter.UserInfoHolder> {
    List<UserInfo> userInfos;

    public UserInfoAdapter(List<UserInfo> userInfos) {
        this.userInfos = userInfos;
    }

    @NonNull
    @Override
    public UserInfoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_info_item,parent, false);
        return new UserInfoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserInfoHolder holder, int position) {
        holder.userName.setText(userInfos.get(position).getName());
        holder.userName.setTextColor(Color.RED);
        holder.userInfo.setText(userInfos.get(position).getInfo());
    }

    @Override
    public int getItemCount() {
        return userInfos.size();
    }

    public class UserInfoHolder extends RecyclerView.ViewHolder {
        public TextView userName;
        public TextView userInfo;
        public UserInfoHolder(@NonNull View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.tvUserName);
            userInfo = itemView.findViewById(R.id.tvUserInfo);
        }
    }
}
