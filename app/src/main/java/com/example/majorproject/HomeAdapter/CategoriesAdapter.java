package com.example.majorproject.HomeAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.majorproject.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder> {

    ArrayList<CategoriesHelperClass> categories;
    public CategoriesAdapter(ArrayList<CategoriesHelperClass> categories) {
        this.categories= categories;
    }

    @NonNull
    @Override
    public CategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_card, parent,false);
        CategoriesViewHolder categoriesViewHolder=new CategoriesViewHolder(view);
        return categoriesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesViewHolder holder, int position) {

        CategoriesHelperClass categoriesHelperClass = categories.get(position);

        holder.image.setImageResource(categoriesHelperClass.getImage());
        holder.categoryTitle.setText(categoriesHelperClass.getCategory());



    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public static class CategoriesViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView  categoryTitle;
        public CategoriesViewHolder(@NonNull View itemView) {
            super(itemView);
       //hooks
            image=itemView.findViewById(R.id.categories_image);
            categoryTitle=itemView.findViewById(R.id.categoryTitle);

        }
    }



}
