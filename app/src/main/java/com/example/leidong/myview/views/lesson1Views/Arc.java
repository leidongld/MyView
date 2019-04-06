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

        Shader shader = new LinearGradient(100, 100, 500, 500, Color.parseColor("#E91E63"), Color.parseColor("#2196F3"), Shader.TileMode.CLAMP);
        mPaint.setShader(shader);

        mPaint.setStyle(Paint.Style.STROKE);
//        mPaint.setColor(Color.parseColor("#FF9800"));
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(30);

        canvas.drawArc(200, 100, 800, 500, 180, 60, false, mPaint);
    }
}
