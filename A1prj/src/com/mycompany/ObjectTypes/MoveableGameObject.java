package com.mycompany.ObjectTypes;

import com.mycompany.Interfaces.*;

public abstract class MoveableGameObject extends GameObject implements IMoveable {

	
	private int speed;
	private int direction;

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return this.speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	 * @return the direction
	 */
	public int getDirection() {
		return this.direction;
	}
	/**
	 * @param direction the direction to set
	 */
	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	public void move(){
		float dX;
		float dY;
		float theta;
		float newX;
		float newY;
		theta = 90 - this.direction; 
		dX = (float) Math.cos(theta);
		dY = (float) Math.sin(theta);
		newX = (float) (Math.toDegrees(dX) * this.speed) + super.getX();
		newY = (float) (Math.toDegrees(dY) * this.speed) + super.getY();
		super.setX(newX);
		super.setY(newY);
	}
	
	public String toString(){
		return super.toString() + " Speed= " + this.speed + 
								" Direction=  " + this.direction;
	}
	
}
