package com.qa.libs;

public class Person {
	
	public String daddy;
	protected String mummy;
	@SuppressWarnings("unused")
	private String wife;
	
	public void MakeAfriendstrip()
	{
		System.out.println("friendsTrip");
	}
	
	protected void MakeAfamilytrip()
	{
		System.out.println("FamilyTrip");
	}
	
	@SuppressWarnings("unused")
	private void MakeAwifetrip()
	{
		System.out.println("WifeTrip");
	}

	public String getWife() {
		return wife;
	}

	public void setWife(String wife) {
		this.wife = wife;
	}
	
	

}
