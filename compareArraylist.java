package Collections;

import java.util.ArrayList;

public class compareArraylist {

	public static void main(String[] args) {
		//creating first arraylist
		ArrayList<String> word=new ArrayList<String>();
		word.add("Hello");
		word.add("I am Abhilash kyasa");
		word.add("I am an employee of");
		word.add("Capgemini");
		word.add("Working as an Analyst");
		System.out.println(word);
		//creating second arraylist
		ArrayList<String> new_one=new ArrayList<String>();
		new_one.add("Hello");
		new_one.add("I am Abhilash kyasa");
		new_one.add("I am an employee of");
		new_one.add("Capgemini");
		new_one.add("Working as an Analyst");
		new_one.remove(0);
		System.out.println(new_one);
		//compare the two arraylist
		ArrayList<String> comp=new ArrayList<String>();
		for(String temp:word) {
			comp.add(new_one.contains(temp)?"true":"false");
			System.out.println(comp);
			
			
		}
		
			
		

	}

}
