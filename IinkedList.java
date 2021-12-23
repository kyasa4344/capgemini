package Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> number=new LinkedList<Integer>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		number.add(60);
		Iterator<Integer> obj=number.iterator();
		while(obj.hasNext()) {
			System.out.println(obj.next());
			
		}
		
		List<Integer> part=number.subList(0, 2);
		
		System.out.println(part);
	}

}
