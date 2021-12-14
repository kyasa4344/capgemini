package Assignment;

public class sumandaverage {

	public static void main(String[] args) {
		// sum and average of first five natural numbers
		int sum=0, count=0,i;
		double avg=0;
		for(i=1;i<=5;i++) {
			
			sum=sum+i;
			count++;
			avg=sum/count;
			}
			System.out.println("sum of first five no. is :"+sum);
			System.out.println("average of first five no. is:" + avg);
		

	}

}
