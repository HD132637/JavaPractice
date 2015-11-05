package org.dimigo.thread;

public class Runner2 implements Runnable{

	private String name;
	
	Runner2(){}
	
	Runner2(String name){
		this.name = name;
	}
	
	public void run(){
		System.out.println(name + " 출발");
		
		for(int i=0;i<10;i++){
			int y = 100 - 10*i;
			System.out.println(name + " " + y + " 미터");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(name + " 골인");
		
	}
}
