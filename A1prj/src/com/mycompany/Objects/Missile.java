package com.mycompany.Objects;

import com.mycompany.ObjectTypes.MoveableGameObject;

public class Missile extends MoveableGameObject {

	private int fuel;
	
	public Missile(int speed, int direction, float x, float y) {
		this.fuel = 10;
		super.setSpeed(speed + 10);
		super.setDirection(direction);
		super.setX(x);
		super.setY(y);
	}
	
	public void move() {
		this.fuel -= 1;
		super.move();

	}

	public int getFuelLevel() {
		return this.fuel;
	}
	
	public void setFuelLevel(int fuel) {
		this.fuel = fuel;
	}

	public String toString(){
		return 
				" Missile: " + super.toString() + 
				"fuel=" + this.fuel; 
	}

}
