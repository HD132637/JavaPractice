package org.dimigo.basic;

public class Switch {
	public static void main(String[] args) {
		// 주사위 번호 뽑기 (1~6)
//		double d = Math.random();
//		System.out.println(d);
//		int random = (int) (d*6)+1 ; // 0~5 -> 1~6
//		System.out.println(random);

	int num = (int) (Math.random() * 6 ) + 1;
	switch(num % 2)
	{
	case 0:
		System.out.println("짝수입니다.");
		break;
	case 1:
		System.out.println("홀수입니다.");
		break;
	default:
		System.out.println("넌 누구니!!");
	}
	
	String season = "봄";
	switch(season) {
	case "봄":
		System.out.println("따뜻하네요..");
	case "여름":
		System.out.println("덥네요..");
	case "가을":
		System.out.println("선선하네요..");
	case "겨울":
		System.out.println("추워요..");
	}
	}
}
