package com.example.notificationreadv2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import javax.xml.transform.Result;

public class DetailsRVAdapter extends RecyclerView.Adapter<DetailsRVAdapter.ViewHolder> {
    // creating variables for our ArrayList and context
    private ArrayList<Result> resultArrayList;
    private Context context;

    // creating constructor for our adapter class
    public DetailsRVAdapter(ArrayList<Result> resultArrayList, Context context) {
        this.resultArrayList = resultArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public DetailsRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // passing our layout file for displaying our card item
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_items, parent, false);
        return new ViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull DetailsRVAdapter.ViewHolder holder, int position) {
        // setting data to our text views from our modal class.
        Result result = resultArrayList.get(position);
        holder.UserIDTV.setText(result.getSystemId());
        holder.CompetitionResultTV.setText(result.getSystemId());
        holder.CompetitionDescriptionTV.setText(result.getSystemId());
    }

    @Override
    public int getItemCount() {
        // returning the size of our array list.
        return resultArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        // creating variables for our text views.
        private final TextView UserIDTV;
        private final TextView CompetitionResultTV;
        private final TextView CompetitionDescriptionTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initializing our text views.
            UserIDTV = itemView.findViewById(R.id.idTVUserID);
            CompetitionResultTV = itemView.findViewById(R.id.idTVCompetitionResult);
            CompetitionDescriptionTV = itemView.findViewById(R.id.idTVCompetitionDescription);
        }
    }
}
