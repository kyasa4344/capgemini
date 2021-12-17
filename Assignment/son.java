package letslearnonmonday;
class child {
	
	void display() {
		System.out.println("child class");
		
	}
}

	


public class son extends child {
	void display() {
	System.out.println("child class");
	
}
	void printMsg() {
	display();
	super.display();
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	child obj =new son();
	obj.display();
}

}