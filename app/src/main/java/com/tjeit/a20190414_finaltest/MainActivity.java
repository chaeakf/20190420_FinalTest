package com.tjeit.a20190414_finaltest;

import android.content.Intent;
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
        // 초기데이터 세팅 코드들(지금예시 코드 X)
    }

    void setupEvents(){
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              확인 버튼을 누르면? => ResultActiovitty로 키/몸무게를 들고 이동
//              1)입력된 키가 몇인지 소수점으로 저장
//                1.1)heightEdt에 입력 된 값을 일단string 으로 뽑아자
                String heightStr = heightEdt.getText().toString();
//                1.2 따낸  String을 double형태 변환.
                double height = Double.parseDouble(heightStr);

                String weightStr = WeightEdt.getText().toString();
                double weight = Double.parseDouble(weightStr);


//                2)
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("키", height);
                intent.putExtra("몸무게", weight);
                startActivity(intent);
            }
        });
    }

    void bindViews() {
        this.okBtn = (Button) findViewById(R.id.okBtn);
        this.WeightEdt = (EditText) findViewById(R.id.WeightEdt);
        this.heightEdt = (EditText) findViewById(R.id.heightEdt);
    }

}
