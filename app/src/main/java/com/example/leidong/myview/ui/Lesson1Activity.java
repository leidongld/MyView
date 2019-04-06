package com.example.leidong.myview.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.leidong.myview.R;
import com.example.leidong.myview.views.lesson1Views.Arc;
import com.example.leidong.myview.views.lesson1Views.Circle;
import com.example.leidong.myview.views.lesson1Views.Heart;
import com.example.leidong.myview.views.lesson1Views.Line;
import com.example.leidong.myview.views.lesson1Views.Lines;
import com.example.leidong.myview.views.lesson1Views.Oval;
import com.example.leidong.myview.views.lesson1Views.Point;
import com.example.leidong.myview.views.lesson1Views.Points;
import com.example.leidong.myview.views.lesson1Views.Rectangle;
import com.example.leidong.myview.views.lesson1Views.RoundRectangle;

/**
 * Created by Lei Dong on 2019/3/31.
 */
public class Lesson1Activity extends AppCompatActivity {
    private static final String TAG = Lesson1Activity.class.getSimpleName();

    private Circle mCircle;
    private Rectangle mRectangle;
    private Point mPoint;
    private Points mPoints;
    private Oval mOval;
    private Line mLine;
    private Lines mLines;
    private RoundRectangle mRoundRectangle;
    private Arc mArc;
    private Heart mHeart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1);

        initWidgest();
    }

    /**
     * 初始化组件
     */
    private void initWidgest() {
        mCircle = findViewById(R.id.firstView);
        mRectangle = findViewById(R.id.rectangle);
        mPoint = findViewById(R.id.point);
        mPoints = findViewById(R.id.points);
        mOval = findViewById(R.id.oval);
        mLine = findViewById(R.id.line);
        mLines = findViewById(R.id.lines);
        mRoundRectangle = findViewById(R.id.roundRectangle);
        mArc = findViewById(R.id.arc);
        mHeart = findViewById(R.id.heart);
    }

    /**
     * Click circle
     *
     * @param view
     */
    public void onClickCircle(View view) {
        Toast.makeText(this, "You click the circle.", Toast.LENGTH_SHORT).show();
    }

    /**
     * Click rectangle
     *
     * @param view
     */
    public void onClickRect(View view) {
        Toast.makeText(this, "You click the rectangle.", Toast.LENGTH_SHORT).show();
    }

    /**
     * Click point
     *
     * @param view
     */
    public void onClickPoint(View view) {
        Toast.makeText(this, "You click the point.", Toast.LENGTH_SHORT).show();
    }

    /**
     * Click points
     *
     * @param view
     */
    public void onClickPoints(View view) {
        Toast.makeText(this, "You click the points.", Toast.LENGTH_SHORT).show();
    }

    /**
     * Click oval
     *
     * @param view
     */
    public void onClickOval(View view) {
        Toast.makeText(this, "You click the oval.", Toast.LENGTH_SHORT).show();
    }

    /**
     * Click line
     *
     * @param view
     */
    public void onClickLine(View view) {
        Toast.makeText(this, "You click the line.", Toast.LENGTH_SHORT).show();
    }

    /**
     * Click lines
     *
     * @param view
     */
    public void onClickLines(View view) {
        Toast.makeText(this, "You click the lines.", Toast.LENGTH_SHORT).show();
    }

    /**
     * Click round rectangle
     *
     * @param view
     */
    public void onClickRoundRectangle(View view) {
        Toast.makeText(this, "You click the round rectangle.", Toast.LENGTH_SHORT).show();
    }

    /**
     * Draw arc
     *
     * @param view
     */
    public void onClickArc(View view) {
        Toast.makeText(this, "You click the arc.", Toast.LENGTH_SHORT).show();
    }

    /**
     * Draw heart
     *
     * @param view
     */
    public void onClickHeart(View view) {
        Toast.makeText(this, "You click the heart.", Toast.LENGTH_SHORT).show();
    }
}
