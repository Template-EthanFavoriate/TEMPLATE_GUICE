package com.salesforce.kepler;
import com.google.inject.AbstractModule;
import com.salesforce.service.GeoService;
import com.salesforce.service.GeoServiceAlternative;
import com.salesforce.service.GeoServiceInterface;


public class PersonModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(PersonFactoryInterface.class).to(PersonFactory.class);
		bind(GeoServiceInterface.class).to(GeoServiceAlternative.class);
		//bind(GeoServiceInterface.class).toProvider(GeoService.class);
	}
}
