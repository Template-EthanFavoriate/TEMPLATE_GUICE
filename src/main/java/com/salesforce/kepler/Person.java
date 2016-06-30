package com.salesforce.kepler;
import com.salesforce.service.GeoServiceInterface;

public class Person implements PersonInterface {
	private String Name;
	private GeoServiceInterface gs;
		
	public Person(String Name, GeoServiceInterface gs){
		this.Name=Name;
		this.gs=gs;
	}
	public boolean getLocationByName(){
		return gs.judge(Name);
	}
}
