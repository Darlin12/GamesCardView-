package com.example.gamesapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter <MyAdapter.ViewHolder> {

    //1- Data Source
    private Context context;
    private ArrayList<GameModal> gameList;


    //2- Constructor
    public MyAdapter(Context context, ArrayList<GameModal> gameList) {
        this.gameList = gameList;
        this.context = context;
    }


    //3- View Holder
    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView gameImg;
        private TextView gameTitle;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            gameImg = itemView.findViewById(R.id.cardviewImg);
            gameTitle = itemView.findViewById(R.id.textviewCard);



        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Creamos un nuevo view con el layout de creamos para el modelo de card, y le asignamos las clase parent a la que asignaremos ese layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_layout, parent, false);

        //Utilizamos el constructor creado de la clase viewHolder y le pasamos el view que acabamos de crear como parametro
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //En esta función estableceremos los datos que estaremos mostrando en el view, en este caso un titulo e imagen de los juegos
        //Usando los métodos creados en el model class, específicamente (los métodos get)
        GameModal Modal = gameList.get(position);
        holder.gameTitle.setText(Modal.getGameTitle());
        holder.gameImg.setImageResource(Modal.getGameImage());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "You Chose: "+gameList.get(position).getGameTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        //Para que el recycler view sepa cuantos elementos debe mostrar en la lista
        return gameList.size();
    }


}
