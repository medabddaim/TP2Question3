package com.example.tpquestion3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout layout, scrollayout;
    private Button btn;
    private EditText nom;
    private ScrollView scrol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView() {
        layout = findViewById(R.id.layout);
        scrollayout = findViewById(R.id.scrollayout);
        btn = findViewById(R.id.envoyer);
        nom = findViewById(R.id.nomEdt);
        scrol = findViewById(R.id.scrol);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.envoyer) {
            TextView textView = new TextView(this);
            textView.setTextSize(20);
            textView.setText("Bienvennue   " + nom.getText());
            scrollayout.addView(textView);
        }
    }
}