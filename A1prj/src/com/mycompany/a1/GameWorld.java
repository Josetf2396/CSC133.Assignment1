package com.mycompany.a1;

import java.util.Vector;
import com.mycompany.GameObjects.*;
import com.mycompany.Objects.*;

public class GameWorld {
	private int lives;
	private int tick;
	private Vector<GameObject> gObjects= new Vector<GameObject>();

	public void init() {
		tick = 0;
		lives = 3;
	}

	// additional methods here to manipulate world objects and related game
	// state
	// data
	public void addNewAstroid() {
		Asteroid Rock = new Asteroid();
		gObjects.add(Rock);
		System.out.println("A new Asteroid has been created.");
	}

	public void nonPlayerShip() {
		Player nonplayership = Player.getShip();
		for (int i = 0; i < gObjects.size(); i++) {
			if (gObjects.elementAt(i) instanceof MoveableGameObject) {
				if ((!gObjects.contains(nonplayership))) {
					gObjects.add(nonplayership);
					System.out.println("The NonPlayer has been added");
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
					System.out.println("The Player has been added");
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
		for (int i = 0; i < gObjects.size(); i++) {
			if (gObjects.elementAt(i) instanceof MoveableGameObject) {
				if (gObjects.elementAt(i) instanceof Player) {
					Player shpObj = (Player) gObjects.elementAt(i);
					shpObj.incSpeed();
					System.out.println(
							"Player speed increased: " + shpObj.toString());
				}
			}
		}
	}

	public void decreaseSpeed() {
		for (int i = 0; i < gObjects.size(); i++) {
			if (gObjects.elementAt(i) instanceof MoveableGameObject) {
				if (gObjects.elementAt(i) instanceof Player) {
					Player shpObj = (Player) gObjects.elementAt(i);
					shpObj.decSpeed();
					System.out.println(
							"Player speed increased: " + shpObj.toString());
				}
			}
		}

	}

	public void turnLeft() {
		for (int i = 0; i < gObjects.size(); i++) {
			if (gObjects.elementAt(i) instanceof MoveableGameObject) {
				if (gObjects.elementAt(i) instanceof ShipObject) {
					Player shpObj = (Player) gObjects.elementAt(i);
					shpObj.turnLeft(5);
					System.out
							.println("Ship Turned Left: " + shpObj.toString());
				}
			}
		}
	}

	public void turnRight() {
		for (int i = 0; i < gObjects.size(); i++) {
			if (gObjects.elementAt(i) instanceof MoveableGameObject) {
				if (gObjects.elementAt(i) instanceof ShipObject) {
					Player shpObj = (Player) gObjects.elementAt(i);
					shpObj.turnRight(5);
					System.out
							.println("Ship Turned Left: " + shpObj.toString());
				}
			}
		}
	}

	public void turnMissleLauncher() {

	}

	public void fire() {
		for (int i = 0; i < gObjects.size(); i++) {
			if (gObjects.elementAt(i) instanceof MoveableGameObject) {
				if (gObjects.elementAt(i) instanceof ShipObject) {
					Player shpObj = (Player) gObjects.elementAt(i);
					shpObj.incSpeed();
					if (shpObj.getMissiles() > 0)
						System.out.println("Fire");
					gObjects.add(new Missile(shpObj.getDirection(),
							shpObj.getSpeed(), shpObj.getX(), shpObj.getY()));
					shpObj.fire();

					if (shpObj.getMissiles() == 0) // accidently removes ship
						System.out
								.println("0 Missles, Head Back to the Station");
				}
			}

		}
	}

	public void launchNPSMissle() {

	}

	public void jump() {
		for (int i = 0; i < gObjects.size(); i++) {
			if (gObjects.elementAt(i) instanceof MoveableGameObject) {
				if (gObjects.elementAt(i) instanceof ShipObject) {
					if (gObjects.elementAt(i) instanceof Player) {
						Player shpObj = (Player) gObjects.elementAt(i);
						shpObj.setX(512);
						shpObj.setY(384);
						System.out
								.println("HypeSpace Jump" + shpObj.toString());
					}
				}
			}
		}
	}

	public void reloadMissle() {
		for (int i = 0; i < gObjects.size(); i++)
			if (gObjects.elementAt(i) instanceof MoveableGameObject) {
				if (gObjects.elementAt(i) instanceof ShipObject) {
					if (gObjects.elementAt(i) instanceof Player) {
						Player shpObj = (Player) gObjects.elementAt(i);
						shpObj.reload();
						System.out.println("Missles Reloaded: " + shpObj.toString());
					}
				}
			}
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
		System.exit(0);

	}
}
