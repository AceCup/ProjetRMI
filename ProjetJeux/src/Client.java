import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
	public static void main(String[] args) {
		try {
			jeu_de_pendu_interf obj = (jeu_de_pendu_interf)Naming.lookup("rmi://localhost:8000/active");
			System.out.println(obj.commencer());
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}
}
