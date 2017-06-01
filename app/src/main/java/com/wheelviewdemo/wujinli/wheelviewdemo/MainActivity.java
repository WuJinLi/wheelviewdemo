package com.wheelviewdemo.wujinli.wheelviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.wheelviewdemo.wujinli.wheelviewdemo.view.WheelViewUtil;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_choices;
    private List<String> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mList = getData();
        btn_choices = (Button) findViewById(R.id.btn_choices);
        btn_choices.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_choices:
                WheelViewUtil.alertBottomWheelOption(this, (ArrayList<?>) mList, new WheelViewUtil.OnWheelViewClick
                        () {
                    @Override
                    public void onClick(View view, int postion) {
                        Toast.makeText(MainActivity.this, mList.get(postion), Toast.LENGTH_SHORT)
                                .show();
                    }
                });
                break;
            default:
                break;
        }
    }

    public List<String> getData() {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 19; i++) {
            list.add("item" + i);
        }
        return list;
    }
}
