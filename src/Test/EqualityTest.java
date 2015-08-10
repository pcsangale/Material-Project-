package Test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
import Programs.*;

public class EqualityTest {

	
	@Test
	
	public void TestIsEqualMeasure(){
		
		Material m= new Material();
		Centimeter cm= new Centimeter(100);
		Meter meter = new Meter(1);
		
		
		Assert.assertEquals(true,m.measureEqual(cm,meter));
	}
	
	@Test
	public void TestIsNotEqual(){
		Material m= new Material();
		Centimeter cm= new Centimeter(1200);
		Meter meter = new Meter(1);
			}
}
