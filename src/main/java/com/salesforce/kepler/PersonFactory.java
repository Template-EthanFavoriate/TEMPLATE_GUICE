package com.salesforce.kepler;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.salesforce.service.GeoServiceInterface;

public class PersonFactory implements PersonFactoryInterface {
	private final GeoServiceInterface gs;
	
	@Inject
	public PersonFactory(GeoServiceInterface gs){
		this.gs=gs;
	}
	
	public PersonInterface create(String Name) {
		return new Person(Name,gs);
	}	
}

