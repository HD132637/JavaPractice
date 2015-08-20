package org.dimigo.interitance;

public class Rectangle extends Figure {
	
	private int width;
	private int height;
	
	Rectangle(int width, int height){
		super(0,0);
		this.width = width;
		this.height = height;
	}
	
	Rectangle(int centerX, int centerY, int width, int height){
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea(){
		return width * height;
	}

	protected void printCenter(){
		System.out.print("직사각형 ");
		super.printCenter();
	}
	
}
