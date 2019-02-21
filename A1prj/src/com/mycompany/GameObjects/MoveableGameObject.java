package com.mycompany.GameObjects;

import com.mycompany.Interfaces.*;

public abstract class MoveableGameObject extends GameObject implements IMoveable {

	
	private int speed;
	private int direction;
	/**
	 * @Constuctor
	 */
	public void Moveable(){
		
	}
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
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
		return direction;
	}
	/**
	 * @param direction the direction to set
	 */
	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	public void move(){
		
	}
	
	public String toString(){
		return("S");
	}
	
}
