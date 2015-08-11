package Programs;

import javax.xml.transform.Templates;

import org.hamcrest.core.IsInstanceOf;

import Test.*;
public class Material {

	public boolean measureEqual(Length obj1, Length obj2){
		double value1= obj1.ToLowerMeasure();
		double value2= obj2.ToLowerMeasure();
		
		 	
	return value1==value2;	
	}
	
	
	public Object toConertInto(Length obj1, Length obj2){
		
		return obj2.convert( obj1);
	}
	
	/*public Object addToMeasure(Quantity obj1, Quantity obj2){
		
		return obj1.addition(obj2);
	}*/
}