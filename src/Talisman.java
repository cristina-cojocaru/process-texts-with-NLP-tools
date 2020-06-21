//Petite faute d'orthographe nous avons créé une classe "Talisman" 

//alors que le tagger s'écrit bien "Talismane"

import java.util.ArrayList;

public class Talisman implements Parse{

	
public String parse(String fileName) {
		
		String lignesParsees = "";
		
		//Lecture du fichier
		FichierR monFichier = new FichierR(fileName);
		
		//Récupération et découpage du fichier en lignes
		String texteIntegral = monFichier.integral();
		String[]lignes;
		lignes=texteIntegral.split("\n");
		
		//Parcours des lignes et séparation en colonnes à la tabulation
		String[]cols;
		for (int i=0; i<lignes.length; i++) {
			//lignes[i]=lignes[i].replaceFirst(regex, replacement);
			if (lignes[i].intern() != "") {
				cols=lignes[i].split("\t");
				
				//Liste des attribus nécesssaires 
				String mot = cols[1];
				String lemme = cols[2];
				String cat = cols[3];
				String mode = "";
				String temps = cols[15];
				String pers = "";
				String genre = "";
				String nombre = "";
				
				//Extraction du nombre, du genre et de la personne
				String infos = cols[5];
				String[] ngp = infos.split("\\|");
				for(int j=0;j<ngp.length;j++) {
					String[] ngpFinal = ngp[j].split("=");
					if (ngpFinal[0].intern()=="n") {
						nombre = ngpFinal[1];
					}
					else if (ngpFinal[0].intern()=="g") {
						genre = ngpFinal[1];
					}
					else if (ngpFinal[0].intern()=="p") {
						pers = ngpFinal[1];
					}
				}
				
				//Normalisation des catégories 
				switch(cat)
		        {
		            case "NC":
		            case "NPP": cat="Nom";
		            break;
		            
		            case "DET":
		            case "DETWH": cat="Det";
		            break;
		            
		            case "V":
		            case "VIMP":
		            case "VINF":
		            case "VPP":
		            case "VPR":
		            case "VS": cat="Vb";
		            break;
		            
		            case "CLO":
		            case "CLR":
		            case "CLS":
		            case "PRO":
		            case "PROWH":
		            case "PROREL": cat="Pron";
		            break;
		            
		            case "ADV":
		            case "ADVWH": cat="Adv";
		            break;
		            
		            case "P":
		            case "P+D":
		            case "P+PRO": cat="Prep";
		            break;
		            
		            default: cat="Autre";
		            break;
		        }
				
				//Normalisation des temps
				//seulement 4 temps, car les sorties analysées n'en présentaient pas plus
				switch(temps) {
				
					case "imparfait": temps="Imparfait";
					break;
					
					case "present": temps="Présent";
					break;
					
					case "passe": temps="Passé";
					break;
					
					case "futur": temps="Futur";
					break;
					
					default: temps="";
					break;					
				}
				
				//Normalisation des personnes
				switch(pers) {
				
					case "1": pers="Première";
					break;
					
					case "2": pers="Deuxième";
					break;
					
					case "3": pers="Troisième";
					break;
				
				}
				
				//Normalisation du nombre
				switch(nombre) {
					
					case "s": nombre="Singulier";
					break;
					
					case "p": nombre="Pluriel";
					break;
					
					default: nombre="Neutre";
					break;
					
				}
				
				//Normalisation du genre
				switch(genre) {
				
					case "f": genre="Féminin";
					break;
					
					case "m": genre="Masculin";
					break;
					
					default: genre="Neutre";
					break;
				
				}
				
				//Ajoute à "lignesParsees" le tagging normalisé de chaque ligne du fichier
				//mot, cat, lemme, mode, temps, pers, genre, nombre
				lignesParsees+=mot+";"+cat+";"+lemme+";"+mode+";"+temps+";"+pers+";"+genre+";"+nombre+"\n";
			}
		}
		
		return lignesParsees;
	}

}


