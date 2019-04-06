package com.example.leidong.myview.views.lesson1Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Lei Dong on 2019/3/24.
 */
public class Rectangle extends View {
    private Paint mPaint = new Paint();

    public Rectangle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * Drwa a rectangle
     *
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Shader shader = new RadialGradient(100, 100, 1000, Color.RED, Color.YELLOW, Shader.TileMode.CLAMP);
        mPaint.setShader(shader);

        mPaint.setStrokeWidth(10);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);

        canvas.drawRect(100, 100, 1000, 500, mPaint);
    }
}
