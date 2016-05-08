package com.example.zhoug.moulddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * java设计模式之模板模式
         */
        XiaoWang xiaowang = new XiaoWang();
        XiaoGao xiaogao = new XiaoGao();
        xiaowang.setCall(true);
        xiaowang.playGame();

        xiaogao.playGame();
    }
}
