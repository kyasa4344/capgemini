package Assignment;


public abstract class animal {
	public abstract void sound();

}
	class dog extends animal{
		public void sound() {
			System.out .println("dog barks  BOW BOW!!!!!!!!!");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog();
		d.sound();
	}



}
