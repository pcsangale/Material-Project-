package Programs;

import org.hamcrest.core.IsInstanceOf;


public class ReturnTheMeasure {

	public String whatType(Object o1){
		
		if(o1 instanceof Centimeter)
		{
			return "Centimeter";
 		}
		
		return null;
	}
	
}
