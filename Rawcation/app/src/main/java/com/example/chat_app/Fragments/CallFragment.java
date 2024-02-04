package com.example.chat_app.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chat_app.Fragments.Adapter.CallAdapter;
import com.example.chat_app.Fragments.Adapter.StatusAdapter;
import com.example.chat_app.Models.CallInfo;
import com.example.chat_app.Models.StatusInfo;
import com.example.chat_app.R;

import java.util.ArrayList;
import java.util.List;


public class CallFragment extends Fragment {

    private RecyclerView rec_status;

    public CallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_call, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rec_status = view.findViewById(R.id.rec_status);

        addCallHistory();
    }

    private void addCallHistory(){
        List<CallInfo> list = new ArrayList<>();
        list.add(new CallInfo(R.drawable.icons8_user, "Wayne", "12:23pm"));
        list.add(new CallInfo(R.drawable.icons8_user, "Alex", "01:23pm"));
        list.add(new CallInfo(R.drawable.capturdff, "Rooney", "04:23pm"));
        list.add(new CallInfo(R.drawable.icons8_user, "Chelsea", "10:53pm"));
        list.add(new CallInfo(R.drawable.icons8_user, "Wayne", "12:23pm"));
        list.add(new CallInfo(R.drawable.unnamed, "Manchester", "08:20am"));


        CallAdapter statusAdapter = new CallAdapter(list);
        rec_status.setAdapter(statusAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        rec_status.setLayoutManager(layoutManager);
    }
}