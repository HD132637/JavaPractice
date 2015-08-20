package org.dimigo.interitance;

public class Circle extends Figure{
	
	private int radius;
	
	
	Circle(int radius){
		super(0,0);
		this.radius = radius;
	}
	
	Circle(int centerX, int centerY, int radius){
		super(centerX, centerY);
		this.radius = radius;
	}
	
	protected double calcArea(){
		return (Math.PI * radius * radius);
	}
	
	protected void printCenter(){
		System.out.print("원 ");
		super.printCenter();
	}
}
