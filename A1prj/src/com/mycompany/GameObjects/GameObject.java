package com.mycompany.GameObjects;


//import com.codename1.charts.util.ColorUtil;

public abstract class GameObject{
	
	private float x;
	private float y;
	static int color;
	//private static int r;
	//private static int g;
	//private static int b;
	//ColorUtil colorutil = new ColorUtil();
	
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
		this.y = Y;
	}
	/*
	public int getColor() {
		return this.getColor();
	}
	
	public void setColor(int inr, int ing, int inb) {
		this.r = inr;
		this.g = ing;
		this.b = inb;
		colorutil.rgb(inr, ing, inb);

	}
	
	*/
	
	
}
