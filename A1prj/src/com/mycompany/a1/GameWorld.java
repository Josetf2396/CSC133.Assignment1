package com.mycompany.a1;
import java.util.Vector;
import com.mycompany.GameObjects.*;
import com.mycompany.Objects.*;

public class GameWorld {
	private int lives;
	private int tick;
	private Vector<GameObject> Objects;
	
	public void init() {
		tick = 0;
		lives = 3;
		Objects = new Vector<GameObject>();
	}
	//additional methods here to manipulate world objects and related game state data
	public void addNewAstroid() {
		Asteroid asteroid = New Asteroid();
		store.add(asteroid);
		System.out.println("A new Asteroid has been created.");
		}
	public void nonPlayerShip() {
		
	}
	public void blinkingStation() {
		
	}
	public void playerShip(){
		
	}
	public void increaseSpeed(){
		
	}
	public void deacreaseSpeed(){
		
	}
	public void turnLeft(){
		
	}
	public void turnRight(){
		
	}
	public void turnMissleLauncher(){
		
	}
	public void fire(){
		
	}
	public void launchNPSMissle(){
		
	}
	public void jump(){
		
	}
	public void reloadMissle(){
		
	}
	public void eliminateAstroid(){
		
	}
	public void eliminateNPS(){
		
	}
	public void explodePS(){
		
	}
	public void crashPS(){
		
	}
	public void hitNPS(){
		
	}
	public void collideAstroid(){
		
	}
	public void colliseAstroidNPS(){
		
	}
	public void tick(){
		
	}
	public void print(){
		
	}
	public void map(){
		
	}
	public void quit(){
		
	}
}


