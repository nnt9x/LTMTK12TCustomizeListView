package com.example.ltmtk12tcustomizelistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ltmtk12tcustomizelistview.R;
import com.example.ltmtk12tcustomizelistview.model.Film;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private List<Film> dataSource;

    public MyAdapter(Context context, List<Film> dataSource) {
        this.context = context;
        this.dataSource = dataSource;
    }

    @Override
    public int getCount() {
        return dataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return dataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // Bind cho itemview
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_film, viewGroup, false);
        }
        // Bind id cho
        ImageView imageView = view.findViewById(R.id.imgItemFilm);
        TextView tvName = view.findViewById(R.id.tvItemFilmName);
        TextView tvScore = view.findViewById(R.id.tvItemFilmScore);
        TextView tvDescription = view.findViewById(R.id.tvItemFilmDescription);

        // View i ung du lieu i
        Film film = dataSource.get(i);
        tvName.setText(film.getName());
        tvScore.setText("IMDb: " + film.getScore());
        tvDescription.setText(film.getDescription());

        Glide.with(context).load(film.getImageURL()).into(imageView);

        return view;
    }
}
