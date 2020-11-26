package com.xworkz.oops;

public class ToyShop {
	
	public static void main(String[] args) {
	ElectricToyCar Toy1= new ElectricToyCar();
	Toy1.brand = "powerWheels";
	Toy1.Model= "scorpio";
	Toy1.color="white";
	Toy1.Mode="remote contol + manual mode";
	Toy1.Speed=3;
	Toy1.BatteryCapacity= 12;
	Toy1.price= 10000;
	
	Toy1.EarlyEducation();
	Toy1.BatteryDisplay();
	Toy1.FrontandReverse();
	Toy1.ModeOfOperation();
	Toy1.Steering();
	
	System.out.println("------toy2--------");
	
	ElectricToyCar Toy2= new ElectricToyCar();
	Toy2.brand = "funWheels";
	Toy2.Model= "JEEP";
	Toy2.color="Black";
	Toy2.Mode="remote contol + manual mode";
	Toy2.Speed=5;
	Toy2.BatteryCapacity= 16;
	Toy2.price= 15000;
	
	Toy2.EarlyEducation();
	Toy2.BatteryDisplay();
	Toy2.FrontandReverse();
	Toy2.ModeOfOperation();
	Toy2.Steering();
	
	System.out.println("-------toy3------");
	
	ElectricToyCar Toy3= new ElectricToyCar();
	Toy3.brand = "crazyToys";
	Toy3.Model= "BMW";
	Toy3.color="red";
	Toy3.Mode="remote contol + manual mode";
	Toy3.Speed=4;
	Toy3.BatteryCapacity= 16;
	Toy3.price= 13000;
	
	Toy3.EarlyEducation();
	Toy3.BatteryDisplay();
	Toy3.FrontandReverse();
	Toy3.ModeOfOperation();
	Toy3.Steering();
	
}
}