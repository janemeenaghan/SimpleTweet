package com.codepath.apps.restclienttemplate;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.codepath.apps.restclienttemplate.models.Tweet;

import java.util.List;

public class TweetsAdapter extends RecyclerView.Adapter<TweetsAdapter.ViewHolder> {
    //pass in context + list of tweets thru constructor
    Context context;
    List<Tweet> tweets;
    public TweetsAdapter(Context context, List<Tweet> tweets){
        this.context = context;
        this.tweets = tweets;

    }

    public void clear() {
        tweets.clear();
        notifyDataSetChanged();
    }

    // Add a list of items -- change to type used
    public void addAll(List<Tweet> list) {
        tweets.addAll(list);
        notifyDataSetChanged();
    }



    //for each row, aka a tweet, inflate the layout
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_tweet, parent, false);
        return new ViewHolder(view);
    }

    // bind based on position of element
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //get data at position
        Tweet tweet = tweets.get(position);
        // bind the tweet at viewholder
        holder.bind(tweet);
    }

    @Override
    public int getItemCount() {
        return tweets.size();
    }


    //define viewholder
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivProfileImage;
        TextView tvBody, tvScreenName,relativeTime;
        ImageView tweetImage;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            ivProfileImage = itemView.findViewById(R.id.ivProfileImage);
            tvBody = itemView.findViewById(R.id.tvBody);
            tvScreenName = itemView.findViewById(R.id.tvScreenName);
            tweetImage = itemView.findViewById(R.id.tweetPic);
            relativeTime = itemView.findViewById(R.id.relativeTime);
        }

        public void bind(Tweet tweet) {
          /*  Log.d("WHYISNTITWORKING", tweet.getRelativeTimeAgo(tweet.createdAt));
            Log.d("WHYISNTITWORKING", tweet.getRelativeTimeAgo(tweet.createdAt));
            Log.d("WHYISNTITWORKING", tweet.getRelativeTimeAgo(tweet.createdAt));
            Log.d("WHYISNTITWORKING", tweet.getRelativeTimeAgo(tweet.createdAt));
            Log.d("WHYISNTITWORKING", tweet.getRelativeTimeAgo(tweet.createdAt));*/
            Log.d("TweetsAdapter", tweet.image + "");
            if (tweet.image.isEmpty()) {
                tweetImage.setVisibility(View.GONE);
            }
            else{
                tweetImage.setVisibility(View.VISIBLE);
                Log.d("jane","tweet="+tweet.body+" " + tweet.image);
                Log.d("TweetsAdapter", "loading media");
                Glide.with(context)
                        .load(tweet.image)// + ":thumb")
                        .into(tweetImage);
            }

            tvBody.setText(tweet.body);
            tvScreenName.setText(tweet.user.screenName);
             relativeTime.setText(tweet.getRelativeTimeAgo(tweet.createdAt));


            Glide.with(context).load(tweet.user.profileImageUrl).into(ivProfileImage);
            /*if (tweet.image.isEmpty()){
                tweetImage.setVisibility(View.GONE);
            } else{
                tweetImage.setVisibility(View.VISIBLE);
                Log.d("jane","tweet="+tweet.user.name+" " + tweet.image);
                Glide.with(context)
                        .load(tweet.image)
                        .centerCrop()
                        .transform(new RoundedCorners(75))
                        .into(tweetImage);
            }*/
        }
    }
}
