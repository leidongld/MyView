package com.example.leidong.myview.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.leidong.myview.R;
import com.example.leidong.myview.views.lesson3Views.MyTextView;

public class Lesson3Activity extends AppCompatActivity {
    private static final String TAG = Lesson2Activity.class.getSimpleName();

    private MyTextView mMyTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3);

        initWidgets();
    }

    /**
     * Init widgets
     */
    private void initWidgets() {
        mMyTextView = findViewById(R.id.mytextview);
    }


}
