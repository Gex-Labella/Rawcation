package com.example.chat_app.Fragments.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chat_app.Models.CallInfo;
import com.example.chat_app.Models.StatusInfo;
import com.example.chat_app.R;
import com.google.android.material.textview.MaterialTextView;

import java.util.List;

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.CallViewHolder> {

    List<CallInfo> statusInfoList;

    public CallAdapter(List<CallInfo> statusInfoList) {
        this.statusInfoList = statusInfoList;
    }

    @NonNull
    @Override
    public CallAdapter.CallViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_call, parent, false);
        return new CallAdapter.CallViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CallAdapter.CallViewHolder holder, int position) {

        CallInfo statusInfo = statusInfoList.get(position);

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

    public class CallViewHolder extends RecyclerView.ViewHolder{

        private ImageView user_img;
        private MaterialTextView user_name, status_time;

        public CallViewHolder(@NonNull View itemView) {
            super(itemView);

            user_img = itemView.findViewById(R.id.user_img);
            user_name = itemView.findViewById(R.id.user_name);
            status_time = itemView.findViewById(R.id.status_time);

        }
    }
}
