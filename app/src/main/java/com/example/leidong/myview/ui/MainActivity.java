package com.example.leidong.myview.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.leidong.myview.R;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    private Button mBtnLesson1;

    private Button mBtnLesson2;

    private Button mBtnLesson3;

    private Button mBtnLesson4;

    private Button mBtnLesson6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
    }

    /**
     * Init widgets
     */
    private void initWidgets() {
        mBtnLesson1 = findViewById(R.id.lesson1Btn);
        mBtnLesson2 = findViewById(R.id.lesson2Btn);
        mBtnLesson3 = findViewById(R.id.lesson3Btn);
        mBtnLesson4 = findViewById(R.id.lesson4Btn);
        mBtnLesson6 = findViewById(R.id.lesson6Btn);
    }

    /**
     * Click lesson 1
     *
     * @param view
     */
    public void onClickLesson1(View view) {
        Intent intent = new Intent(MainActivity.this, Lesson1Activity.class);
        startActivity(intent);
    }

    /**
     * Click lesson2
     *
     * @param view
     */
    public void onClickLesson2(View view) {
        Intent intent = new Intent(MainActivity.this, Lesson2Activity.class);
        startActivity(intent);
    }

    /**
     * Click lesson3
     *
     * @param view
     */
    public void onClickLesson3(View view) {
        Intent intent = new Intent(MainActivity.this, Lesson3Activity.class);
        startActivity(intent);
    }

    /**
     * Click lesson4
     *
     * @param view
     */
    public void onClickLesson4(View view) {
        Intent intent = new Intent(MainActivity.this, Lesson4Activity.class);
        startActivity(intent);
    }

    /**
     * Click lesson6
     *
     * @param view
     */
    public void onClickLesson6(View view) {
        Intent intent = new Intent(MainActivity.this, Lesson6Activity.class);
        startActivity(intent);
    }
}
