package org.dimigo.oop;

public class IdolGroup {
	public static void main(String[] args) {
		String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
		String[][] members = { {"GD", "태양", "승리", "대성", "TOP"}, 
				{"CL", "산다라박", "공민지", "박봄"}, {"유라", "민아", "소진", "혜리"}};
	
		
		for(int i=0; i<idolGroup.length; i++){
			System.out.println("<< " + idolGroup[i] + " >>");
			for(int j=0; j < members[i].length; j++){
				System.out.println(members[i][j]);
			}
		}
	}
}
