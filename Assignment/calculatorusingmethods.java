package letslearnonmonday;

public class calculatorusingmethods {
	static void add(int a, int b)
	{
		int add;
		add=a+b;
		System.out.println("addition is :" + add);
	}
	static void sub(int a, int b)
	{
		int res;
		res=a-b;
		System.out.println("subtraction is :" + res);
		
	}
	static void mul(int a,int b)
	{
		int res;
		res=a*b;
		System.out.println("multiplication is :"+res);
		
		
	}
	static void div(int a, int b)
	{
		int res;
		res=a/b;
		System.out.println("division is :" +res);
		
	}
	public static void main(String[] args) {
		calculatorusingmethods obj=new calculatorusingmethods();
		obj.add(10, 20);
		obj.sub(10, 20);
		obj.mul(10, 20);
		obj.div(20, 10);
		
		
	}
	}


