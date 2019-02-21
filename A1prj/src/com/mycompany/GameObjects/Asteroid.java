package com.mycompany.GameObjects;

import com.mycompany.Interfaces.IMoveable;

public class Asteroid implements IMoveable {
	private int size;
	
	public Asteroid(){
		super(ColorUtil.BLACK);
		final int MIN_SIZE=6;
		final int MAX_SIZE=30;
		this.size = GameObject.rand.netInt(MAX_SIZE-MIN_SIZE+1)+MIN_SIZE;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public String toString(){
		return (
			"Astroid : loc="+GameObject.round(getX()) + "," + GameObject.round(getY()) +
			" Color="  + GameObject.getColorString(getColor())+
			" Speed="  + GameObject.round(getSpeed()) +
			" dir="    + getDirection()+
			" Size="   + this.getSize()
				);
	}

	@Override
	public void move(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDirection() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setY(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSpeed(int Speed) {
		// TODO Auto-generated method stub
		
	}
}
