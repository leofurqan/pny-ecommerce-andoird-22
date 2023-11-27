package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.adapters.CategoryAdapter;
import com.example.myapplication.data.Categories;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private ArrayList<Categories> categories;
    RecyclerView rvCategory;
    CategoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        categories = new ArrayList<>();
        categories.add(new Categories(R.drawable.dashboard, "All"));
        categories.add(new Categories(R.drawable.tshirt, "Clothing"));
        categories.add(new Categories(R.drawable.briefcase, "Bags"));
        categories.add(new Categories(R.drawable.mouse, "Mouse"));
        categories.add(new Categories(R.drawable.ring, "Jewelry"));
        categories.add(new Categories(R.drawable.shoes, "Footwear"));
        categories.add(new Categories(R.drawable.sunglasses, "Glasses"));
        categories.add(new Categories(R.drawable.dashboard, "All"));
        categories.add(new Categories(R.drawable.tshirt, "Clothing"));
        categories.add(new Categories(R.drawable.briefcase, "Bags"));
        categories.add(new Categories(R.drawable.mouse, "Mouse"));
        categories.add(new Categories(R.drawable.ring, "Jewelry"));
        categories.add(new Categories(R.drawable.shoes, "Footwear"));
        categories.add(new Categories(R.drawable.sunglasses, "Glasses"));
        categories.add(new Categories(R.drawable.dashboard, "All"));
        categories.add(new Categories(R.drawable.tshirt, "Clothing"));
        categories.add(new Categories(R.drawable.briefcase, "Bags"));
        categories.add(new Categories(R.drawable.mouse, "Mouse"));
        categories.add(new Categories(R.drawable.ring, "Jewelry"));
        categories.add(new Categories(R.drawable.shoes, "Footwear"));
        categories.add(new Categories(R.drawable.sunglasses, "Glasses"));
        categories.add(new Categories(R.drawable.dashboard, "All"));
        categories.add(new Categories(R.drawable.tshirt, "Clothing"));
        categories.add(new Categories(R.drawable.briefcase, "Bags"));
        categories.add(new Categories(R.drawable.mouse, "Mouse"));
        categories.add(new Categories(R.drawable.ring, "Jewelry"));
        categories.add(new Categories(R.drawable.shoes, "Footwear"));
        categories.add(new Categories(R.drawable.sunglasses, "Glasses"));

        rvCategory = findViewById(R.id.rv_category);
        adapter = new CategoryAdapter(categories, this);
        rvCategory.setAdapter(adapter);
//        rvCategory.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvCategory.setLayoutManager(new GridLayoutManager(this, 3));
    }
}