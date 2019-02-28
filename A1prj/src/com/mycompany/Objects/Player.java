package com.mycompany.Objects;
//Note: Both classes, PlayerShip and MissileLauncher 
//are required to have a composition relation.

import com.mycompany.Interfaces.ISteerable;
import com.mycompany.ObjectTypes.*;


public class Player extends MoveableGameObject implements ISteerable {
	private int lives = 3;
	private static Player shipX;


	
	private Player() {
		super.setX(512);
		super.setY(384);
		super.setDirection(0);
	}
	
	
	public static Player getShip() {
		if (shipX == null) {
			shipX = new Player();
		}
		return shipX;
	}
	
	public int getLives() {
		return lives;
	}


	public void decrementLives() {
		this.lives = this.lives-1;
	}
	
	public void incSpeed() {
		int currentSpeed = super.getSpeed() + 5;
		super.setSpeed(currentSpeed);
	}

	public void decSpeed() {
		if (super.getSpeed() <= 0) {
			super.setSpeed(0);
		}
		int currentSpeed = super.getSpeed() - 5;
		super.setSpeed(currentSpeed);
	}
	
	public void move() {
		super.move();
	}
	
	public String toString() {
		return " Ship: " + super.toString();

	}

	public void turnLeft() {
		int currDirection = super.getDirection() + 90;
		super.setDirection(currDirection);
		
	}


	public void turnRight() {
		int currDirection = super.getDirection() - 90;
		super.setDirection(currDirection);
	}


	
}
