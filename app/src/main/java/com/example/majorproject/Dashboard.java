package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Toast;

import com.example.majorproject.HomeAdapter.CategoriesAdapter;
import com.example.majorproject.HomeAdapter.CategoriesHelperClass;
import com.example.majorproject.HomeAdapter.FeaturedAdapter;
import com.example.majorproject.HomeAdapter.FeaturedHelperClass;

import java.util.ArrayList;

public class Dashboard extends AppCompatActivity {

    RecyclerView featuredRecycler,categoriesRecycler;
   FeaturedAdapter adapter;
   CategoriesAdapter adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dashboard);

        //Hooks
        featuredRecycler=findViewById(R.id.featured_recycler);
        featuredRecycler();
        categoriesRecycler=findViewById(R.id.categories_recycler);
        categoriesRecycler();

    }


    private void categoriesRecycler() {
        categoriesRecycler.setHasFixedSize(true);
        categoriesRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
        ArrayList<CategoriesHelperClass> categorieshelperclass =new ArrayList<>();
        categorieshelperclass.add(new CategoriesHelperClass(R.drawable.restaurant, "Restaurants"));
        categorieshelperclass.add(new CategoriesHelperClass(R.drawable.vegetable, "Groceries"));
        categorieshelperclass.add(new CategoriesHelperClass(R.drawable.salon, "Salons"));
        categorieshelperclass.add(new CategoriesHelperClass(R.drawable.shops, "Shops"));

        adapter2 =new CategoriesAdapter(categorieshelperclass);
        categoriesRecycler.setAdapter(adapter2);
    }

    private void featuredRecycler() {
        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));

        ArrayList<FeaturedHelperClass> featuredLocations=new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.food, "David's Donuts", "The Best Donuts around you"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.food, "David's Donuts", "The Best Donuts around you"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.food, "David's Donuts", "The Best Donuts around you"));
      adapter=new FeaturedAdapter(featuredLocations);
      featuredRecycler.setAdapter(adapter);
      adapter.setOnItemClickListener(new FeaturedAdapter.OnItemClickListener() {
          @Override
          public void onItemClick(int position) {
              Toast.makeText(Dashboard.this, "Press Successfull", Toast.LENGTH_SHORT).show();
              Intent activityservice= new Intent(getApplicationContext(),ServiceDetails.class);
              startActivity(activityservice);
          }
      });

    }






}


//TODO: Adding on click method to one of the cards.
//TODO:Creating booking screen
//TODO:Creating final confirmation page
