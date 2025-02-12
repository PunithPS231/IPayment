package engine;
//Object creational Logic
public class Car //factory class or helper class or utility class
{                                           //"electric"
	public static Engine getEngine(String engineType) {
		if(engineType.equalsIgnoreCase("Petrol"))	{
			return new Petrol();
		}
		else if(engineType.equalsIgnoreCase("Diesel")) {
			return new Diesel();
		}
		else if(engineType.equalsIgnoreCase("cng")) {
			return new CNG();
		}
		else {
			System.err.println("No such engines available");
			return null;
		}
	}
}
