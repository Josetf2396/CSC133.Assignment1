package com.mycompany.Objects;

import java.util.Random;

import com.mycompany.ObjectTypes.*;

public class NonPlayer extends SteerableGameObject{


	private int missilecount = 10;
	private static NonPlayer shipX;
	
	public NonPlayer() {
		super.setX(randNum());
		super.setY(randNum());
		super.setDirection(randNum());
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
	
	public int randNum() {
		int max = 359;
		int min = 0;
		Random randomNum = new Random();
		int randomNumber = min + randomNum.nextInt(max);
		return randomNumber;
	}
	
	public String toString() {
		return "Ship: " + super.toString() + " MissileCount=" + this.missilecount;

	}
}
