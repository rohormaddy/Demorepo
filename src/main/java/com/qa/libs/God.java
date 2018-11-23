package com.qa.libs;

import com.qa.libs.Car.MySteering;

public class God {

	
	public static void main(String[] args) {
		Person madhan = new Person();
		madhan.daddy = "Murthy";
		madhan.mummy = "Martha";
		madhan.setWife("abc");
		/*String madhanswife = madhan.getWife();
		System.out.println("Madhan's father is "+madhan.daddy);
		System.out.println("Madhan's mother is "+madhan.mummy);
		System.out.println("Madhan's wife is "+madhanswife);
		//duplicate arik creation
		
		Person arik[] = new Person[10];
		
		for(int i = 0; i < 10; i ++) {
			arik[i] = new Person();
			arik[i].daddy = "Sunil"+i;
			arik[i].mummy = "priya"+i;
			arik[i].setWife("shanaya"+i);
			System.out.println("arik["+i+"] wife is "+arik[i].getWife());
			System.out.println("arik["+i+"] father is "+arik[i].daddy);
			System.out.println("arik["+i+"] mother is "+arik[i].mummy);
		}	
		*/
		
		Car car = new Car();
		
		Car testCar = car.getCar();
		testCar.turnHandle();
		testCar.parkCar();
		
		//////
		
		IStreering mySteering = testCar.getSteering();
		
		mySteering.turnHandle();

		
		MySteering steering = testCar.new MySteering();
		IStreering subSteering = steering.getSteering();
		
		subSteering.turnHandle();
		
		
		
	}
	

}
