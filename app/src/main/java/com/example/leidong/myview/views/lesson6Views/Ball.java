package com.example.leidong.myview.views.lesson6Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Lei Dong on 2019/4/6.
 */
public class Ball extends View {
    private Paint mPaint = new Paint();

    public Ball(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        Shader shader = new LinearGradient(100, 100, 500, 500, Color.RED, Color.YELLOW, Shader.TileMode.CLAMP);
        mPaint.setShader(shader);
        mPaint.setStyle(Paint.Style.FILL);

        canvas.drawCircle(200, 300, 180, mPaint);
    }
}
