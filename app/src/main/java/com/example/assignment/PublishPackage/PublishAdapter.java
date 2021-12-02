package com.example.assignment.PublishPackage;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.R;

import java.util.ArrayList;
import java.util.List;


public class PublishAdapter extends RecyclerView.Adapter<PublishAdapter.MyViewHolder> {
        ArrayList<Published> name;
        ArrayList<Published> publish;

        public PublishAdapter( ArrayList<Published> name)
        {

            this.name = name;
        }



        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v;
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.publish_card,parent,false);
            MyViewHolder vHolder=new MyViewHolder(v);
            return vHolder;
        }

        @Override
        public void onBindViewHolder( @NonNull MyViewHolder holder, int position) {
            Published currentPublish = name.get(position);
            holder.teacherName.setText(currentPublish.getTeacherName());

        }

        @Override
        public int getItemCount()
        {
            return name.size();
        }

        public Filter getFilter() {
            return publishFilter ;
        }

        private Filter publishFilter = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {

                List<Published> filteredList = new ArrayList<>();

                if (constraint == null || constraint.length() == 0){
                    filteredList.addAll(publish);
                }
                else {
                    String filterPattern = constraint.toString().toLowerCase().trim();
                    for (Published name:publish
                    ) {
                        if (name.getTeacherName().toLowerCase().contains(filterPattern)){
                            filteredList.add(name);
                        }
                    }
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = filteredList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {

                name.clear();
                name.addAll((List)results.values);
                notifyDataSetChanged();

            }
        };


        public static class MyViewHolder extends RecyclerView.ViewHolder{

            public  TextView teacherName;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                teacherName=itemView.findViewById(R.id.Teacher_name_textView);

            }
        }
}
