import java.rmi.Remote;
import java.rmi.RemoteException;

public interface jeu_de_pendu_interf extends Remote{
	public String commencer() throws RemoteException;
}
