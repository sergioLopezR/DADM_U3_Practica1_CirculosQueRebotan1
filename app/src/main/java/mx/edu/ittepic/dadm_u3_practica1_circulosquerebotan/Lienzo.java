package mx.edu.ittepic.dadm_u3_practica1_circulosquerebotan;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo extends View {

    Circulo c1, c2, c3, c4, c5, c6, c7, c8;
    public Lienzo(Context context) {
        super(context);

        c1 = new Circulo(300, 200, 120, this, Color.GREEN);
        c2 = new Circulo(500, 700, 150, this, Color.RED);
        c3 = new Circulo(300, 100, 100, this, Color.MAGENTA);
        c4 = new Circulo(300, 600, 80, this, Color.DKGRAY);
        c5 = new Circulo(100, 500, 60, this, Color.YELLOW);

        c1.mover(10);
        c2.mover(8);
        c3.mover(7);
        c4.mover(6);
        c5.mover(14);
    }

    @Override
    protected void onDraw(Canvas c){
        super.onDraw(c);
        Paint p = new Paint();

        c.drawColor(Color.BLUE);
        c1.pintar(c, p);
        c2.pintar(c, p);
        c3.pintar(c, p);
        c4.pintar(c, p);
        c5.pintar(c, p);
    }

    public boolean onTouchEvent(MotionEvent e){
        return true;
    }
}
