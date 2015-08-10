package Programs;

import org.hamcrest.core.IsInstanceOf;

import Test.*;
public class Material {

	public boolean measureEqual(Meter obj1 ,Centimeter obj2 ){
		//Checking is meter is equal to centimeter
	
		return(((Meter) obj1).getMeter()*new ConversionFactor().getMeterToCentemeter() == ((Centimeter)obj2).getCm());
	
	}
	
	public boolean measureEqual(Centimeter obj1 ,Meter obj2 ){
		
			return(((Meter) obj2).getMeter()*new ConversionFactor().getMeterToCentemeter() == ((Centimeter)obj1).getCm());


		}

}