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
public class Points extends View {
    private Paint mPaint = new Paint();

    public Points(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * Draw points
     *
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(50);
        mPaint.setStrokeCap(Paint.Cap.ROUND);

        float[] points = {100, 100, 100, 500, 500, 100, 500, 500};
        canvas.drawPoints(points, 0, 8, mPaint);
    }
}
