package com.varun.hangover.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.varun.hangover.R;
import com.varun.hangover.models.LiquorModel;

import java.util.ArrayList;

/**
 * Created by Administrator on 16 Sep,2016.
 */
public class LiquorAdapter extends
        RecyclerView.Adapter<LiquorAdapter.ViewHolder> {

    ArrayList<LiquorModel> list;
    Context context;
    LayoutInflater inflater;

    public LiquorAdapter(Context context, ArrayList<LiquorModel> list) {
        this.list = list;
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public LiquorAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(LiquorAdapter.ViewHolder holder, int position) {
        holder.liquorType.setText(list.get(position).getTypeName());
        holder.liquorName.setText(list.get(position).getTypeName());
        holder.liquorLikes.setText(list.get(position).getLiquorLikes());
        holder.liquorDescription.setText(list.get(position).getLiquorAbout());

        Glide.with(context).load("http://hangoverapp.in/hangover/uploads/liquor/original/" + list.get(position).getLiquorLogo()).into(holder.backgroundImage);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView liquorType, liquorName, liquorLikes, liquorDescription;
        public ImageView backgroundImage;

        public ViewHolder(View itemView) {
            super(itemView);
            liquorType = (TextView) itemView.findViewById(R.id.liquor_type);
            liquorName = (TextView) itemView.findViewById(R.id.liquor_name);
            liquorLikes = (TextView) itemView.findViewById(R.id.liquor_likes);
            liquorDescription = (TextView) itemView.findViewById(R.id.liquor_description);
            backgroundImage = (ImageView) itemView.findViewById(R.id.liquor_background_image);

        }
    }
}
