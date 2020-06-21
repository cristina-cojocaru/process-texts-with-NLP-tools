import java.util.ArrayList;

public class Spacy implements Parse {
	 public String  parse(String filename){
		String  resultat=new String();
		System.out.println(filename);
		FichierR fic=new FichierR(filename);
		
		for (String e:fic.tabFic) {
			String [] f=e.split("\t");

			if (f[0]!=""&&f[0]!="SPACE") {
				String cat="";
				String genre="";
				String nombre="";
				if (f[1]!=null) {
					switch(f[1]) {
					case "ADJ": cat="Adj";
					break;
					case "ADV": cat="Adv";
					break;
					case "AUX": cat="Vb";
					break;
					case "DET": cat="Det";
					break;
					case "NOUN": cat="Nom";
					break;
					case "PRON": cat="Pron";
					break;
					case "VERB": cat="Vb";
					break;
					case "PROPN": cat="Nom";
					break;
					default:
						cat="Autre";
					}
				
				
				}
				if (f.length>3) {
					if (f[3].intern()=="i") {
						
						genre="Neutre";
					}else if (f[3].intern()=="f") {
						genre="Féminin";
						}
					else if (f[3].intern()=="m") {
						genre="Masculin";
					}
						
					}
				if (f.length>4) {
					if (f[4].intern()=="i") {
						nombre="Neutre";
					}
					else if (f[4].intern()=="s") {
						nombre="Singulier";
					}
					else if (f[4].intern()=="p") {
					nombre="Pluriel";
				}
				}
				
				String ligne=new String(f[0]+";"+cat+";"+f[2]+";"+""+";"+""+";"+""+";"+genre+";"+nombre);
				resultat+="\n"+ligne;
			}
		}
		return resultat;
	 }
}
