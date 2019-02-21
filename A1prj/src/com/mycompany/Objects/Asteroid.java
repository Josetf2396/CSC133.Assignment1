package com.mycompany.Objects;

import com.mycompany.GameObjects.GameObject;
import com.mycompany.GameObjects.MoveableGameObject;

public class Asteroid extends MoveableGameObject {
	private int size;
	
	public Asteroid(){
		super(ColorUtil.BLACK);
		final int MIN_SIZE=6;
		final int MAX_SIZE=30;
		this.size = GameObject.rand.netInt(MAX_SIZE-MIN_SIZE+1)+MIN_SIZE;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public String toString(){
		return (
			"Astroid : loc="+GameObject.round(getX()) + "," + GameObject.round(getY()) +
			" Color="  + GameObject.getColorString(getColor())+
			" Speed="  + GameObject.round(getSpeed()) +
			" dir="    + getDirection()+
			" Size="   + this.getSize()
				);
	}

	