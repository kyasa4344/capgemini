package Assignment;

public class employeeobject {
	
	String name;
	String location;
	String designation;
	
	public employeeobject(String name,String location,String designation) {
		
		this.name=name;
		this.location=location;
		this.designation=designation;
		
	}
	void employeedetails()
	{
		System.out.println("employee name is :" +name);
		System.out.println("employee location is :" +location);
		System.out.println("employee designation is :" +designation);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	employeeobject obj1=new employeeobject("abhi","bangalore","analyst");
	employeeobject obj2=new employeeobject("abhilash","washington d c","software engineer");
	employeeobject obj3=new employeeobject("abhilash kyasa","newyork","CEO");
	obj1.employeedetails();
	obj2.employeedetails();
	obj3.employeedetails();
	
	}

}
