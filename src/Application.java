import java.util.ArrayList;

/**
 * 
 * @author Michael Elder
 * 		   CS 131 Final Programming Project
 *		   Application class that creates a BrownBear and Goldfinch and tests
 */
public class Application {

	public static void main(String[] args) {
		
		BrownBear bear = new BrownBear(1, new Location(1,1), false, true, "Grizzly");
		Goldfinch finch = new Goldfinch(2, new Location(1,1), 11.2, false, true);
		Location testLoc = new Location(51, 102);
		//Animal an = new Animal(3,new Location(1,1), true, true);
		
			System.out.println("***********************************************");
			
			System.out.println("Location Test: ");
			System.out.println(testLoc.toString());
			//Printing a test location
			
			System.out.println("***********************************************");
			System.out.println("***********************************************");
			
			System.out.println("Animal Test: ");
			//System.out.println(animal);
			System.out.println("You can't instantiate the type Animal");
			
			System.out.println("***********************************************");
			System.out.println("***********************************************");
			System.out.println("Goldfinch Test: ");
			System.out.println(finch.toString());
				finch.eat();
				finch.sleep();
				finch.setWingSpan(9.2);
				finch.fly(new Location(100,200));
				finch.walk(9);
				finch.walk(-1);
				finch.setSimID(2);
			System.out.println("Eat: " + finch.eat());
			System.out.println("Sleep: " + finch.sleep());
			System.out.println(finch.toString());
				finch.setRested(false);
				finch.setFull(true);
			System.out.println("Rested?" + bear.isRested());
			System.out.println("Full?" + bear.isFull());
			//Tests out different methods and runs the toString method
			
			System.out.println("***********************************************");
			System.out.println("***********************************************");
			
			System.out.println("BrownBear Test: ");
			System.out.println(bear.toString());
				bear.eat();
				bear.sleep();
				bear.walk(1);
				bear.walk(1);
				bear.walk(-1);
				bear.setSimID(3);
			System.out.println("Eat: " + finch.eat());
			System.out.println("Sleep: " + finch.sleep());
			System.out.println(bear.toString());
				bear.setRested(true);
				bear.setFull(true);
			System.out.println("Rested?" + bear.isRested());
			System.out.println("Full?" + bear.isFull());
			//Tests out different methods and runs the toString method
			
			System.out.println("***********************************************");
			System.out.println("***********************************************");
			
			System.out.println("Generics Test: ");
				ArrayList<Animal> arList = new ArrayList<>();
				arList.add(finch);
				arList.add(bear);
				arList.add(new Goldfinch());
				arList.add(new BrownBear());
				for (Animal animals : arList)
					System.out.println(animals.toString());
			System.out.println("***********************************************");
	
	}//end main
}//end class
