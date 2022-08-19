/**
 * 
 * @author Michael Elder
 * 		   CS 131 Final Programming Project
 *		   Goldfinch class creates an animal that inherits from the animal class. It also implements two interfaces: flyable and walkable.
 */
public class Goldfinch extends Animal implements Flyable, Walkable {
	private double wingSpan;
	
	/**
	 * Empty argument constructor that sets variables to certain things
	 */
	public Goldfinch() {
		super();
		int simID = 0;
		location = new Location(0,0);
		full = false;
		rested = true;
		wingSpan = 9.0;
	}//end empty argument constructor
	
	/**
	 * Preferred constructor with parameters:
	 * @param simID
	 * @param l
	 * @param ws
	 */
	public Goldfinch(int simID, Location l, double ws, boolean full, boolean rested) {
		super.simID = simID;
		super.location = l;
		super.full = full;
		super.rested = rested;
		this.wingSpan = ws;
	}//end preferred constructor
	
	/**
	 * Getter for wingSpan
	 * @return wingSpan
	 */
	public double getWingSpan() {
		
		return wingSpan;
	}//end getWingSpan
	
	/**
	 * Setter for wingSpan
	 * @param wingSpan
	 */
	public void setWingSpan(double wingSpan) {
		if(wingSpan>=5 && wingSpan<=11) {
		this.wingSpan = wingSpan;}
	}//end setWingSpan
	
	/**
	 * walk method from the walkable interface
	 */
	@Override
	public void walk(int direction) {
		int[] coordinates = location.getCoordinates();
		if(direction > 0) {
			location.update(coordinates[1]+1, coordinates[1]+1);
		}
		if(direction < 0) {
			location.update(coordinates[1]-1, coordinates[1]-1);
		}
	}//end walk method
	
	/**
	 * fly method from the flyable interface
	 */
	@Override
	public void fly(Location l) {
		setLocation(l);
	}
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + ", WingSpan=" + wingSpan + "]";
	}//end toString
}//end class
