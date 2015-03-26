package org.dimigo.basic;

public class Condition {
	public static void main(String[] args) {
		System.out.println("<< 고속도로 통행료 계산>>");
		int distance = 25;
		String vehi = "그 외";
		int price;
		switch(vehi)
		{
		case "경차":
			if(distance > 10)
			{
				if(distance > 20)
				{
					price = 700;
				}
				else
					price = 500;
			}
			else price = 300;
			break;
		case "고속버스":
			if(distance > 10)
			{
				if(distance > 20)
				{
					price = 1450;
				}
				else
					price = 1150;
			}
			else price = 850;
			break;
		default:
			if(distance > 10)
			{
				if(distance > 20)
				{
					price = 1000;
				}
				else
					price = 800;
			}
			else price = 600;
			break;
		}
		System.out.println("거리 : " + distance);
		System.out.println("운송수단 : " + vehi);
		System.out.println("요금 : " + price);
	}

}
