package com.example.user.fruitsapijava.View;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.fruitsapijava.FruitInformation;
import com.example.user.fruitsapijava.MainActivity;
import com.example.user.fruitsapijava.Model.FruitPojo;
import com.example.user.fruitsapijava.R;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    FruitPojo listFruit;
    Context context;

    TextView tv_price;
    TextView tv_type;
    Integer price;
    Integer weigth;

    final String TAG = MainActivity.class.getSimpleName();

    public Adapter(FruitPojo listFruit, Context context){
        this.listFruit = listFruit;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_fruit, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, int i) {
        tv_type.setText(listFruit.getFruit().get(i).getType());
    }


    @Override
    public int getItemCount() {
        return listFruit.getFruit().size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_type = itemView.findViewById(R.id.tv_type);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(v.getContext(), FruitInformation.class);
                    intent.putExtra("type", listFruit.getFruit().get(getAdapterPosition()).getType());
                    intent.putExtra("price", listFruit.getFruit().get(getAdapterPosition()).getPrice());
                    intent.putExtra("weight", listFruit.getFruit().get(getAdapterPosition()).getWeight());
                    v.getContext().startActivity(intent);
                }
            });
        }
    }
}
