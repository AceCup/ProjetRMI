import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class jeu_de_pendu_impl extends UnicastRemoteObject implements jeu_de_pendu_interf{	
	public jeu_de_pendu_impl() throws RemoteException{
		
	}
	public String commencer() {
		ArrayList<String> ListeMots = new ArrayList<String>(); 
		ListeMots.add("rouge");
		ListeMots.add("jaune");
		ListeMots.add("bleu");
		ListeMots.add("violet");
		ListeMots.add("noir");
		int rand = (int)(Math.random() * ListeMots.size());
		String Mot = ListeMots.get(rand);
		char[] montablo = new char[Mot.length()];
		for(int i = 0 ; i < Mot.length(); i++) {
			montablo[i] = '_';
			System.out.println(montablo[i]);
		}
		return "tapez 555 pour commencer Henshin";
	}
}
