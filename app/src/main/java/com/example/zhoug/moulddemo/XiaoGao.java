package com.example.zhoug.moulddemo;

import android.util.Log;

/**
 * Created by zhoug on 2016/5/8.
 */
public class XiaoGao extends  GameModel {
    @Override
    public void openComputer() {
        Log.e("flag","小高打开电脑了");
    }

    @Override
    public void openGame() {
        Log.e("flag","小高打开游戏了");
    }

    @Override
    public void login() {
        Log.e("flag","小高开始登陆游戏了");
    }

    @Override
    public void play() {
        Log.e("flag","小高开始玩耍了");
    }
}
