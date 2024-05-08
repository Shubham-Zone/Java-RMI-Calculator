import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer  {
	
	public static void main(String args[]) {
		
		try {
			CalculatorImplementation cal = new CalculatorImplementation();
			
			// Create a registry for calculator method on server
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.bind("CalculatorService", cal);
			
			System.out.println("Calculator server is ready");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
