package com.mycompany.a1;

import java.util.Vector;
import com.mycompany.GameObjects.*;
import com.mycompany.Objects.*;

public class GameWorld {
	private int lives;
	private int tick;
	private Vector<GameObject> gObjects;

	public void init() {
		tick = 0;
		lives = 3;
		gObjects = new Vector<GameObject>();
	}

	// additional methods here to manipulate world objects and related game state
	// data
	public void addNewAstroid() {
		Asteroid asteroid = new Asteroid();
		gObjects.add(asteroid);
		System.out.println("A new Asteroid has been created.");
	}

	public void nonPlayerShip() {
		Player nonplayership = Player.getShip();
		for (int i = 0; i < gObjects.size(); i++) {
			if (gObjects.elementAt(i) instanceof MoveableGameObject) {
				if ((!gObjects.contains(nonplayership))) {
					gObjects.add(nonplayership);
					break;
				} else {
					System.out.println("Ship Already exits");
					nonplayership.toString();
					break;
				}
			}
		}

	}

	public void blinkingStation() {

	}

	public void playerShip() {
		Player playership = Player.getShip();
		for (int i = 0; i < gObjects.size(); i++) {
			if (gObjects.elementAt(i) instanceof MoveableGameObject) {
				if ((!gObjects.contains(playership))) {
					gObjects.add(playership);
					break;
				} else {
					System.out.println("Ship Already exits");
					playership.toString();
					break;
				}
			}
		}

	}

	public void increaseSpeed() {

	}

	public void decreaseSpeed() {

	}

	public void turnLeft() {

	}

	public void turnRight() {

	}

	public void turnMissleLauncher() {

	}

	public void fire() {

	}

	public void launchNPSMissle() {

	}

	public void jump() {

	}

	public void reloadMissle() {

	}

	public void eliminateAstroid() {

	}

	public void eliminateNPS() {

	}

	public void explodePS() {

	}

	public void crashPS() {

	}

	public void hitNPS() {

	}

	public void collideAstroid() {

	}

	public void colliseAstroidNPS() {

	}

	public void tick() {

	}

	public void print() {

	}

	public void map() {

	}

	public void quit() {

	}
}
