package com.example.jeslin.retromyserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=(TextView)findViewById(R.id.nametxt);
        t2=(TextView)findViewById(R.id.phtxt);
        t3=(TextView)findViewById(R.id.classtxt);
        t1.setText(""+getIntent().getStringExtra("name"));
        t2.setText(""+getIntent().getStringExtra("ph"));
        t3.setText(""+getIntent().getStringExtra("class"));


    }
}
