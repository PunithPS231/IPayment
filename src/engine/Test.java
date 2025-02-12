package engine;

import java.util.Scanner;
//Customer Utilization Logic
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the engine type:");
		//cng
		String type=sc.next();
		//type="electric"           "electric"
		Engine e=Car.getEngine(type); 
		//Engine e=new CNG();
//Car class -> factory class or helper class or utiltity class
	  
		
		if(e!=null) {
			e.start();
		}
	}
}
