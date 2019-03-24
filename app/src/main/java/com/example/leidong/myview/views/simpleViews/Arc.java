package com.example.leidong.myview.views.simpleViews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Lei Dong on 2019/3/24.
 */
public class Arc extends View {
    private Paint mPaint = new Paint();

    public Arc(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * Draw arc
     *
     * @param canvas
     */
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.RED);
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(30);

        canvas.drawArc(200, 100, 800, 500, 180, 60, false, mPaint);
    }
}
