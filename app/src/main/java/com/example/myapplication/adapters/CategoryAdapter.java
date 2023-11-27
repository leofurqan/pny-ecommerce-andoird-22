package com.example.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.data.Categories;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private ArrayList<Categories> categories;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgCategory;
        private TextView txtCategory;

        public ViewHolder(View view) {
            super(view);

            imgCategory = view.findViewById(R.id.img_category);
            txtCategory = view.findViewById(R.id.txt_category);
        }

        public ImageView getImgCategory() {
            return imgCategory;
        }

        public TextView getTxtCategory() {
            return txtCategory;
        }
    }

    public CategoryAdapter(ArrayList<Categories> c, Context context) {
        this.categories = c;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_item_category, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Categories category = categories.get(position);

        holder.getImgCategory().setImageDrawable(ContextCompat.getDrawable(context, category.getImage()));
        holder.getTxtCategory().setText(category.getName());
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}
