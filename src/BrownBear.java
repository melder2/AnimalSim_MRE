/**
 * 
 * @author Michael Elder
 * 		   CS 131 Final Programming Project
 *		   Brownbear class creates an animal that inherits from the animal class. It also implements two interfaces: walkable and swimmable.
 */
public class BrownBear extends Animal implements Walkable, Swimmable{
	private String subSpecies;
	
	/**
	 * Empty argument constructor that sets variables to certain things 
	 */
	public BrownBear() {
		super();
		simID = 0;
		location = new Location(0,0);
		full = false;
		rested = true;
		subSpecies = "Alaskan";
	}//end empty argument constructor
	
	/**
	 * Preferred constructor passing in the parameters:
	 * @param simID
	 * @param l
	 * @param subSpecies
	 */
	public BrownBear(int simID, Location l, boolean full, boolean rested, String subSpecies) {
		super.simID = simID;
		super.location = l;
		super.full = full;
		super.rested = rested;
		this.subSpecies = subSpecies;
	}//end preferred constructor
	
	/**
	 * Getter for subSpecies
	 * @return subSpecies
	 */
	public String getSubSpecies() {
		return subSpecies;
	}//end getSubSpecies
	
	/**
	 * Setter for subSpecies
	 * @param subSpecies
	 */
	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
	}//end setSubSpecies
	
	/**
	 * swim method from the swimmable interface
	 */
	@Override
	public void swim(int direction) {
		int[] coordinates = location.getCoordinates();
		if(direction > 0) {
			location.update(coordinates[1]+2, coordinates[1]+2);
		}
		if(direction < 0) {
			location.update(coordinates[1]-2, coordinates[1]-2);
		}
	}//end swim method
	
	/**
	 * walk method from the walkable interface
	 */
	@Override
	public void walk(int direction) {
		int[] coordinates = location.getCoordinates();
		if(direction > 0) {
			location.update(coordinates[1]+3, coordinates[1]+3);
		}
		if(direction < 0) {
			location.update(coordinates[1]-3, coordinates[1]-3);
		}
	}//end walk method
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString
}//end class
