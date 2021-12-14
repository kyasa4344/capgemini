package letslearnonmonday;
class Lamp{
	boolean isOn;
	void turnOn(){
		isOn=true;
		System.out.println("light is :" +isOn);
		
	}
	void turnOff() {
		isOn=false;
		System.out.println("light is : " +isOn);
	}
	
}

public class classandobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lamp led=new Lamp();
		led.turnOn();
		led.turnOff();
		
	}
	

}
