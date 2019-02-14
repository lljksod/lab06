package com.rburch.lab06;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tv;
    List<Button> fontButtonList = new ArrayList<Button>();
    List<Button> metricButtonList = new ArrayList<Button>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);

        fontButtonList.add((Button) findViewById(R.id.upSizeButton));
        fontButtonList.add((Button) findViewById(R.id.upSizeButton));

        metricButtonList.add((Button) findViewById(R.id.boldButton));
        metricButtonList.add((Button) findViewById(R.id.italicButton));
        metricButtonList.add((Button) findViewById(R.id.normalButton));

        for(Button b : fontButtonList) {
            b.setOnClickListener(this);
        }

        for(Button b : metricButtonList) {
            b.setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {

        float size;
        switch(v.getId()) {
            case R.id.upSizeButton:
                size = tv.getTextScaleX();
                tv.setTextScaleX(size + 1);
                break;
            case R.id.downSizeButton:
                size = tv.getTextScaleX();
                tv.setTextScaleX(size + 1);
                break;
            case R.id.italicButton:
                tv.setTypeface(null, Typeface.ITALIC);
                break;
            case R.id.boldButton:
                tv.setTypeface(null, Typeface.BOLD);
                break;
            case R.id.normalButton:
                tv.setTypeface(null, Typeface.NORMAL);
                break;
        }

    }
}
