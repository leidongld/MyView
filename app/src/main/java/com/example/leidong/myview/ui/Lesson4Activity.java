package com.example.leidong.myview.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.leidong.myview.R;
import com.example.leidong.myview.views.lesson4Views.GoogleMark;

/**
 * Created by Lei Dong on 2019/4/6.
 */
public class Lesson4Activity extends AppCompatActivity {
    private static final String TAG = Lesson4Activity.class.getSimpleName();

   private GoogleMark mGoogleMark;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson4);

        mGoogleMark = findViewById(R.id.googlemark);
    }


    /**
     * Clcik google mark
     *
     * @param view
     */
    public void onClickGoogleMark(View view) {
        Toast.makeText(this, "You click the google mark", Toast.LENGTH_SHORT).show();
        mGoogleMark.animate().translationX(1000);
        mGoogleMark.animate().setDuration(1000);
    }
}
