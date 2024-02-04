package com.example.chat_app.Fragments.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chat_app.Models.StatusInfo;
import com.example.chat_app.R;
import com.google.android.material.textview.MaterialTextView;

public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.StatusViewHolder> {

    List<StatusInfo> statusInfoList;

    public StatusAdapter(List<StatusInfo> statusInfoList) {
        this.statusInfoList = statusInfoList;
    }

    @NonNull
    @Override
    public StatusAdapter.StatusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_status, parent, false);
        return new StatusAdapter.StatusViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusAdapter.StatusViewHolder holder, int position) {

        StatusInfo statusInfo = statusInfoList.get(position);

        try {

//               holder.user_img.setImageURI(statusInfo.getImgUrl());
               holder.user_name.setText(statusInfo.getName());
               holder.status_time.setText(statusInfo.getsTime());

        }catch (NullPointerException e){
            e.toString();
        }
    }

    @Override
    public int getItemCount() {
        return statusInfoList.size();
    }

    public class StatusViewHolder extends RecyclerView.ViewHolder{

        private ImageView user_img;
        private MaterialTextView user_name, status_time;

        public StatusViewHolder(@NonNull View itemView) {
            super(itemView);

            user_img = itemView.findViewById(R.id.user_img);
            user_name = itemView.findViewById(R.id.user_name);
            status_time = itemView.findViewById(R.id.status_time);

        }
    }
}
