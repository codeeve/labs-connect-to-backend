package com.wasdlabs.app.labs.connect.tobackend;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.Guideline;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.wasdlabs.app.labs.connect.tobackend.model.Item;
import com.wasdlabs.app.labs.connect.tobackend.model.VolumeInfo;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BookDetails extends AppCompatActivity {

    @BindView(R.id.iv_cover)
    ImageView ivCover;
    @BindView(R.id.tv_judul)
    TextView tvJudul;
    @BindView(R.id.tv_publisher)
    TextView tvPublisher;
    @BindView(R.id.tv_author)
    TextView tvAuthor;
    @BindView(R.id.tv_published_date)
    TextView tvPublishedDate;
    @BindView(R.id.tv_description)
    TextView tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);
        ButterKnife.bind(this);

        //tarik data parceable
        Intent intent = getIntent();
        Item item = intent.getParcelableExtra("item");

        String imageLink = item.getVolumeInfo().getImageLinks().getThumbnail();

        VolumeInfo volInfo = item.getVolumeInfo();

        //masukkan gambar cover pake glide
        GlideApp.with(getApplicationContext())
                .load(imageLink)
                .into(ivCover);

        //set text lain lain
        tvJudul.setText(volInfo.getTitle());
        tvPublishedDate.setText(volInfo.getPublishedDate());
        tvPublisher.setText(volInfo.getPublisher());
        tvAuthor.setText(volInfo.getAuthors().get(0));
        tvDescription.setText(volInfo.getDescription());


    }
}
