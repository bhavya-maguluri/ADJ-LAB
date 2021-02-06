import java.rmi.*;
import java.rmi.server.*;


public class RMIserver extends UnicastRemoteObject implements interest{
	
	public RMIserver() throws RemoteException{
		super();
	}

	public double simple(double p,double t,double r) throws RemoteException{
		return (p*t*r)/100;
	}
	public double compound(double p,double t,double r,double n) throws RemoteException{
		return (p*(Math.pow(1 +(r/n),n*t)));
	}

	public static void main(String args[]) throws Exception{
		RMIserver server =new RMIserver();
		System.out.println("RMI Server is running");
		Naming.rebind("interestServer",server);
	}


}