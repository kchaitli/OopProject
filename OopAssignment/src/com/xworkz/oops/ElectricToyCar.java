package com.xworkz.oops;

public class ElectricToyCar {

	String brand;
	String color;
	String Model;
	String Mode;
	int price;
	int BatteryCapacity;
	int Speed;

	
	
	public void Steering() {
		System.out.println("helps to direct the car in desired direction i.e right or left"+" the speed is kept limited for child safety "+ Speed);
	}
	public void ModeOfOperation() {
		System.out.println("color of toy car is: "+color +" Model of operation is "+ Model);
		System.out.println("mode of operation of the toy is: "+Mode);
	}
	public void BatteryDisplay() {
		System.out.println("Digital display to indicate battery life: "+ BatteryCapacity);
	}
	public void FrontandReverse() {
		System.out.println("there is a button which can take the toy car back and forth");
	}
	public void EarlyEducation() {
		System.out.println("music system is provided to make the chlld learn while playing");
	}

}
