package com.mycompany.Objects;

import com.mycompany.Interfaces.ISteerable;
import com.mycompany.ObjectTypes.MoveableGameObject;


public class SteerableMissileLauncher extends MissileLauncher implements ISteerable {
	private int missilecount = 10;
	
	public SteerableMissileLauncher(float x, float y) {
		super.setX(x);
		super.setY(y);
	}
	
	public void setMissiles(int inMissiles) {
		this.missilecount += inMissiles;
	}

	public int getMissiles() {
		return this.missilecount;
	}

	@Override
	public void turnLeft(int degrees) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnRight(int degrees) {
		// TODO Auto-generated method stub
		
	}

	

}
