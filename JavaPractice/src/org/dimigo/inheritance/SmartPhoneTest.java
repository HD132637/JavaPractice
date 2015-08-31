package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone a[] = {new iPhone("iPhone 6", "애플", 700000), new Galaxy("갤럭시 S6","삼성", 650000)};
		
		for(int i=0; i<2; i++){
			System.out.println(a[i]);
			a[i].turnOn();
			a[i].pay();
			
			a[i].useSpecicalFunction();
			
			a[i].turnOff();
			System.out.println();
		}
		
		
		
		
	}
}
