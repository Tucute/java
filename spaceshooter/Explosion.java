package com.example.spaceshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Explosion {
    Bitmap explosion[] = new Bitmap[9];
    int explosionFrame;
    int eX, eY;

    public Explosion(Context context, int eX, int eY) {
        explosion[0] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosition00);
        explosion[1] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosition01);
        explosion[2] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosition02);
        explosion[3] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosition03);
        explosion[4] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosition04);
        explosion[5] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosition05);
        explosion[6] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosition06);
        explosion[7] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosition07);
        explosion[8] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.explosition07);
        explosionFrame = 0;
        this.eX = eX;
        this.eY = eY;
    }

    public Bitmap getExplosion(int explosionFrame){
        return explosion[explosionFrame];
    }
}
