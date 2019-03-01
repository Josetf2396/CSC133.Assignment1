package com.mycompany.a1;

import java.util.Vector;
import java.util.Iterator;
import com.mycompany.ObjectTypes.*;
import com.mycompany.Objects.*;
import com.mycompany.Objects.Asteroid;

public class GameWorld {
	private int tick;
	private int score;
	private Vector<GameObject> gObjects = new Vector<GameObject>();

	public void init() {
		tick = 0;
		score = 0;
	}

	public void addNewAstroid() {
		Asteroid rock = new Asteroid();
		gObjects.add(rock);
		System.out.println("A new Asteroid has been created " + rock.toString());

	}

	public void nonPlayerShip() {
		NonPlayer nps = new NonPlayer();
		gObjects.add(nps);
		System.out.println("The NonPlayer has been added" + nps.toString());
	}

	public void blinkingStation() {
		SpaceStation station = SpaceStation.getSpaceStation();
		station.setBlinkrate(2);
		if ((!gObjects.contains(station))) {
			gObjects.add(station);
			System.out.println("Space Station has been added :" + station.toString());
		} else {
			System.out.println("space station exists");
			station.toString();
		}
	}

	public void playerShip() {
		Player playership = Player.getShip();
		SteerableMissileLauncher weapon = SteerableMissileLauncher.getWeapon();
		if ((!gObjects.contains(playership))) {
			gObjects.add(playership);
			gObjects.add(weapon);
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
			playership.turnLeft();
			System.out.println("Player turned left: " + playership.toString());
		} else {
			System.out.println("Ship doesn't exist please add player ship first");

		}
	}

	public void turnRight() {
		Player playership = Player.getShip();
		if ((gObjects.contains(playership))) {
			playership.turnRight();
			System.out.println("Player turned right: " + playership.toString());
		} else {
			System.out.println("Ship doesn't exist please add player ship first");

		}
	}

	public void turnMissleLauncher() {
		SteerableMissileLauncher weapon = SteerableMissileLauncher.getWeapon();
		Player playership = Player.getShip();
		if ((gObjects.contains(playership))) {
			weapon.turnLeft();
			System.out.println("Turned MissileLauncher: " + weapon.toString());
		} else {
			System.out.println("Ship doesn't exist please add player ship first");

		}

	}

	// Get it done after you finish missle launcher cause missles need the
	// direction
	// of the missle launcher to fire
	public void fire() {

		Player playership = Player.getShip();
		SteerableMissileLauncher weapon = SteerableMissileLauncher.getWeapon();
		if ((gObjects.contains(playership))) {
			if (weapon.getMissiles() > 0) {
				System.out.println("Fire");
			}
			gObjects.add(new Missile(weapon.getDirection(), weapon.getSpeed(), weapon.getX(), weapon.getY()));
			weapon.fire();
			if (weapon.getMissiles() == 0) {
				System.out.println("0 Missles, Head Back to the Station");
			}
		} else {
			System.out.println("Ship doesn't exist please add player ship first");

		}

	}

	public void launchNPSMissle() {
		for (int i = 0; i < gObjects.size(); i++) {
			if (gObjects.elementAt(i) instanceof MoveableGameObject) {
				if (gObjects.elementAt(i) instanceof NonPlayer) {
					MoveableGameObject currNPS = (MoveableGameObject) gObjects.elementAt(i);
					gObjects.add(
							new Missile(currNPS.getDirection(), currNPS.getSpeed(), currNPS.getX(), currNPS.getY()));
				}
			}
		}
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
		SteerableMissileLauncher weapon = SteerableMissileLauncher.getWeapon();
		Player playership = Player.getShip();

		if ((gObjects.contains(weapon))) {
			System.out.println("Reloaded Weapons: " + playership.toString());
			weapon.reload();
		} else {
			System.out.println("Ship doesn't exist please add player ship first");

		}
	}

	public void eliminateAstroidByPS() {
		boolean removedMissile = false;
		boolean removedAsteroid = false;
		for (int i = 0; i < gObjects.size(); i++) {
			if (!removedMissile && gObjects.elementAt(i) instanceof MoveableGameObject) {
				if (gObjects.elementAt(i) instanceof Missile) {
					gObjects.removeElementAt(i);
					removedMissile = true;
				}

				if (!removedAsteroid && gObjects.elementAt(i) instanceof Asteroid) {
					gObjects.removeElementAt(i);
					removedAsteroid = true;
				}
			}
			if (removedMissile == true && removedAsteroid == true) {
				System.out.println("Player eliminated Asteroid +2");
				score=score+2;
				break;
			}
		}
	}

	public void eliminateNPSByPS() {
		boolean removedMissile = false;
		boolean removedNPS = false;
		for (int i = 0; i < gObjects.size(); i++) {
			if (gObjects.elementAt(i) instanceof MoveableGameObject) {
				if (!removedMissile && gObjects.elementAt(i) instanceof Missile) {
					gObjects.removeElementAt(i);
					removedMissile = true;
				}

				if (!removedNPS && gObjects.elementAt(i) instanceof NonPlayer) {
					gObjects.removeElementAt(i);
					removedNPS = true;
				}
			}
			if (removedMissile == true && removedNPS == true) {
				System.out.println("Player eliminted nps +3");
				score = score+5;
				break;
			}
		}
	}

	public void NPSexplodesPS() {
		boolean removedMissile = false;
		boolean removedPS = false;
		for (int i = 0; i < gObjects.size(); i++) {
			Player playership = Player.getShip();
			if (!removedMissile && gObjects.elementAt(i) instanceof MoveableGameObject) {
				if (gObjects.elementAt(i) instanceof Missile) {
					gObjects.removeElementAt(i);
					removedMissile = true;
				}

				if (!removedPS && gObjects.elementAt(i) instanceof Player) {
					playership.decrementLives();
					gObjects.removeElementAt(i);
					removedPS = true;

				}
			}
			if (removedMissile == true && removedPS == true) {
				System.out.println("NPS has Exploded PS");
				score = score-3;
				playership.decrementLives();
				break;
			}

		}

	}

	public void crashPSintoAstroid() {
		Player playership = Player.getShip();

		if ((gObjects.contains(playership))) {
			playership.decrementLives();
			gObjects.remove(playership);
			score = score-2;
			System.out.println("Player has crashed into an Asteroid");
		}
	}

	public void PScollideNPS() {
		boolean removedPS = false;
		boolean removedNPS = false;
		for (int i = 0; i < gObjects.size(); i++) {
			Player playership = Player.getShip();
			if (gObjects.elementAt(i) instanceof MoveableGameObject) {
				if (!removedNPS && gObjects.elementAt(i) instanceof NonPlayer) {
					gObjects.removeElementAt(i);
					removedNPS = true;
				}

				if (!removedPS && gObjects.elementAt(i) instanceof Player) {
					playership.decrementLives();
					gObjects.removeElementAt(i);
					removedPS = true;
				}
			}
			if (removedNPS == true && removedPS == true) {
				System.out.println("Player and NPS have Collided");
				score = score -2;
				playership.decrementLives();
				break;
			}
		}
	}

	public void collideAstroid() {
		for (int i = 0; i < gObjects.size(); i++) {
			while (gObjects.elementAt(i) instanceof Asteroid) {
				gObjects.removeElement(i);
				System.out.println("Two Asteroids collide");
			}
		}
	}

	public void collideAstroidNPS() {
		boolean removedAsteroid = false;
		boolean removedNPS = false;
		for (int i = 0; i < gObjects.size(); i++) {
			if (gObjects.elementAt(i) instanceof MoveableGameObject) {
				if (!removedNPS && gObjects.elementAt(i) instanceof NonPlayer) {
					gObjects.removeElementAt(i);
					removedNPS = true;
				}

				if (!removedAsteroid && gObjects.elementAt(i) instanceof Asteroid) {
					gObjects.removeElementAt(i);
					removedAsteroid = true;
				}
				if (removedNPS == true && removedAsteroid == true) {
					System.out.println("NPS has collided with an Asteroid");
				}
			}
		}
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
		System.out.println("Score = " + score);
		System.out.println("Elapsed Time = "+ tick);
		
		

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
