package com.example.tugas3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterMovie extends RecyclerView.Adapter<AdapterMovie.ViewHolder> {

    private Context context;
    private ArrayList<MovieModel> movieModel;

    public AdapterMovie(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemrow = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlist_movie, parent, false);
        return new ViewHolder(itemrow);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(context).load(getMovieModels().get(position).gambarfilm).into(holder.gambar);
        holder.judul.setText(getMovieModels().get(position).judulfilm);
        holder.btn_Sinopsis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Sinopsis = new Intent(context, Sinopsis.class);
                Sinopsis.putExtra("sinopsis", getMovieModels().get(position).getSinopsis());
                Sinopsis.putExtra("gambar", getMovieModels().get(position).getGambarfilm());
                Sinopsis.putExtra("judul", getMovieModels().get(position).getJudulfilm());
                context.startActivity(Sinopsis);
            }
        });
        holder.btn_Share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, getMovieModels().get(position).getJudulfilm());
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                context.startActivity(shareIntent);
            }//https://developer.android.com/training/sharing/send?hl=id#java
        });
    }

    @Override
    public int getItemCount() {
        return getMovieModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView judul;
        private ImageView gambar;
        private Button btn_Share, btn_Sinopsis;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.text);
            gambar = itemView.findViewById(R.id.img);
            btn_Share = itemView.findViewById(R.id.btn_share);
            btn_Sinopsis = itemView.findViewById(R.id.btn_sinopsis);
        }
    }

    public void setMovieModels(ArrayList<MovieModel> movieModels) {
        this.movieModel = movieModels;
    }

    public ArrayList<MovieModel>    getMovieModels() {
        return movieModel;
    }
}
