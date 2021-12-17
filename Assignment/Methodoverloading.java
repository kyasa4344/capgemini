package Assignment2;

class Clothbrand
{
	//Declaring variables
	String brand;
	int id;
	int price;
	String company;
	//Method overloading means same method method name with different arguments
	//Creating methods
	void Details(String brand)
	{
		this.brand=brand;
	}
	//Method with Two arguments
	void Details(String brand,int id)
	{
		Details(brand);
		this.id=id;
	}
	//Method with three arguments
	void Details(String brand,int id,int price)
	{
		Details(brand,id);
		this.price=price;;
	}
	//Method with four arguments
	void Details(String brand,int id,int price,String company)
	{
		Details(brand,id,price);
		this.company=company;
	}
	void studentInfo()
	{
		System.out.println("cloth brand is : "+brand);
		System.out.println("cloth id : "+id);
		System.out.println("cloth price is : "+price);
		System.out.println("company is: "+company);
	}
	
}


public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating object for class
		Clothbrand cloth=new Clothbrand ();
    	//Invoking/Calling method
    	cloth.studentInfo();

	}

}
