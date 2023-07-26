package fr.doranco.projetfinal.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import fr.doranco.projetfinal.R;

public class PaysRecycleViewAdapter {
    protected  class PaysViewHolder extends RecyclerView.ViewHolder{

         public ImageView imageView;
         public TextView textView;
        public PaysViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewRecyclerViewItemPays);
            textView = itemView.findViewById(R.id.textViewRecyclerViewItemPays);
        }
    }
}
