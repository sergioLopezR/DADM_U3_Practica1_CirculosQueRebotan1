package mx.edu.ittepic.dadm_u3_practica1_circulosquerebotan;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.CountDownTimer;

public class Circulo {
    float x, y, r;
    CountDownTimer timer;
    int desplazamiento, desplazamientoy;
    int color;

    public Circulo(int posx, int posy, int radio, final Lienzo l, int c){
        x = posx;
        y = posy;
        r = radio;
        color = c;

        timer = new CountDownTimer(1000, 30) {
            @Override
            public void onTick(long millisUntilFinished) {
                x += desplazamiento;

                if (x >= l.getWidth() - r){
                    desplazamiento *=-1;
                }
                if (x <=r){
                    desplazamiento *=-1;
                }

                y += desplazamientoy;

                if (y >= l.getHeight() - r){
                    desplazamientoy *= -1;
                }
                if(y <=r){
                    desplazamientoy *= -1;
                }
                l.invalidate();
            }

            @Override
            public void onFinish() {
                start();
            }
        };
    }

    public void pintar(Canvas c, Paint p){
        p.setColor(color);
        c.drawCircle(x, y, r, p);
    }

    public void mover(int d){
        this.desplazamiento = d;
        this.desplazamientoy = d;
        timer.start();
    }
}
