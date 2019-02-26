package com.mycompany.Objects;

import com.mycompany.ObjectTypes.FixGameObject;

public class SpaceStation extends FixGameObject{
	
	private static SpaceStation station;
	private int blinkrate;

	private SpaceStation() {
	}

	public void blinklights() {

	}

	public static SpaceStation getSpaceStation() {
		if (station == null) {
			station = new SpaceStation();
			station.setUniqueID(45);
			station.setX(210);
			station.setY(800);
		}
		return station;
	}

	public void setBlinkrate(int blink) {
		this.blinkrate = blink;
	}

	public int getBlinkrate() {
		return this.blinkrate;
	}

	public String toString() {
		return "Station:" + super.toString() + "rate=" + this.blinkrate;
	}

}
