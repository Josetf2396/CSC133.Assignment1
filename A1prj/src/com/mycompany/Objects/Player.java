package com.mycompany.Objects;
//Note: Both classes, PlayerShip and MissileLauncher 
//are required to have a composition relation.

import com.mycompany.ObjectTypes.*;


public class Player extends ShipObject {
	private int missilecount = 10;
	private int lives = 3;
	private static Player shipX;
	private static MissileLauncher weapon;

	
	private Player() {
		super.setX(512);
		super.setY(384);
		super.setDirection(0);
		weapon = new MissileLauncher(super.getX(), super.getY());
	}
	
	
	public static Player getShip() {
		if (shipX == null) {
			shipX = new Player();
		}
		return shipX;
	}
	
	public void setMissiles(int inMissiles) {
		this.missilecount += inMissiles;
	}

	public int getMissiles() {
		return this.missilecount;
	}


	public int getLives() {
		return lives;
	}


	public void decrementLives() {
		this.lives = this.lives-1;
	}
	
	public String toString() {
		return "Ship: " + super.toString() + " MissileCount=" + this.missilecount;

	}
	
	
}
