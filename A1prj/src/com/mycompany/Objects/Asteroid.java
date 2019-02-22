package com.mycompany.Objects;

import java.util.Random;

import com.mycompany.GameObjects.*;

public class Asteroid extends MoveableGameObject {
	
	private int size;
	
	public Asteroid(){
		this.size = rSize();
		super.setColor(255,255,255);
		super.setX(rDirection());
		super.setY(rDirection());
		super.setDirection(rDirection());
		super.setSpeed(rSpeed());
	}
	
	public void setSize(int Size){
		this.size = Size;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public int rSize(){
		int max = 30;
		int min = 6;
		Random randomNum = new Random();
		int randomNumber = min + randomNum.nextInt(max);
		return randomNumber;
	}
	
	public int rSpeed(){
		int max = 10;
		int min = 1;
		Random randomNum = new Random();
		int randomNumber = min + randomNum.nextInt(max);
		return randomNumber;
	}
	
	public int rDirection() {
		int max = 359;
		int min = 0;
		Random randomNum = new Random();
		int randomNumber = min + randomNum.nextInt(max);
		return randomNumber;
	}
	
	
	public void move(){
		 super.move();
	}
	

	public String toString(){
		return (
			"Astroid : loc="+super.getX() + "," + super.getY() +
			" Color="  + super.getColor()+
			" Speed="  + super.getSpeed() +
			" dir="    + super.getDirection()+
			" Size="   + this.getSize()
				);
	}
}



	