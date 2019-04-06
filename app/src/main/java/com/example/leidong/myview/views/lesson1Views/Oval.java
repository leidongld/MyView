package com.example.leidong.myview.views.lesson1Views;

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

/**
 * Created by Lei Dong on 2019/3/24.
 */
public class Oval extends View {
    private Paint mPaint = new Paint();

    public Oval(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * Draw an oval
     *
     * @param canvas
     */
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Shader shader = new LinearGradient(100, 100, 200, 200, Color.BLUE, Color.GRAY, Shader.TileMode.REPEAT);
        mPaint.setShader(shader);

        mPaint.setStrokeWidth(50);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);

        canvas.drawOval(100, 100, 1000 ,600, mPaint);
    }
}

