package com.mycompany.Objects;

import com.mycompany.GameObjects.SteerableGameObject;


public class MissileLauncher extends SteerableGameObject {

	
	public MissileLauncher(int direction, float x, float y) {
		super.setDirection(direction);
		super.setX(x);
		super.setY(y);
	}
	

}
