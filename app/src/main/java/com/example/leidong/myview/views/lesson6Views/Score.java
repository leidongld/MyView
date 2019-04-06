package com.example.leidong.myview.views.lesson6Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.example.leidong.myview.R;

/**
 * Created by Lei Dong on 2019/4/6.
 */
public class Score extends View {
    private Paint mPaint = new Paint();

    private float score = 0;

    public Score(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void setScore(float score) {
        this.score = score;
        invalidate();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Shader shader = new LinearGradient(100, 100, 800, 800, Color.YELLOW, Color.RED, Shader.TileMode.CLAMP);
        mPaint.setAntiAlias(true);
        mPaint.setShader(shader);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(80);

        canvas.drawArc(100, 100, 800, 800, 0, score * 3.6f, false, mPaint);

        mPaint.setColor(getResources().getColor(R.color.colorPrimaryDark));
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(20);
        mPaint.setTextSize(100);
        canvas.drawText(obtainScore(score), 250, 475, mPaint);
    }

    /**
     * 处理数据
     *
     * @param score
     * @return
     */
    private String obtainScore(float score) {
        int x = (int) score;
        return String.valueOf(x) + " kCal";
    }
}
