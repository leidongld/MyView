package com.example.leidong.myview.views.lesson1Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.SweepGradient;
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

        Shader shader = new SweepGradient(300, 300, Color.RED, Color.BLUE);
        mPaint.setShader(shader);

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(20);
        mPaint.setAntiAlias(true);

        canvas.drawRoundRect(100, 100, 1000, 600, 50, 50, mPaint);
    }

}
