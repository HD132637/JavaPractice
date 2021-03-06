package org.dimigo.abstractclass;

public abstract class SmartPhone {
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

	public abstract void pay();
	
	public void useSpecicalFunction(){
		if(this instanceof iPhone){
			iPhone i = (iPhone) this;
			i.useAirDrop();
		}
		
		if(this instanceof Galaxy){
			Galaxy g = (Galaxy) this;
			g.useWirelessCharging();
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "모델명 : " + model +", 제조사 : " + company + ", 가격 : "+ price + "원";
	}

}
