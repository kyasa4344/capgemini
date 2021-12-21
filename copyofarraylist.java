import java.util.ArrayList;
import java.util.List;
public class copyofarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		System.out.println("the numbers are :" +array);
		ArrayList<Integer> number=new ArrayList<Integer>();
		number.add(50);
		number.add(60);
		number.add(70);
		array.addAll(number);
		System.out.println("Numbers after adding the other array are");
		System.out.println("all the numbers are: " +array);
		
		
		
	}

}
