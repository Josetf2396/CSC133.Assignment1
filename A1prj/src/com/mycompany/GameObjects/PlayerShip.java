package com.mycompany.GameObjects;
//Note: Both classes, PlayerShip and MissileLauncher 
//are required to have a composition relation.

import com.mycompany.Interfaces.IMoveable;
import com.mycompany.Interfaces.ISteerable;

public class PlayerShip implements ISteerable, IMoveable {

	@Override
	public void move(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDirection() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setY(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSpeed(int Speed) {
		// TODO Auto-generated method stub
		
	}
	
	public String toString(){
		return();
	}

	
}