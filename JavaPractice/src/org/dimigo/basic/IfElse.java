package org.dimigo.basic;

public class IfElse {
	public static void main(String[] args) {
		// 발달단계에 따른 언령 구분
		// 0~6 : 유아기
		// 7~12 : 아동기
		// 13~15 : 사춘기
		// 16~24 : 청년기
		int age = -18;
		
		if(age < 0) {
			System.out.println("나이는 양수만 가능합니다.");
			return;
		}
		
		if((age >= 0) && (age <= 6)) 
			System.out.println("유아기입니다.");
		else if(age <= 12)
			System.out.println("아동기입니다");
		else if(age <= 15)
			System.out.println("사춘기입니다");
		else if(age <= 24)
			System.out.println("청년기입니다");
		else
			System.out.println("성인입니다.");
	}

}
