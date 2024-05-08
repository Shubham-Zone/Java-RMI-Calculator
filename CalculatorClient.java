import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.io.*;

public class CalculatorClient {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double a=5;
		double b=5;
		
				
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", 1099);
			Calculator cal = (Calculator)registry.lookup("CalculatorService");
			System.out.println("Sum of "+a+" and "+b+" is : "+cal.add(a, b));
			System.out.println("Sub of "+a+" and "+b+" is : "+cal.sub(a, b));
			System.out.println("Mul of "+a+" and "+b+" is : "+cal.mul(a, b));
			System.out.println("Div of "+a+" and "+b+" is : "+cal.div(a, b));
			
			
		}catch(Exception e) {
			
		}
		
	}

}
