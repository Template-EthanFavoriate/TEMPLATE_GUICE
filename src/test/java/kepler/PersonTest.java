package kepler;

import org.junit.Test;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.salesforce.kepler.PersonFactoryInterface;
import com.salesforce.kepler.PersonInterface;
import com.salesforce.kepler.PersonModule;

public class PersonTest {		
	@Test
	public void test() {
		Injector inject= Guice.createInjector(new PersonModule());
		PersonFactoryInterface pf=inject.getInstance(PersonFactoryInterface.class);
		PersonInterface p=pf.create("Ethan");
		System.out.println(p.getLocationByName());
	}
}
