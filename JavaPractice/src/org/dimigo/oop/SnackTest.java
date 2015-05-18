package org.dimigo.oop;

public class SnackTest {
	public static void main(String[] args) {
		Snack[] s1 = new Snack[3];
		s1[0] = new Snack("새우깡", "농심", 1100, 2);
		s1[1] = new Snack("콘칲", "크라운", 1200, 1);
		s1[2] = new Snack("허니버터칩", "해태", 1500, 4);
		
		s1[0].printSnack();
		s1[1].printSnack();
		s1[2].printSnack();
		System.out.println("총 금액 : "+ String.format("%,d",s1[0].calcPrice()+s1[1].calcPrice()+s1[2].calcPrice()) + "원");
	}
	
}
