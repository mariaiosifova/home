package com.example.home;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

import androidx.core.content.ContextCompat;

public class home extends View {
    public home(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(Color.CYAN);
        canvas.drawPaint(p);
        p.setColor(Color.YELLOW);
        canvas.drawCircle(0, 0, 350, p);
        p.setColor(Color.WHITE);
        canvas.drawOval(450, 350, 850, 500, p);
        canvas.drawOval(100, 527, 347, 700, p);
        p.setColor(Color.GREEN);
        canvas.drawOval(644, 520, 943, getHeight()/2 + 700, p);
        p.setColor(Color.BLACK);
        canvas.drawRect(765, getHeight()/2 + 630, 795, getHeight()/2 + 760, p);
        p.setColor(Color.GRAY);
        canvas.drawRect(50, getHeight()/2 - 56, getWidth()/2 - 56, getHeight(), p);
        p.setColor(Color.WHITE);
        int x = 75;
        int y = getHeight()/2;
        int xd = 150;
        int yd = getHeight()/2 + 75;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 10; i++) {
                canvas.drawRect(x, y, xd, yd, p);
                y += 105;
                yd += 105;
                }
            x += 144;
            xd += 144;
            y = getHeight()/2;
            yd = getHeight()/2 + 75;
        }
        
    }
}
