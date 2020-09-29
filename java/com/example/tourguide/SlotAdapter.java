package com.example.tourguide;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.squareup.picasso.Picasso;

public class SlotAdapter extends RecyclerView.Adapter<SlotAdapter.ViewHolder> {
    private Slot[] slots;
    private int mColorResourceId;
    private boolean isImageFitToScreen;

    public SlotAdapter(Slot[] slots, int newColor) {
        this.slots=slots;
        this.mColorResourceId=newColor;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }



    //Provides a reference to the xml views
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nameText;
        private TextView reviewText;
        private ImageView sideImageView;
        private LinearLayout linearLayout;
        private RelativeLayout relativeLayout;
        private ViewHolder(View itemView){
            super(itemView);
            nameText= (TextView) itemView.findViewById(R.id.name_text);
            reviewText= (TextView) itemView.findViewById(R.id.review_text);
            sideImageView= (ImageView) itemView.findViewById(R.id.image_view);
            linearLayout= (LinearLayout) itemView.findViewById(R.id.linear_layout);
            relativeLayout= (RelativeLayout) itemView.findViewById(R.id.relative_layout);
        }
    }


    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Slot currentSlot= slots[position];
        holder.nameText.setText(currentSlot.getmNameText());
        holder.reviewText.setText(currentSlot.getmReviewText());
        if(currentSlot.hasImage()){
            Glide.with(holder.sideImageView.getContext())
                    .load((Integer)currentSlot.getmSideImageView())
                    .centerCrop()
                    .into(holder.sideImageView);
//            holder.sideImageView.setImageResource(currentSlot.getmSideImageView());
            holder.sideImageView.setVisibility(View.VISIBLE);
        }
        else{
            holder.sideImageView.setVisibility(View.GONE);
        }



        holder.sideImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isImageFitToScreen) {
                    isImageFitToScreen = false;
                    holder.sideImageView.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT));
                    holder.sideImageView.setAdjustViewBounds(true);

                } else {
                    isImageFitToScreen = true;
                    holder.sideImageView.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                            RelativeLayout.LayoutParams.MATCH_PARENT));
                    holder.sideImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                }

            }

        });

        holder.linearLayout.setBackgroundResource(mColorResourceId);
    }


    public int getItemCount() {
        return slots.length;
    }
}
