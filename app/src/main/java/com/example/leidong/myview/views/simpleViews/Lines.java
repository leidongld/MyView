package com.example.leidong.myview.views.simpleViews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Lei Dong on 2019/3/24.
 */
public class Lines extends View {
    private Paint mPaint = new Paint();

    public Lines(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * Drow lines
     *
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.RED);
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(50);

        float[] points = {50, 50, 300, 50, 650, 300, 1000, 550};
        canvas.drawLines(points, mPaint);
    }
}
