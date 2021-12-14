package Assignment;
import java.util.Scanner;
public class areaofcube {

	public static void main(String[] args) {
		// area of cube and rectangle
		int a;
		int area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side of cube?");
		a=sc.nextInt();
		area = 6*a*a;
		System.out.println("area of cube is : "+area);
		int l,b,res;
		System.out.println("enter the length of rectangle?");
		l=sc.nextInt();
		System.out.println("enter the breadth of rectangle?");
		b=sc.nextInt();
		res=(l*b);
		System.out.println("area of rectangle is : "+res);
	}

}
