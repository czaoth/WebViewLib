package com.xingen.app;

import android.app.Application;

/**
 * Author by ${HeXinGen}, Date on 2018/10/1.
 */
public class App extends Application {
    private static  App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
       loadWebViewManager();
    }
    private void loadWebViewManager(){
        try {
            WebViewManagerTest.test(this);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static  App getInstance(){
        return instance;
    }
}
