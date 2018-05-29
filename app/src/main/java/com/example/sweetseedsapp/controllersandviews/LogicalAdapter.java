package com.example.sweetseedsapp.controllersandviews;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;

import com.example.sweetseedsapp.R;
import com.example.sweetseedsapp.models.LogicalModel;

import java.util.List;

/**
 * Created by vivianbabiryekulumba on 5/28/18.
 */

public class LogicalAdapter extends RecyclerView.Adapter<LogicalAdapter.LogicalViewHolder> {

    List<LogicalModel> logicalModel;

    public LogicalAdapter(List<LogicalModel> logicalModelList) {
        this.logicalModel = logicalModelList;
    }

    @NonNull
    @Override
    public LogicalAdapter.LogicalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.logical_item_view, parent, false);
        return new LogicalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LogicalAdapter.LogicalViewHolder holder, int position) {
        holder.onBind(logicalModel.get(position));
    }

    @Override
    public int getItemCount() {
        return logicalModel.size();
    }

    public class LogicalViewHolder extends RecyclerView.ViewHolder {

        public LogicalViewHolder(View itemView) {
            super(itemView);
        }

        public void onBind(LogicalModel logicalModel) {
            ImageView logical_game_iv = itemView.findViewById(R.id.logical_game_iv);
            logical_game_iv.setImageResource(logicalModel.getImage());
        }
    }
}
