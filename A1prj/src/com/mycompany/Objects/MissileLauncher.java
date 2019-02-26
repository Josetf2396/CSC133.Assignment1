package com.mycompany.Objects;

import com.mycompany.ObjectTypes.SteerableGameObject;


public class MissileLauncher extends SteerableGameObject {
	private int missilecount = 10;
	private static MissileLauncher weapon;
	
	public MissileLauncher() {
		super.setDirection(direction);
		super.setX(x);
		super.setY(y);
	}
	
	public static MissileLauncher getLauncher() {
		if (weapon == null) {
			weapon = new MissileLauncher();
		}
		return weapon;
	}
	public void setMissiles(int inMissiles) {
		this.missilecount += inMissiles;
	}

	public int getMissiles() {
		return this.missilecount;
	}

	

}
