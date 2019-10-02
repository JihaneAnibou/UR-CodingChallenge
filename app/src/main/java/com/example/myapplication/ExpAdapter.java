package com.example.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class ExpAdapter extends RecyclerView.Adapter<ExpAdapter.ExampleViewHolder> {
    private Context mContext;
    private ArrayList<ExpItem> mExampleList;

    public ExpAdapter(Context context, ArrayList<ExpItem> exampleList) {
        mContext = context;
        mExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.example_item, parent, false);
        return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        ExpItem currentItem = mExampleList.get(position);

        String imageUrl = currentItem.getImageUrl();
        String ownerName = currentItem.getOwnerName();
        String repoName = currentItem.getRepoName();
        String repoDescription = currentItem.getRepoDesc();
        String starCount = currentItem.getStarCount();

        holder.mRepoName.setText(repoName);
        holder.mRepoDescription.setText(repoDescription);
        holder.mRepoOwnerName.setText(ownerName);
        holder.mStars.setText(starCount);
        Picasso.get().load(imageUrl).fit().centerInside().into(holder.mOwnerAvatar);
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView mOwnerAvatar;
        public TextView mRepoName;
        public TextView mStars;
        public TextView mRepoDescription;
        public TextView mRepoOwnerName;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            mOwnerAvatar = itemView.findViewById(R.id.owner_avatar);
            mRepoName = itemView.findViewById(R.id.repo_name);
            mStars = itemView.findViewById(R.id.text_view_likes);
            mRepoDescription = itemView.findViewById(R.id.repo_description);
            mRepoOwnerName = itemView.findViewById(R.id.repo_owner_name);
        }
    }
}