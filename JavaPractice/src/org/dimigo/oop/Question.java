package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	static Scanner scanner = new Scanner(System.in);
	String answer = scanner.nextLine();
	
	
	
	public static void main(String[] args) {
		String answer1 = "장문광";
		String answer2 = "400점";
		String answer3 = "5월 22일";
		
		System.out.println("해킹방어과에서 가장 귀여운 학생은? ");
		String answer = scanner.nextLine();
		if (answer.equals(answer1)){
			System.out.println("장딥입니다!! ^^");
		}else{
			System.out.println("틀렸습니다!!");
		}
		
		System.out.println("체육대회에서 축구 우승시 받게 되는 점수는? ");
		answer = scanner.nextLine();
		if (answer.equals(answer2)){
			System.out.println("장딥입니다!! ^^");
		}else{
			System.out.println("틀렸습니다!!");
		}
		
		System.out.println("체육대회 날짜는?? ");
		answer = scanner.nextLine();
		if (answer.equals(answer3)){
			System.out.println("장딥입니다!! ^^");
		}else{
			System.out.println("틀렸습니다!!");
		}
		scanner.close();
	}


}
