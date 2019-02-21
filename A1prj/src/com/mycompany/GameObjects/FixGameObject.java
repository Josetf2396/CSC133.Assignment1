package com.mycompany.GameObjects;

public class FixGameObject extends GameObject{

	private static int uniqueid;

	/**
	 * @return the uniqueID
	 */
	public static int getUniqueID() {
		return this.uniqueid;
	}

	/**
	 * @param uniqueID the uniqueID to set
	 */
	public static void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueid;
	}
	
}
