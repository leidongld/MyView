package com.example.leidong.myview.views.lesson1Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Lei Dong on 2019/3/24.
 */
@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class Heart extends View {
    private Paint mPaint = new Paint();
    private Path mPath = new Path();

    {
        mPath.addArc(200, 200, 400, 400, -225, 225);
        mPath.arcTo(400, 200, 600, 400, -180, 225, false);
        mPath.lineTo(400, 542);
    }

    public Heart(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * Draw heart
     *
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Shader shader = new LinearGradient(100, 100, 500, 500, Color.GREEN, Color.YELLOW, Shader.TileMode.MIRROR);
        mPaint.setShader(shader);

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);

        canvas.drawPath(mPath, mPaint);
    }
}
