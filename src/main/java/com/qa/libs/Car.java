package com.qa.libs;

public class Car implements IStreering{

	private static String abcd = "Maruthi";
	public void turnHandle() {
		// TODO Auto-generated method stub
		System.out.println("I am in car "+ abcd +", I am turning the steering!!!!!");
		
	}
	
	public void parkCar() {
		System.out.println("I am parking,bye bye");
	}
	
	
	public Car getCar() {
		return this;
	}
	
	public IStreering getSteering() {
		/*MainSteering steering = new MainSteering();*/		
		return this;
	}
	
	public void printer() {
		System.out.println("My name is "+this.abcd);
	}
	
	public class MySteering implements IStreering{
		private String name = "BMW";
		
		public void print() {
			printer();
		}
		
		public void printYourSelf(String name) {
			this.name = name;
			System.out.println("My name is "+name);
		}
		
		public IStreering getSteering() {
			return this;
		}

		public void turnHandle() {
			// TODO Auto-generated method stub
			
		}
		
		public void driving()
		{
			System.out.println("i am driving");


	}
}
