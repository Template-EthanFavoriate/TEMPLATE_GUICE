package com.salesforce.service;

public class GeoService implements GeoServiceInterface{
	public boolean judge(String Name){
		System.out.println("juding...");
		return Name.isEmpty()?false:true;
	}
}
