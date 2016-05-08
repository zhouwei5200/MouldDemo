package com.example.zhoug.moulddemo;

import android.util.Log;

/**
 * Created by zhoug on 2016/5/8.
 */
public abstract class GameModel {
    public  abstract  void openComputer();
    public abstract  void  openGame();
    public abstract  void  login();
    public  abstract  void play();

    /**
     * 钩子方法，默认不会接到电话
     * @return
     */
    protected  boolean isCall(){
        return false;
    }

    public  final void  playGame(){
        if(this.isCall()){
            Log.e("flag","小王接到了女朋友的电话去陪女朋友去了，只剩小高自己在玩游戏了");
            return;
        }
        this.openComputer();
        this.openGame();
        this.login();
        this.play();
    }

}
