package Collections;

import java.util.ArrayList;
import java.util.Collections;



public class sorting {

	public static void main(String[] args) {
		//creating the arraylist
		ArrayList<String> animal=new ArrayList<String>();
		animal.add("dog");
		animal.add("cat");
		animal.add("ant");
		animal.add("fish");
		animal.add("bat");
		animal.add("elephant");
		System.out.println("animals before sorting are " +animal);
		System.out.println(animal);
		Collections.sort(animal,Collections.reverseOrder());
		System.out.println("animal after sorting are " +animal);
		
		
		
		
	}

}
