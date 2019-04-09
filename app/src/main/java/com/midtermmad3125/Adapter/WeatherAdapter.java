package com.midtermmad3125.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.midtermmad3125.Modals.Weather;
import com.midtermmad3125.R;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.StudentHolder> {

    private static final int MENU_ITEM_VIEW_TYPE = 0;
    private final Context mContext;

    private final List<Object> mRecyclerViewItems;

    public class StudentHolder extends RecyclerView.ViewHolder {


        TextView min;
        TextView max;
        TextView weather;
        TextView date;

        public StudentHolder(@NonNull View itemView) {
            super(itemView);

        }

    }

    public WeatherAdapter(Context mContext, List<Object> mRecyclerViewItems) {
        this.mContext = mContext;
        this.mRecyclerViewItems = mRecyclerViewItems;

    }
    @Override
    public WeatherAdapter.StudentHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        switch (viewType) {
            case MENU_ITEM_VIEW_TYPE:

            default:
                View menuItemLayoutView = LayoutInflater.from(viewGroup.getContext()).inflate(
                        R.layout.list, viewGroup, false);

                return new StudentHolder(menuItemLayoutView);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherAdapter.StudentHolder holder, int position) {

        int viewType = getItemViewType(position);
        switch (viewType) {
            case MENU_ITEM_VIEW_TYPE:
            default:
                StudentHolder menuItemHolder = (StudentHolder) holder;
                Weather menuItem = (Weather) mRecyclerViewItems.get(position);



               // menuItemHolder.date.setText(menuItem.getid());
              //  menuItemHolder.min.setText(menuItem.textViewmin());
               // menuItemHolder.max.setText(menuItem.getGender());

        }
    }

    @Override
    public int getItemCount() {
        return mRecyclerViewItems.size();
    }
}
