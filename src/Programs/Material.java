package Programs;

public class Material {

	public boolean measureEqual(Length obj1, Length obj2){
		double value1= obj1.ToLowerMeasure();
		double value2= obj2.ToLowerMeasure();
		
		 	
	return value1==value2;	
	}
	
	
	public Object toConertInto(Length obj1, Length obj2){
		
		return obj2.convert( obj1);
	}
	
	public Object toConertInto(Volume obj1, Volume obj2){
		System.out.println("Here");
		return obj2.convert( obj1);
	}
	
	public Object addToMeasure(Length obj1, Length obj2){
		
		return obj1.addition(obj2);
	}
	public Object addToMeasure(Volume obj1, Volume obj2){
		
		return obj1.addition(obj2);
	}
	
	public boolean measureEqual(TemperatureQuantity obj1, TemperatureQuantity obj2){
		double value1= obj1.ToLowerMeasure();
		double value2= obj2.ToLowerMeasure();
		
		 	
	return value1==value2;	
	}
	
}