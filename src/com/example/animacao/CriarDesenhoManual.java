package com.example.animacao;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.util.AttributeSet;


public class CriarDesenhoManual extends View{
	private Paint corVermelha;
	public CriarDesenhoManual(Context context, AttributeSet attr) {
		super(context, null);
		// TODO Auto-generated constructor stub
		setBackgroundColor(Color.YELLOW);
		corVermelha = new Paint();
		corVermelha.setARGB(255, 255, 0, 0);
	}
	@Override
	public void onDraw(Canvas canvas){
		super.onDraw(canvas);
		//x,y,raio,cor
		canvas.drawCircle(100, 100, 50, corVermelha);
		/*para criar um novo é so repetir e mudar a posição
		 * canvas.drawCircle(x, y, raio, cor);
		 */
		
	}

}
