package Assignment2;
class Animalclass
{
	//Creating method for super class
	void food()
	{
		System.out.println("All animals eat food");
		
	}	
	void noise () {
		System.out.println("all animakks make noise........");
		
}

	
}

class Dogs extends Animalclass
{
	//Overriding super class method
	void food() {
		System.out.println("dog eats pedigree....  ");
	}
	void noise() 
	{
		System.out.println("Dog Noise is like Bow...Bow...");
	}
}
class Cat extends Animalclass
{
	//Overriding super class method
	
	void food() {
		System.out.println("cat sound like MEOW....");
	}
	void noise()
	{
		System.out.println("Cat drinks milk......");
	}	
}
class horse extends Animalclass
{
	//Overriding super class method
	void food() {
		System.out.println("horse eats grass....");
	}
	void noise()
	{
		System.out.println("horse Noise like thikddd thikddd...");
	}
}


public class methodoverwriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animalclass d=new Dogs();
		Animalclass a=new Cat();
		a.food();
		a.noise();
		d.food();
		d.noise();
		Animalclass h=new horse();
		h.food();
		h.noise();
	}

}
