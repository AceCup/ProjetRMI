import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class jeu_de_pendu_impl extends UnicastRemoteObject implements jeu_de_pendu_interf{
	public jeu_de_pendu_impl() throws RemoteException{
		
	}
	public String commencer() {
		return "tapez 555 pour commencer Henshin";
	}
}
