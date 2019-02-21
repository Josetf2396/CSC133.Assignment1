package com.mycompany.GameObjects;

import com.mycompany.Interfaces.*;

public abstract class MoveableGameObject extends GameObject implements IMoveable {

	
	private int speed;
	private int direction;
	/**
	 * @Constuctor
	 */
	public MoveableObject(){
		
	}
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
		
	}
	
	public String toString(){
		return super.toString() + "Speed= " + this.speed + 
								" Direction=  " + this.direction;
	}
	
}
