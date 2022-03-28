package com.sujata.demo;

public class CarRentalStore {

	public static void main(String[] args) {
		Driver sonu=new Driver("Sonu");
		Driver monu=new Driver("Monu");
		
		Audi audi=new Audi("Red", "A8");
		BMW bmw=new BMW("Blue", "Q5");
		Toyota toyota=new Toyota("Golden", "Altis");
		Hyundai hyundai=new Hyundai("White", "i20");
		
		sonu.setCar(audi);
		sonu.drive();
		
		monu.setCar(bmw);
		monu.drive();

	}

}
