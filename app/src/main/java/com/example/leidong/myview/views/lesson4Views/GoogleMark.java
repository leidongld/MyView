package com.example.leidong.myview.views.lesson4Views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.leidong.myview.R;

/**
 * Created by Lei Dong on 2019/4/6.
 */
public class GoogleMark extends View {
    private Paint mPaint = new Paint();
    private Camera mCamera = new Camera();

    public GoogleMark(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.save();

        mCamera.rotateX(30);
        float distance = 0f;
        mCamera.translate(distance, distance, 0f);
        mCamera.applyToCanvas(canvas);
        mCamera.translate(-distance, -distance, 0f);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.google);
        canvas.drawBitmap(bitmap, 0, 0, mPaint);

        canvas.restore();
    }
}
