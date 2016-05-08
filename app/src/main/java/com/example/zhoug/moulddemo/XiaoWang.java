package com.example.zhoug.moulddemo;

import android.util.Log;

/**
 * Created by zhoug on 2016/5/8.
 */
public class XiaoWang  extends  GameModel{
    public boolean isCall = false;
    @Override
    public void openComputer() {
        Log.e("flag","小王打开电脑了");
    }

    @Override
    public void openGame() {
        Log.e("flag","小王打开游戏了");
    }

    @Override
    public void login() {
        Log.e("flag","小王开始登陆游戏了");
    }

    @Override
    public void play() {
        Log.e("flag","小王开始玩耍了");
    }

    /**
     * 小王是否接到了女朋友的电话，不能玩游戏了
     * @return
     */
    @Override
    public boolean isCall() {
        return isCall;
    }

    public void setCall(boolean is){
        Log.e("flag","小王接到电话了");
        this.isCall = is;
    }
}
