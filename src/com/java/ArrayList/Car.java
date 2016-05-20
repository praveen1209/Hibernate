package com.java.ArrayList;

public class Car {

	String carName;
	int modeYear;
	String color;
	static int speed;
	static int numberOfTyres=9;

	Car(){
		
		System.out.println("Hey You Created No Parameterized Constructor");
		
	}
	
	Car(String nameOfTheCar, int modelOfTheCar,int noOfTy){
		numberOfTyres=noOfTy;
		
		carName=nameOfTheCar;
		modeYear=modelOfTheCar;
	}
	
	Car(String color1, int yearmodel, String name,int speed1){
		
	carName=name;
	modeYear=yearmodel;
	color=color1;
	speed=speed1;
	
		
	}
	
	
	
	void gearR(){
		if (speed==60){
			System.out.println("Go Speed");
		}else{
			System.out.println("slow down ur speed");
		}
		System.out.println("Car Moving Reverse Direction");
		
	}
	
	 static void gearD()
	{
		if(speed<=80){
			System.out.println("slow down ur speed by 20");
		}else
			
		System.out.println("Car Moving in Forward Directiopn");
	}
	 void gearM(){
		 
		 
	 }
	 
	static void gearN(){
		 
	 }
	
	void gearS(){
		gearD();
		gearN();
		gearM();
		
		
	}
	
	
	public static void main(String[] args) {
		
	gearD();
		
		
		
		
	/*	
		Car rajuCar=new Car("Red", 2011, "Mustang", 180);
		Car	rajuCar2=new Car("BMW",2016,4);
		System.out.println(rajuCar2.numberOfTyres);
		Car	rajuCar3=new Car("BMW",2016,5);
		System.out.println(rajuCar3.numberOfTyres);
		Car	rajuCar4=new Car("BMW",2016,6);
		System.out.println(rajuCar4.numberOfTyres);
		
		*/
		
		
		
		
		
		
	/*	System.out.println(rajuCar.color);
		System.out.println(rajuCar.modeYear);

		System.out.println(rajuCar.carName);*/
/*		System.out.println("Raju Car Details");
		
		
	Car	rajuCar=new Car("BMW",2016);
	
	rajuCar=new Car("Red", 2011, "Mustang", 180);
	
	
	
	
	
	
	System.out.println(rajuCar.color);
	System.out.println(rajuCar.modeYear);

	System.out.println(rajuCar.carName);

	System.out.println();
	
	System.out.println("Pradeep Car Details:");
	Car	PradepCar=new Car("Benz",2014);*/
	
	
	//Car pravencar=new Car();
	
	
	
	/*System.out.println(PradepCar.color);
	System.out.println(PradepCar.modeYear);

	System.out.println(PradepCar.carName);
	*/
    
		
	}

}
