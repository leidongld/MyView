package com.example.leidong.myview.ui;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;

import com.example.leidong.myview.R;
import com.example.leidong.myview.views.lesson6Views.Score;

public class Lesson6Activity extends AppCompatActivity {
    private static final String TAG = Lesson6Activity.class.getSimpleName();

    private ImageView mImage;

    private Button mBtnTransactionX;

    private Button mBtnScale;

    private Button mBtnRotate;

    private Score mScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson6);

        mImage = findViewById(R.id.image);
        mBtnTransactionX = findViewById(R.id.transactionx);
        mBtnScale = findViewById(R.id.scale);
        mBtnRotate = findViewById(R.id.rotate);
        mScore = findViewById(R.id.score);
    }


    /**
     * Click transaction x
     *
     * @param view
     */
    public void onClickTransactionX(View view) {
        mImage.invalidate();
        mImage.animate().translationX(500);
//        mImage.animate().setInterpolator(new AccelerateDecelerateInterpolator());
        mImage.animate().setInterpolator(new AnticipateInterpolator());
        mImage.animate().setDuration(5000);
    }

    /**
     * Click scale
     *
     * @param view
     */
    public void onClickScale(View view) {
        mImage.invalidate();
        mImage.animate().scaleX(5);
        mImage.animate().scaleY(5);
        mImage.animate().setDuration(1000);
    }

    /**
     * Click rotate
     *
     * @param view
     */
    public void onClickRotate(View view) {
        mImage.invalidate();
        mImage.animate().rotationY(360 * 1000);
        mImage.animate().setDuration(1000 * 1000);
        mImage.animate().setInterpolator(new LinearInterpolator());
    }

    /**
     * Click score change
     *
     * @param view
     */
    public void onClickScore(View view) {
        ObjectAnimator animator = (ObjectAnimator) ObjectAnimator.ofFloat(mScore, "score", 0, 100);
        animator.setInterpolator(new AccelerateDecelerateInterpolator());
        animator.setDuration(1000);
        animator.start();
    }
}
