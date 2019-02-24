package com.mycompany.Objects;
//Note: Both classes, PlayerShip and MissileLauncher 
//are required to have a composition relation.

import com.mycompany.GameObjects.*;


public class Player extends ShipObject {
	private int missilecount = 10;
	private int lives = 3;
	private static Player shipX;
	
	private Player() {
		super.setX(512);
		super.setY(384);
		super.setDirection(0);
		//super.setColor(0, 300, 10);
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
	
	
}
