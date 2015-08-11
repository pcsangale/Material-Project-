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
	
		Length meter = new Meter(1);
		Length cm= new Centimeter(100);
		
		
		Assert.assertEquals(true,m.measureEqual(meter, cm));
		
	}
	
	@Test
	public void shouldReturnCm(){
		Material m= new Material();
	
		Length meter = new Meter(1);
		
		
		
		Assert.assertEquals(true ,m.toConertInto(meter,new Centimeter()) instanceof Centimeter);
		
	}
	
	@Test
	public void shouldReturnYard(){
		Material m= new Material();
	
		Length meter = new Meter(1);
		
		
		
		Assert.assertEquals(true ,m.toConertInto(meter,new Yard()) instanceof Yard);
	
		
		
			}
	
	
	@Test
	public void TestAddResultAndReturnToCmObject(){
		Material m = new Material();
		Meter meter = new Meter(2);
		Centimeter cm= new Centimeter(100);
		Length cm2= new Centimeter(300);
		
		Assert.assertEquals(true ,m.addToMeasure(cm, meter) instanceof Centimeter);
	
	}
	
	@Test
	public void TestAddResultAndReturnToYardObject(){
		Material m = new Material();
		
		Length cm= new Centimeter(100);
		Length yard= new Yard(1);
		
		Assert.assertEquals(true ,m.addToMeasure(yard, cm) instanceof Yard);
	
	}
	
	@Test
	public void TestAddResultAndReturnToFeetObject(){
		Material m = new Material();
		
		Length cm= new Centimeter(100);
		Length feet= new Feet(1);
		
		Assert.assertEquals(true ,m.addToMeasure(feet, cm) instanceof Feet);
	
	}
	
	@Test
	public void TestAddResultFeetAndYardObject(){
		Material m = new Material();
		
		Length yard= new Yard(2);
		Length feet= new Feet(1);
		
		Assert.assertEquals(true ,m.addToMeasure(feet, yard) instanceof Feet);
	
	}
	
	

	@Test
	public void TestAddResultCmAndCmObject(){
		Material m = new Material();
		
		Length cm1= new Centimeter(200);
		Length cm2= new Centimeter(1);
		
		Assert.assertEquals(true ,m.addToMeasure(cm1, cm2) instanceof Centimeter);
	
	}
	
	@Test
	public void TestAddResultMeterToCmObject(){
		Material m = new Material();
		
		Length cm1= new Centimeter(2);
		Length meter= new Meter(1);
		
		Assert.assertEquals(true ,m.addToMeasure(meter, cm1) instanceof Meter);
	
	}
	
	
	@Test
	public void shouldCheckEqualityOfVolume(){
		Material m= new Material();
	
		Length meter= new Meter(1);	
		Length	feet= new Feet(3);
		Assert.assertEquals(true,m.measureEqual(meter, meter));
		
	}
	
	@Test
	public void shouldReturnTsp(){
		Material m= new Material();
	
		Volume tbsp= new Tbsp(1);
		
		Assert.assertEquals(true ,m.toConertInto(tbsp,new Tsp()) instanceof Tsp);
		
	}
	
	
	@Test
	public void shouldReturnCup(){
		Material m= new Material();
	
		Volume tbsp= new Tbsp(1);
		
		Assert.assertEquals(true ,m.toConertInto(tbsp,new Cup()) instanceof Cup);
		
	}
	

}


