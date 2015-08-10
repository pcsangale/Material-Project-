package Test;

import javax.swing.CellRendererPane;

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
	
	
	@Test
	public void TestAddResultAndReturnToCmObject(){
		Material m = new Material();
		Meter meter = new Meter(2);
		Centimeter cm= new Centimeter(100);
		Quantity cm2= new Centimeter(300);
		
		Assert.assertEquals(true ,m.addToMeasure(cm, meter) instanceof Centimeter);
	
	}
	
	@Test
	public void TestAddResultAndReturnToYardObject(){
		Material m = new Material();
		
		Quantity cm= new Centimeter(100);
		Quantity yard= new Yard(1);
		
		Assert.assertEquals(true ,m.addToMeasure(yard, cm) instanceof Yard);
	
	}
	
	@Test
	public void TestAddResultAndReturnToFeetObject(){
		Material m = new Material();
		
		Quantity cm= new Centimeter(100);
		Quantity feet= new Feet(1);
		
		Assert.assertEquals(true ,m.addToMeasure(feet, cm) instanceof Feet);
	
	}
	
	@Test
	public void TestAddResultFeetAndYardObject(){
		Material m = new Material();
		
		Quantity yard= new Yard(2);
		Quantity feet= new Feet(1);
		
		Assert.assertEquals(true ,m.addToMeasure(feet, yard) instanceof Feet);
	
	}
	
	

	@Test
	public void TestAddResultCmAndCmObject(){
		Material m = new Material();
		
		Quantity cm1= new Centimeter(200);
		Quantity cm2= new Centimeter(1);
		
		Assert.assertEquals(true ,m.addToMeasure(cm1, cm2) instanceof Centimeter);
	
	}
	
	@Test
	public void TestAddResultMeterToCmObject(){
		Material m = new Material();
		
		Quantity cm1= new Centimeter(2);
		Quantity meter= new Meter(1);
		
		Assert.assertEquals(true ,m.addToMeasure(meter, cm1) instanceof Meter);
	
	}
	
	

}


