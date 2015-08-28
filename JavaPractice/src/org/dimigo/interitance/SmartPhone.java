package org.dimigo.interitance;

public class SmartPhone {
	private String model;
	private String company;
	private int price;

	SmartPhone(){
		
	}
	
	SmartPhone(String model, String company, int price){
		this.model = model;
		this.company = company;
		this.price = price;
	}

	public void turnOn(){
		System.out.println(model + "의 전원을 켭니다");
	}

	public void turnOff(){
		System.out.println(model + "의 전원을 껍니다");
	}

	public void pay(){
		
	}
	
	public void useSpecicalFunction(SmartPhone phone){
		if(phone instanceof iPhone){
			iPhone i = (iPhone) phone;
			i.useAirDrop();
		}
		
		if(phone instanceof Galaxy){
			Galaxy g = (Galaxy) phone;
			g.useWirelessCharging();
		}
	}

	@Override
	public String toString() {
		return "모델명 : " + model +", 제조사 : " + company + ", 가격 : "+ price + "원";
	}

}
