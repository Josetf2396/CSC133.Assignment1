package com.mycompany.a1;

import java.util.Vector;
import java.util.Iterator;
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
		System.out.println("A new Asteroid has been created " + rock.toString());

	}

	public void nonPlayerShip() {
		NonPlayer nps = new NonPlayer();
		gObjects.add(nps);
		gObjects.add(new MissileLauncher(nps.getDirection(), nps.getX(), nps.getY()));
		System.out.println("The NonPlayer has been added" + nps.toString());
	}

	public void blinkingStation() {
		SpaceStation station = SpaceStation.getSpaceStation();
		station.setBlinkrate(2);
		gObjects.add(station);

		for (int i = 0; i < gObjects.size(); i++) {
			if (gObjects.elementAt(i) instanceof FixGameObject) {
				if ((!gObjects.contains(station))) {
					gObjects.add(station);
					System.out.println("Space Station has been added :" + station.toString());
					break;
				} else {
					System.out.println("space station exists");
					station.toString();
					break;
				}
			}
		}
	}

	public void playerShip() {
		Player playership = Player.getShip();
		if ((!gObjects.contains(playership))) {
			gObjects.add(playership);
			gObjects.add(new MissileLauncher(playership.getDirection(), playership.getX(), playership.getY()));
			System.out.println("Your Ship has been added " + playership.toString());
		} else {
			System.out.println("Ship Already exist");
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
		 * ShipObject) { Player playership = (Player) gObjects.elementAt(i);
		 * playership.incSpeed(); if (playership.getMissiles() > 0)
		 * System.out.println("Fire"); gObjects.add(new
		 * Missile(playership.getDirection(), playership.getSpeed(), playership.getX(),
		 * playership.getY())); playership.fire();
		 * 
		 * if (playership.getMissiles() == 0) // accidently removes ship
		 * System.out.println("0 Missles, Head Back to the Station"); } }
		 * 
		 * } Player playership = Player.getShip(); if ((gObjects.contains(playership)))
		 * { if (playership.getMissiles() > 0) { System.out.println("Fire"); }
		 * gObjects.add(new Missile(playership.getDirection(), playership.getSpeed(),
		 * playership.getX(), playership.getY())); playership.fire(); if
		 * (playership.getMissiles() == 0) {
		 * System.out.println("0 Missles, Head Back to the Station"); } } else {
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
	}

	public void hitNPS() {

	}

	public void collideAstroid() {

	}

	public void colliseAstroidNPS() {

	}

	public void tick() {
		System.out.println("Current tick:" + this.tick);
		tick++;
		System.out.println("Elapsed time:" + this.tick);
		for (int i = 0; i < gObjects.size(); i++) {

			if (gObjects.elementAt(i) instanceof Player) {
				Player playership = (Player) gObjects.elementAt(i);
				playership.move();
				System.out.println("The player is moving" + playership.toString());
			}
			
			if (gObjects.elementAt(i) instanceof NonPlayer) {
				Player NonPlayer = (Player) gObjects.elementAt(i);
				NonPlayer.move();
				System.out.println("The NonPlayer is moving" + NonPlayer.toString());
			}

			if (gObjects.elementAt(i) instanceof Asteroid) {
				Asteroid rock = (Asteroid) gObjects.elementAt(i);
				rock.move();
				System.out.println("This rock is moving" + rock.toString());

			}

			if (gObjects.elementAt(i) instanceof Missile) {
				Missile missile = (Missile) gObjects.elementAt(i);
				if (missile.getFuelLevel() > 0) {
					missile.move();
					System.out.println("This Missile is moving" + missile.toString());
				}
				if (missile.getFuelLevel() == 0)
					System.out.println("Missile ran out of fuel" + missile.toString());
				gObjects.removeElementAt(i);
			}
		}
	}

	public void print() {

	}

	public void map() {
		Iterator<GameObject> itr = gObjects.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
	}

	public void quit() {
		System.exit(0);

	}
}
