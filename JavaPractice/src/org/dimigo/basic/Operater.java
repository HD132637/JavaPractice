package org.dimigo.basic;

public class Operater {

	public static void main(String[] args) {
			
		double s1, h1 = 5.8;
		int a1 = 9, b1 = 10;
		s1 = (a1+b1)*h1 / 2;
		double s2, h2 = 5.4;
		int a2 = 9;
		s2 = a2 * h2;
		System.out.println("<<도형 넓이 비교>>");
		System.out.println("사다리꼴 넓이 : " + s1);
		System.out.println("평행사변형 넓이 : " + s2);
		
		if(s1 > s2){
			System.out.println("사다리꼴이 평행사변형 보다 " + (s1-s2) + " 더 큽니다");
		}
		else
		{
			System.out.println("평행사변형이 사다리꼴 보다 " + (s2-s1) + " 더 큽니다");
		}
	
		}

}
