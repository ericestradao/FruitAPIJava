package com.example.user.fruitsapijava.View;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.user.fruitsapijava.R;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView tv_type;

    public ViewHolder(View fruitView) {
        super(fruitView);
        tv_type = fruitView.findViewById(R.id.tv_type);
    }
}
