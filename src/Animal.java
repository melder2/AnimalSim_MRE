/**
 * 
 * @author Michael Elder
 * 		   CS 131 Final Programming Project
 *		   Animal class creates an abstract object animal that passes in variables and methods for them to be inherited by subclasses.
 */

public abstract class Animal {
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	/**
	 * Empty argument constructor that sets variables to certain things
	 */
	public Animal() {
		simID = 0;
		location = new Location(0,0);
		full = false;
		rested = true;
	}//end empty argument constructor
	/**
	 * Preferred constructor passing in
	 * @param simID
	 * @param l
	 */
	public Animal(int simID, Location l, boolean full, boolean rested) {
		this.simID = simID;
		this.location = l;
		this.full = full;
		this.rested = rested;
	}//end preferred constructor
	
	/**
	 * Eat method
	 * @return false if <=.5 or else: return true
	 */
	public boolean eat() {
		Math.random();
		if (Math.random()<= .5) {
			return false;}
		else 
			return true;
	}//end eat method
	
	/**
	 * Sleep method
	 * @return false if ,=.5 or else: return true
	 */
	public boolean sleep() {
		Math.random();
		if (Math.random()<= .5) {
			return false;}
		else 
			return true;
	}//end sleep method
	
	/**
	 * Getter for simID
	 * @return simID
	 */
	public int getSimID() {
		return simID;
	}//end getSimID
	
	/**
	 * Setter for simID
	 * @param simID
	 */
	public void setSimID(int simID) {
		this.simID = simID;
	}//end setSimID
	
	/**
	 * Getter for location
	 * @return location
	 */
	public Location getLocation() {
		return location;
	}//end getLocation
	
	/**
	 * Setter for location
	 * @param location
	 */
	public void setLocation(Location location) {
		this.location = location;
	}//end setLocation
	
	/**
	 * isFull method
	 * @return full
	 */
	public boolean isFull() {
		return full;
	}//end isFull
	
	/**
	 * Setter for full
	 * @param full
	 */
	public void setFull(boolean full) {
		this.full = full;
	}//end setFull
	
	/**
	 * isRested method
	 * @return rested
	 */
	public boolean isRested() {
		return rested;
	}//end isRested
	
	/**
	 * Setter for rested
	 * @param rested
	 */
	public void setRested(boolean rested) {
		this.rested = rested;
	}//end setRested
	
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Animal [simID=" + simID + ", location=" + location + ", full=" + full + ", rested=" + rested
				+ ", eat()=" + eat() + ", sleep()=" + sleep() + ", isFull()=" + isFull() + ", isRested()=" + isRested()
				+ "]";
	}//end toString
}//end class
