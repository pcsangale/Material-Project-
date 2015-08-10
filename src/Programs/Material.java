package Programs;

import org.hamcrest.core.IsInstanceOf;

import Test.*;
public class Material {

	public boolean measureEqual(Quantity obj1, Quantity obj2){
		double value1= obj1.ToCentimeter();
		double value2= obj2.ToCentimeter();
		
		 	
	return value1==value2;	
	}
	
	
	public Object ToConertInto(Quantity obj1, Quantity obj2){
		
		return obj2.convert( obj1);
	}
	
	public Object addToMeasure(Quantity obj1, Quantity obj2){
		
		return obj1.addition(obj2);
	}
}