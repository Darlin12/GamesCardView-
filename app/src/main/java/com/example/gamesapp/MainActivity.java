package com.example.gamesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //1- Data
    private ArrayList<GameModal> gameList = new ArrayList<GameModal>();

    //2- RecyclerView
    RecyclerView recyclerView;

    //3- Objeto de la clase Myadapter
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asignar el valor del widget recycler view a la variable tipo recycler view creada anteriormente usando su ID
        recyclerView = findViewById(R.id.recyclerView);

        //Añadir los valores mediante el metoda add al array creado anteriormente (titulo, y portada)
        gameList.add(new GameModal("Horizon Chase", R.drawable.card1));
        gameList.add(new GameModal("PUBG", R.drawable.card2));
        gameList.add(new GameModal("Head Ball 2", R.drawable.card3));
        gameList.add(new GameModal("Hook on You", R.drawable.card4));
        gameList.add(new GameModal("Fifa 2022", R.drawable.card5));
        gameList.add(new GameModal("Fortnite", R.drawable.card6));



        adapter = new MyAdapter(this, gameList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}