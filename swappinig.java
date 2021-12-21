package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class swappinig {

	public static void main(String[] args) {
		//creating the first arraylist
		ArrayList<String> superstar=new ArrayList<String>();
		superstar.add("Micheal Jackson");
		superstar.add("Eminem");
		superstar.add("Virat kohli");
		superstar.add("Kobe bryant");
		superstar.add("Stephen Curry");
	System.out.println("superstars before swapping are "+superstar);
	//swapping the names 
	Collections.swap(superstar,0,4);
	System.out.println("superstars after swapping are : "+superstar);
	
		
	}
	

}
