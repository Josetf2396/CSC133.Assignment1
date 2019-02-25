package com.mycompany.a1;

import java.util.Vector;
import com.mycompany.ObjectTypes.*;
import com.mycompany.Objects.*;
import com.mycompany.Objects.Asteroid;

public class GameWorld {
	private int tick;
	private Vector<GameObject> gObjects = new Vector<GameObject>();

	public void init() {
		tick = 0;
	}

	// additional methods here to manipulate world objects and related game
	// state
	// data
	public void addNewAstroid() {
		Asteroid rock = new Asteroid();
		gObjects.add(rock);
		System.out.println("A new Asteroid has been created.");
	}

	public void nonPlayerShip() {
		NonPlayer nps = new NonPlayer();
		gObjects.add(nps);
		gObjects.add(new MissileLauncher(nps.getDirection(), nps.getX(), nps.getY()));
		System.out.println("The NonPlayer has been added");
	}

	public void blinkingStation() {

	}

	public void playerShip() {
		Player playership = Player.getShip();
		if ((!gObjects.contains(playership))) {
			gObjects.add(playership);
			gObjects.add(new MissileLauncher(playership.getDirection(), playership.getX(), playership.getY()));
			System.out.println("The Player has been added");
		} else {
			System.out.println("Ship Already exist");
			playership.toString();
		}
	}

	public void increaseSpeed() {
		Player playership = Player.getShip();
		if ((gObjects.contains(playership))) {
			playership.incSpeed();
			System.out.println("Player speed increased: " + playership.toString());
		} else {
			System.out.println("Ship doesn't exist please add player ship first");

		}
	}

	public void decreaseSpeed() {
		Player playership = Player.getShip();
		if ((gObjects.contains(playership))) {
			playership.decSpeed();
			System.out.println("Player speed decreased: " + playership.toString());
		} else {
			System.out.println("Ship doesn't exist please add player ship first");

		}
	}

	public void turnLeft() {
		Player playership = Player.getShip();
		if ((gObjects.contains(playership))) {
			playership.turnLeft(5);
			System.out.println("Player turned left: " + playership.toString());
		} else {
			System.out.println("Ship doesn't exist please add player ship first");

		}
	}

	public void turnRight() {
		Player playership = Player.getShip();
		if ((gObjects.contains(playership))) {
			playership.turnRight(5);
			System.out.println("Player turned right: " + playership.toString());
		} else {
			System.out.println("Ship doesn't exist please add player ship first");

		}
	}

	public void turnMissleLauncher() {

	}

	// Get it done after you finish missle launcher cause missles need the direction
	// of the missle launcher to fire
	public void fire() {
		/*
		 * for (int i = 0; i < gObjects.size(); i++) { if (gObjects.elementAt(i)
		 * instanceof MoveableGameObject) { if (gObjects.elementAt(i) instanceof
		 * ShipObject) { Player shpObj = (Player) gObjects.elementAt(i);
		 * shpObj.incSpeed(); if (shpObj.getMissiles() > 0) System.out.println("Fire");
		 * gObjects.add(new Missile(shpObj.getDirection(), shpObj.getSpeed(),
		 * shpObj.getX(), shpObj.getY())); shpObj.fire();
		 * 
		 * if (shpObj.getMissiles() == 0) // accidently removes ship
		 * System.out.println("0 Missles, Head Back to the Station"); } }
		 * 
		 * } Player playership = Player.getShip(); if ((gObjects.contains(playership)))
		 * { if (playership.getMissiles() > 0) { System.out.println("Fire"); }
		 * gObjects.add(new Missile(shpObj.getDirection(), shpObj.getSpeed(),
		 * shpObj.getX(), shpObj.getY())); shpObj.fire(); if (shpObj.getMissiles() == 0)
		 * { System.out.println("0 Missles, Head Back to the Station"); } } else {
		 * System.out.println("Ship doesn't exist please add player ship first");
		 * 
		 * }
		 */
	}

	public void launchNPSMissle() {

	}

	public void jump() {
		Player playership = Player.getShip();
		if ((gObjects.contains(playership))) {
			System.out.println("HyperSpace Jump: " + playership.toString());
			playership.setX(512);
			playership.setY(384);
		} else {
			System.out.println("Ship doesn't exist please add player ship first");

		}
	}

	public void reloadMissle() {
		Player playership = Player.getShip();
		if ((gObjects.contains(playership))) {
			System.out.println("Reloaded Weapons: " + playership.toString());
			playership.reload();
		} else {
			System.out.println("Ship doesn't exist please add player ship first");

		}
	}

	public void eliminateAstroidByPS() {

	}

	public void eliminateNPSByPS() {

	}

	public void NPSexplodesPS() {

	}

	public void crashPSintoAstroid() {
		Player playership = Player.getShip();
		if ((gObjects.contains(playership))) {
			playership.decrementLives();
			gObjects.remove(playership);
		}

		if (gObjects.contains(instanceof Asteroid)) {
			gObjects.remove(Asteroid)
		}
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
