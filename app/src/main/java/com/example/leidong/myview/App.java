package com.example.leidong.myview;

import android.app.Application;
import android.content.Context;

/**
 * Created by Lei Dong on 2019/3/31.
 */
public class App extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        mContext = getApplicationContext();
    }

    public Context getContext() {
        return mContext;
    }
}
