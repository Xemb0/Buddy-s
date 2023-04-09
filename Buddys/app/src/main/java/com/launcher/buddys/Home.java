package com.launcher.buddys;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Buddy> arrayList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //window feture for remove title bar
        arrayList = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler);
        arrayList.add(new Buddy(R.drawable.profile_picture,R.drawable.profile_picture, "Buddy","Rishikesh"));
        arrayList.add(new Buddy(R.drawable.profile_picture,R.drawable.profile_picture, "Buddy","Rishikesh"));
        arrayList.add(new Buddy(R.drawable.profile_picture,R.drawable.profile_picture, "Buddy","Rishikesh"));
        arrayList.add(new Buddy(R.drawable.profile_picture,R.drawable.profile_picture, "Buddy","Rishikesh"));
       arrayList.add(new Buddy(R.drawable.profile_picture,R.drawable.profile_picture, "Buddy","Rishikesh"));
        arrayList.add(new Buddy(R.drawable.profile_picture,R.drawable.profile_picture, "Buddy","Rishikesh"));
        arrayList.add(new Buddy(R.drawable.profile_picture,R.drawable.profile_picture, "Buddy","Rishikesh"));
       arrayList.add(new Buddy(R.drawable.profile_picture,R.drawable.profile_picture, "Buddy","Rishikesh"));
        arrayList.add(new Buddy(R.drawable.profile_picture,R.drawable.profile_picture, "Buddy","Rishikesh"));
        arrayList.add(new Buddy(R.drawable.profile_picture,R.drawable.profile_picture, "Buddy","Rishikesh"));
       arrayList.add(new Buddy(R.drawable.profile_picture,R.drawable.profile_picture, "Buddy","Rishikesh"));
        arrayList.add(new Buddy(R.drawable.profile_picture,R.drawable.profile_picture, "Buddy","Rishikesh"));
        arrayList.add(new Buddy(R.drawable.profile_picture,R.drawable.profile_picture, "Buddy","Rishikesh"));
       arrayList.add(new Buddy(R.drawable.profile_picture,R.drawable.profile_picture, "Buddy","Rishikesh"));
        arrayList.add(new Buddy(R.drawable.profile_picture,R.drawable.profile_picture, "Buddy","Rishikesh"));
        arrayList.add(new Buddy(R.drawable.profile_picture,R.drawable.profile_picture, "Buddy","Rishikesh"));
        RecyclerAdaptor recyclerAdaptor = new RecyclerAdaptor(arrayList);
        recyclerView.setAdapter(recyclerAdaptor);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    }
