package Assignment;
import java.util.Scanner;

public class greatestnumber {

	public static void main(String[] args) {
		// program to find the largest number
		int first,second,third;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		first=sc.nextInt();
		System.out.println("enter the second number");
		second=sc.nextInt();
		System.out.println("enter the third number");
		third=sc.nextInt();
		if(first>second) {
			if(first >third) {
				System.out.println("first number is largest"+first);
				}
			else {
				System.out.println("third is largest"+third);
			}
			 {
				if(second>third)
					System.out.println("second is largest"+second);	
			}
		}
			else 
			{
				System.out.println("third is largest"+third);
			}
		}	
}