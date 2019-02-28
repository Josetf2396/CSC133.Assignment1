package com.mycompany.ObjectTypes;

public abstract class FixGameObject extends GameObject{

	private int uniqueid;

	
	public void setUniqueID(int inID){
		this.uniqueid = inID;
	}

	public int getUniqueid() {
		return this.uniqueid;
				
	}
	
}
