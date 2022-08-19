/**
 * 
 * @author Michael Elder
 * 		   CS 131 Final Programming Project
 *		   Location class creates a location object to where you can move certain objects such as BrownBear and Goldfinch.
 */
import java.util.Arrays;

public class Location {
	private int xCoord;
	private int yCoord;
	
	/**
	 * Empty argument constructor that sets xCoord and yCoord = 0
	 */
	public Location() {
		super();
		xCoord = 0;
		yCoord = 0;
	}//end empty argument constructor
	
	/**
	 * Preferred constructor passing in the parameters:
	 * @param x
	 * @param y
	 */
	public Location(int x, int y) {
		xCoord = x;
		yCoord = y;
	}//end preferred constructor
	
	/**
	 * Update method setting the xCoord and yCoord
	 * @param x
	 * @param y
	 * @return
	 */
	public int update(int x, int y) {
		x = getxCoord();
		y = getyCoord();
		return (x + y);
	}//end update method
	
	/**
	 * getCoordinates method puts the xCoord and yCoord into an array
	 * @return intArray
	 */
	public int[] getCoordinates() {
		int intArray[];
		intArray = new int [2];
		intArray[0] = getxCoord();
		intArray[1] = getyCoord();
		return intArray;
	}//end getCoordinates method
	
	/**
	 * Getter for xCoord
	 * @return xCoord
	 */
	public int getxCoord() {
		return xCoord;
	}//end getxCoord
	
	/**
	 * Setter for xCoord passing in
	 * @param xCoord
	 */
	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}//end setxCoord
	
	/**
	 * Getter for yCoord
	 * @return yCoord
	 */
	public int getyCoord() {
		return yCoord;
	}//end getyCoord
	
	/**
	 * Setter for yCoord
	 * @param yCoord
	 */
	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}//end setyCoord
	
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Location [Coordinates=" + Arrays.toString(getCoordinates()) + "]";
	}//end toString
}//end class
