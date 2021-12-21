package Assignment2;

class Employeedatails{
	private String empname;
	private int id;
	private double salary;
	private String location;
	private String project;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	
}
public class Employee {
	public static void main(String [] Args) {
		Employeedatails obj = new Employeedatails();
		obj.setEmpname("Abhilash kyasa");
		System.out.println(obj.getEmpname());
		obj.setId(5093377);
		System.out.println(obj.getId());
		obj.setSalary(30000);
		System.out.println(obj.getSalary());
		obj.setLocation("Bangalore");
		System.out.println(obj.getLocation());
		obj.setProject("java");
		System.out.println(obj.getProject());
		
		
		
		
	}
	

}
