package com.mycompany.Objects;

import com.mycompany.GameObjects.*;

public class NonPlayer extends SteerableGameObject{


	private int missilecount = 10;
	private static NonPlayer shipX;
	
	public NonPlayer() {
		super.setX(512);
		super.setY(384);
		super.setDirection(0);
		//super.setColor(0, 300, 10);
	}
	
	
	public static NonPlayer getShip() {
		if (shipX == null) {
			shipX = new NonPlayer();
		}
		return shipX;
	}
	
	public void setMissiles(int inMissiles) {
		this.missilecount += inMissiles;
	}

	public int getMissiles() {
		return this.missilecount;
	}
	
}
