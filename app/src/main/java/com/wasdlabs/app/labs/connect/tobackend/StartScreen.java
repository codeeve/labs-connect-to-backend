package com.wasdlabs.app.labs.connect.tobackend;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StartScreen extends AppCompatActivity {

    @BindView(R.id.et_query)
    EditText etQuery;
    @BindView(R.id.et_title)
    EditText etTitle;
    @BindView(R.id.et_author)
    EditText etAuthor;
    @BindView(R.id.et_publisher)
    EditText etPublisher;
    @BindView(R.id.et_subject)
    EditText etSubject;
    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        ButterKnife.bind(this);
    }

    public void bukaRecycler(View view) {
        Intent i = new Intent(StartScreen.this, MainActivity.class);

        i.putExtra("title", etTitle.getText().toString());
        i.putExtra("query", etQuery.getText().toString());
        i.putExtra("author", etAuthor.getText().toString());
        i.putExtra("publisher", etPublisher.getText().toString());
        i.putExtra("subject", etSubject.getText().toString());

        startActivity(i);
    }
}
