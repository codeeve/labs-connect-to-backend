package com.wasdlabs.app.labs.connect.tobackend.recycler;

import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wasdlabs.app.labs.connect.tobackend.GlideApp;
import com.wasdlabs.app.labs.connect.tobackend.R;
import com.wasdlabs.app.labs.connect.tobackend.model.Item;
import com.wasdlabs.app.labs.connect.tobackend.model.VolumeInfo;


import java.util.List;


/**
 * ini adapter buat recyclernya
 * Created by USER on 11/1/2017.
 */

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.MyViewHolder> {
    private List<Item> itemList;

    public BooksAdapter(List<Item> itemList){
        this.itemList = itemList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_buku, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        Item item = itemList.get(position);

        VolumeInfo volInfo = item.getVolumeInfo();
        Log.e("Recycler", "judul: "+volInfo.getTitle());
        holder.mJudul.setText(volInfo.getTitle());
        holder.mDescription.setText(volInfo.getPublisher());

        //loadnya pake glide
        GlideApp.with(holder.mCover.getContext())
                .load(volInfo.getImageLinks().getSmallThumbnail())
                .into(holder.mCover);

        //kasi masuk item click listener
        holder.mContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick.onItemClick(v, position);
            }
        });

    }

    @Override
    public int getItemCount() {
//        Log.e("Recycler", "item size: "+itemList.size());
        //hitung data
        return itemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        //bikin view holdernya
        TextView mJudul, mDescription;
        ImageView mCover;
        ConstraintLayout mContainer;
        public MyViewHolder(View itemView) {
            super(itemView);
            mJudul = (TextView) itemView.findViewById(R.id.tv_judul);
            mDescription = (TextView) itemView.findViewById(R.id.tv_description);

            mCover = (ImageView) itemView.findViewById(R.id.iv_gambar);

            mContainer = (ConstraintLayout) itemView.findViewById(R.id.container);



        }
    }

    /**
     * item click interface
     */
    //declare interface
    private OnItemClicked onClick;

    //make interface like this
    public interface OnItemClicked {
        void onItemClick(View v, int position);
    }

    public void setOnClick(OnItemClicked onClick)
    {
        this.onClick=onClick;
    }
}
