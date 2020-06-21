import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FichierW {
	//clase pour l'ecriture dans un fichier
	PrintWriter fw;
	public FichierW(String nom) {
		try {
			fw = new PrintWriter(new BufferedWriter(
					new FileWriter(nom)));
		}
		catch(IOException e){
			System.out.println("Ouverture du fichier impossible en ecriture");
		}
	}
	
	
	public boolean ecrire(String chaine) {
		try {
			fw.println(chaine);
			return(true);
		}catch(Exception e) {
			return(false);
		}
	}
	public void fermer() {
		fw.close();
	}
}

