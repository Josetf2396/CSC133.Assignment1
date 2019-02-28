package com.mycompany.Objects;

import com.mycompany.Interfaces.ISteerable;
import com.mycompany.ObjectTypes.MoveableGameObject;


public class SteerableMissileLauncher extends MoveableGameObject implements ISteerable {
	private int missilecount = 10;
	private static SteerableMissileLauncher weapon;
	
	private SteerableMissileLauncher() {
		super.setX(512);
		super.setY(384);
		super.setDirection(0);
	}
	

	public static SteerableMissileLauncher getWeapon() {
		if (weapon == null) {
			weapon = new SteerableMissileLauncher();
		}
		return weapon;
	}
	
	
	public void setMissiles(int inMissiles) {
		this.missilecount += inMissiles;
	}

	public int getMissiles() {
		return this.missilecount;
	}
	
	public String toString() {
		return " Weapon: " + super.toString();

	}
	
	public int getDirection() {
		return super.getDirection();
	}
	
	public void turnLeft() {
		int currDirection = super.getDirection() + 90;
		super.setDirection(currDirection);
	}

	@Override
	public void turnRight() {
		//unused in this class
		
	}
	public void fire() {
		
	}
	public void move() {
		
	}
	
	public void reload() {
		
	}

}
