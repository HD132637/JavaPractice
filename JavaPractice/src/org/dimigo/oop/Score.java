package org.dimigo.oop;

import java.util.Scanner;

public class Score {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("국어 점수 입력 -> ");
		int score1 = scanner.nextInt();
		System.out.println("수학 점수 입력 -> ");
		int score2 = scanner.nextInt();
		System.out.println("영어 점수 입력 -> ");
		int score3 = scanner.nextInt();
		
		System.out.println("");
		System.out.println("<<점수 출력>>");
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append("국어 점수 : ").append(score1).append("\n")
			.append("수학 점수 : ").append(score2).append("\n").append("영어 점수 :")
			.append(score3).append("\n").append("총점 : ").append(score1+score2+score3)
			.append("\n").append("평균 : ").append((score1+score2+score3)/3));
		
		
	}

}
