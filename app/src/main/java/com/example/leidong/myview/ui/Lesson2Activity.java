package com.example.leidong.myview.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.leidong.myview.R;
import com.example.leidong.myview.views.lesson2Views.RoundPic;

/**
 * Created by Lei Dong on 2019/3/31.
 */
public class Lesson2Activity extends AppCompatActivity {
    private static final String TAG = Lesson2Activity.class.getSimpleName();

    private RoundPic mRoundPic;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);

        initWidgets();
    }

    /**
     * Init widgets
     */
    private void initWidgets() {
        mRoundPic = findViewById(R.id.roundPic);
    }

    /**
     * Click round picture
     *
     * @param view
     */
    public void onClickRoundPic(View view) {
        Toast.makeText(this, "You click the round picture.", Toast.LENGTH_SHORT).show();
    }

    /**
     * Click compose picture
     *
     * @param view
     */
    public void onClickComposePic(View view) {
        Toast.makeText(this, "You click the commpose picture.", Toast.LENGTH_SHORT).show();
    }
}
