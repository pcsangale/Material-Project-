package Programs;

import org.hamcrest.core.IsInstanceOf;


public interface Quantity {

	public double ToCentimeter();
	
	public Object convert(Quantity obj1);
}