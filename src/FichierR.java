import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FichierR {
	public int nbLignes;
	public int nbCar;
	//on cree un tableau lignes
	public ArrayList<String> tabFic = new ArrayList<String>();
	public String ligne;
		//constructeur
	public FichierR (String nom) {
			BufferedReader dis;
			nbCar=0;
			
			try {
				//ouverture du fichier
				dis =new BufferedReader(
						new FileReader(
								new File(nom))
						);
				//lecture du fichier
				while((ligne=dis.readLine())!=null) {
					// ajout de la ligne dans le tableau
					tabFic.add(ligne);
					nbCar=nbCar+ligne.length();
				}
				// mise a jour de la propriete nbLignes
				nbLignes=tabFic.size();
				
			}
			catch (FileNotFoundException e){
				 //attrapper les erreur a l'aide d'un parametre
				e.printStackTrace();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
			public String ligne(int i) {
				if(i>=1&&i<=nbLignes) {
					return(tabFic.get(i-1));
				}
				else {
					return("ERREUR");
				}
				
				
		}
			public String integral() {
				String texte="";
				for(int i=0;i<nbLignes;i++) {
					texte=texte+tabFic.get(i)+"\n";
				}
				
				return(texte);
			
		}
				
	
}
