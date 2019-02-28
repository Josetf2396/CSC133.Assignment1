package com.mycompany.Objects;

import com.mycompany.ObjectTypes.SteerableGameObject;


public class MissileLauncher extends SteerableGameObject {
	private int missilecount = 10;
	
	public MissileLauncher(float x, float y) {
		super.setX(x);
		super.setY(y);
	}
	
	public void setMissiles(int inMissiles) {
		this.missilecount += inMissiles;
	}

	public int getMissiles() {
		return this.missilecount;
	}

	

}
