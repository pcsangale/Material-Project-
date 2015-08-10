package Test;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
import Programs.*;

public class EqualityTest {


	@Test
	public void shouldCheckEquality(){
		Material m= new Material();
	
		Quantity meter = new Meter(1);
		Quantity cm= new Centimeter(100);
		
		
		Assert.assertEquals(true,m.measureEqual(meter, cm));
		
	}
	

	@Test
	public void shouldReturnCm(){
		Material m= new Material();
	
		Quantity meter = new Meter(1);
		
		
		
		Assert.assertEquals(true ,m.ToConertInto(meter,new Centimeter()) instanceof Centimeter);
		
	}
	
	@Test
	public void shouldReturnYard(){
		Material m= new Material();
	
		Quantity meter = new Meter(1);
		
		
		
		Assert.assertEquals(true ,m.ToConertInto(meter,new Yard()) instanceof Yard);
	
		/* Yard yard=(Yard) m.ToConertInto(meter,new Yard());
		
		Assert.assertEquals(true, m.measureEqual(yard,meter));*/
	}
	

}


