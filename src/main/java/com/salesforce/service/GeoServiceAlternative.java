package com.salesforce.service;

public class GeoServiceAlternative implements GeoServiceInterface{
	public boolean judge(String Name) {
		System.out.println("juding using alternative...");
		return Name.isEmpty()?false:true;
	}
}
