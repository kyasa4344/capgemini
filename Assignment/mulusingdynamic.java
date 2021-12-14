package Assignment;
import java.util.Scanner;
public class mulusingdynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2, res;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first number ?");
		number1=sc.nextInt();
		System.out.println("enter the second number ?");
		number2=sc.nextInt();
		res=number1*number2;
		System.out.println("multiplication is:" +res);
		sc.close();
	}
	

}
