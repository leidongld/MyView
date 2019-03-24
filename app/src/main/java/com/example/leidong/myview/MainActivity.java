package com.example.leidong.myview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.leidong.myview.views.simpleViews.Arc;
import com.example.leidong.myview.views.simpleViews.Circle;
import com.example.leidong.myview.views.simpleViews.Heart;
import com.example.leidong.myview.views.simpleViews.Line;
import com.example.leidong.myview.views.simpleViews.Lines;
import com.example.leidong.myview.views.simpleViews.Oval;
import com.example.leidong.myview.views.simpleViews.Point;
import com.example.leidong.myview.views.simpleViews.Points;
import com.example.leidong.myview.views.simpleViews.Rectangle;
import com.example.leidong.myview.views.simpleViews.RoundRectangle;

public class MainActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_main);

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
