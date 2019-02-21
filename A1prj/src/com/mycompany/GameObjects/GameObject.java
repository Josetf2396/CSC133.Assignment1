package com.mycompany.GameObjects;

import com.codename1.charts.*;
import com.codename1.charts.util.ColorUtil;

public abstract class GameObject{
	
	private float x;
	private float y;
	static int color;
	ColorUtil colorutil = new ColorUtil();
	private static int r;
	private static int g;
	private static int b;
	
	public float getX() {
		return this.x;
	}
	public void setX(float X){
		this.x = X;
	}
	public float getY() {
		return this.y;
		
	}
	public void setY(float Y) {
		this.y = Y
	}
	
	public int getColor() {
		return this.getColor();
	}
	public void setColor(int R, int G, int B) {
		this.r = R;
		this.g = G;
		this.b = B;
		colorutil.rgb(R,G,B)
	}
	
	public String toString() {
		return "Location = ("this.x +","+this.y+")"
			   " Color = ("+this.r+","+this.g+","+this.b+")";
	}
	
	
	
	
	
}
