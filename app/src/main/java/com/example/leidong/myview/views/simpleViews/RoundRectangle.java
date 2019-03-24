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
public class RoundRectangle extends View {
    private Paint mPaint = new Paint();

    public RoundRectangle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * Draw round rectangle
     *
     * @param canvas
     */
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(20);
        mPaint.setColor(Color.RED);
        mPaint.setAntiAlias(true);

        canvas.drawRoundRect(100, 100, 500, 300, 50, 50, mPaint);
    }

}
