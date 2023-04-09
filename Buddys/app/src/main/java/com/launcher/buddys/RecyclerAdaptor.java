package com.launcher.buddys;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdaptor extends RecyclerView.Adapter<RecyclerAdaptor.ViewHolder> {

    private ArrayList<Buddy> arrayList;
    public RecyclerAdaptor(ArrayList<Buddy> arrayList){
        this.arrayList =arrayList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
      View view = inflater.inflate(R.layout.feed_item,parent,false);
        return new ViewHolder(view);
    }




    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Buddy buddy= arrayList.get(position);
        holder.title.setText(buddy.getTitle());
        holder.location.setText(buddy.getlocation());
        holder.profileImage.setImageResource(buddy.getProfileImage());
        holder.postImage.setImageResource(buddy.getProfileIcon());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView profileImage;
        ImageView postImage;
        TextView title;
        TextView location;
        public ViewHolder(@NonNull View itemView){
            super(itemView);

            profileImage = itemView.findViewById(R.id.Image_UserIcon);
            postImage = itemView.findViewById(R.id.Image_Feed);
            title = itemView.findViewById(R.id.Text_Name);
            location = itemView.findViewById(R.id.Text_Location);

        }
    }
}
