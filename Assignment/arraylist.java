import java.util.*; 
public class arraylist {
	 
	 
	public static void main(String args[]){  
	ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	list.add("Ravi");//Adding object in arraylist  
	list.add("Abhi");  
	list.add("Amit");  
	list.add("Shiv ");    
	Iterator itr=list.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  

