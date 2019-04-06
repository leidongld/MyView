package com.example.leidong.myview.views.lesson3Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Lei Dong on 2019/3/31.
 */
public class MyTextView extends View {
    private Paint mPaint = new Paint();

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "AguafinaScript-Regular.ttf"));
        mPaint.setTextSize(100);

        canvas.drawText("何皮皮123", 200, 100, mPaint);
    }
}
