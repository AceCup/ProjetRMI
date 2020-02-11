import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {
	public static void main(String[] args) {
		try {
			int port=8000;
			jeu_de_pendu_impl obj = new jeu_de_pendu_impl();
			LocateRegistry.createRegistry(port);
			Naming.rebind("rmi://localhost:8000/active",obj);
			System.out.println("Server is ready");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
