package com.tjeit.a20190414_finaltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText heightEdt;
    private EditText WeightEdt;
    private Button okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupEvents();
        setValues();
    }

    void setValues(){
        // 초기데이터 
    }

    void setupEvents(){
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    void bindViews() {
        this.okBtn = (Button) findViewById(R.id.okBtn);
        this.WeightEdt = (EditText) findViewById(R.id.WeightEdt);
        this.heightEdt = (EditText) findViewById(R.id.heightEdt);
    }

}
