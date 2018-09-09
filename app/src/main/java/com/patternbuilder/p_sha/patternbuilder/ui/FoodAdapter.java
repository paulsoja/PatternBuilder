package com.patternbuilder.p_sha.patternbuilder.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.patternbuilder.p_sha.patternbuilder.R;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ItemViewHolder> {

    class ItemViewHolder extends RecyclerView.ViewHolder {

        private TextView item;
        private TextView packing;
        private TextView cost;

        public ItemViewHolder(View itemView) {
            super(itemView);
            item = itemView.findViewById(R.id.item_item_text);
            packing = itemView.findViewById(R.id.item_packing_text);
            cost = itemView.findViewById(R.id.item_cost_text);
        }

    }

    private List<ItemFood> list;

    public FoodAdapter(List<ItemFood> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder itemViewHolder, int i) {
        itemViewHolder.item.setText(list.get(i).getItem());
        itemViewHolder.packing.setText(list.get(i).getPacking());
        itemViewHolder.cost.setText(String.valueOf(list.get(i).getCost()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
