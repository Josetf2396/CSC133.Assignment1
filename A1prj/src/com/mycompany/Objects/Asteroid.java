package com.mycompany.Objects;

import java.util.Random;
import com.mycompany.ObjectTypes.*;

public class Asteroid extends MoveableGameObject {
	
	private int size;
	
	
	//Asteroid Constructor
	public Asteroid(){
		this.size = rSize();
		//super.setColor(255,255,255);
		super.setX(rDirection());
		super.setY(rDirection());
		super.setDirection(rDirection());
		super.setSpeed(rSpeed());
	}
	
	//Asteroid size setter
	public void setSize(int Size){
		this.size = Size;
	}
	
	//Asteroid size getter
	public int getSize(){
		return this.size;
	}
	
	//Random number generator for the size
	public int rSize(){
		int max = 30;
		int min = 6;
		Random randomNum = new Random();
		int randomNumber = min + randomNum.nextInt(max);
		return randomNumber;
	}
	
	//Random number generator for the speed
	public int rSpeed(){
		int max = 10;
		int min = 1;
		Random randomNum = new Random();
		int randomNumber = min + randomNum.nextInt(max);
		return randomNumber;
	}
	
	//Random number generator for the direction
	public int rDirection() {
		int max = 359;
		int min = 0;
		Random randomNum = new Random();
		int randomNumber = min + randomNum.nextInt(max);
		return randomNumber;
	}
	
	//calls the move module in GameObject
	public void move(){
		 super.move();
	}
	
	
	public String toString(){
		return (
			"Asteroid : location="+super.getX() + "," + super.getY()+
			" Speed ="+ super.getSpeed() +
			" Direction ="+ super.getDirection()+
			" Size ="+ this.getSize()
				);
	}
	
}



	