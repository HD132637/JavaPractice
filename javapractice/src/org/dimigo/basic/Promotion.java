package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		
		int salary, people, store;
		long total;
		salary = 1700000;
		people = 3;
		store = 1500;
		total = (long)salary * (long)12 * (long)people * (long)store;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " + String.format("%,d", salary) + "원");
		System.out.println("점포 내 직원 수 : " + people + "명");
		System.out.println("점포 수 : " + String.format("%,d", store) + "개");
		System.out.println("연간 인건비 : " + String.format("%,d", total) + "원");
	}

}
