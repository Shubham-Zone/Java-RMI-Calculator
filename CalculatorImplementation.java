import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImplementation extends UnicastRemoteObject implements Calculator {
	
	CalculatorImplementation() throws RemoteException{
		super();
	}
	
	public double add(double a, double b) throws RemoteException{
		return a+b;
	}
	
	public double sub(double a, double b) throws RemoteException{
		return a-b;
	}
	
	public double mul(double a, double b) throws RemoteException{
		return a*b;
	}
	
	public double div(double a, double b) throws RemoteException{
		if(b == 0) {
			System.out.println("Divide by zero error");
			return -1;
		}
		return a/b;
	}
	
	public static void main(String args[]) {}
	
}
