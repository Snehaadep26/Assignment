package com.example.assignment.PublishPackage;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.R;

import java.util.ArrayList;
import java.util.List;


    public class PublishAdapter extends RecyclerView.Adapter<PublishAdapter.MyViewHolder> {
        ArrayList<Published> name;
        ArrayList<Published> publish;

        public PublishAdapter(ArrayList<Published> name) {

            this.name = name;
        }


        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v;
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.publish_card, parent, false);
            MyViewHolder vHolder = new MyViewHolder(v);
            return vHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            Published currentPublish = name.get(position);
            holder.title.setText(currentPublish.getTitle());
            holder.dueMonth.setText(currentPublish.getDueMonth());
            holder.dueDate.setText(String.valueOf(currentPublish.getDueDate()));
            holder.subjectName.setText(currentPublish.getSubjectName());
            holder.type.setText(currentPublish.getType());
            holder.noOfQuestions.setText(String.valueOf(currentPublish.getNoOfQuestions()));
            holder.marks.setText(String.valueOf(currentPublish.getMarks()));

        }

        @Override
        public int getItemCount() {
            return name.size();
        }

        public Filter getFilter() {
            return publishFilter;
        }

        private Filter publishFilter = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {

                List<Published> filteredList = new ArrayList<>();

                if (constraint == null || constraint.length() == 0) {
                    filteredList.addAll(publish);
                } else {
                    String filterPattern = constraint.toString().toLowerCase().trim();
                    for (Published name : publish
                    ) {
//                        if (name.getTeacherName().toLowerCase().contains(filterPattern)){
//                            filteredList.add(name);
//                        }
                    }
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = filteredList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {

                name.clear();
                name.addAll((List) results.values);
                notifyDataSetChanged();

            }
        };


        public static class MyViewHolder extends RecyclerView.ViewHolder {

            TextView title,subjectName, type, noOfQuestions, marks,dueMonth,dueDate;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                title = itemView.findViewById(R.id.title);
                subjectName = itemView.findViewById(R.id.subjectName);
                type = itemView.findViewById(R.id.type);
                noOfQuestions = itemView.findViewById(R.id.noOfQues);
                marks = itemView.findViewById(R.id.marks);
                dueMonth = itemView.findViewById(R.id.dueMonth);
                dueDate = itemView.findViewById(R.id.dueDate);

            }
        }
    }

