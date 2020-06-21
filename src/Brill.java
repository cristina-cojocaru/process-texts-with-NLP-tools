import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Brill implements Parse{
	public String parse (String filename) {
	String retour=" ";
	
	
		BufferedReader dis;
		String ligne;
		

		try {
			// ouverture du fichier
			dis = new BufferedReader(
					new FileReader(
							new File (filename)
							)
					);
			// boucle de lecture du fichier
						while ((ligne=dis.readLine())!=null) {
							
							//on nettoie le fichier de base en enlevant les espaces superflus
							Pattern p = Pattern.compile("   ");
							Matcher m = p.matcher(ligne);
							String ligneProprette = m.replaceAll("");

							//on coupe à l'espace
							String [] tab=ligneProprette.split(" ");

							//boucle pour calculer la longueur du fichier
							for (int j=0 ; j<tab.length ; j++) {
								
								//on coupe le mot de son étiquette au /
								String [] motCat=tab[j].split("/");
								if (motCat.length>1) {

									//condition pour la normalisation en fonction de la catégorie
									if (motCat[1].intern()=="ACJsg") {
										retour+=motCat[0]+";"+"Vb"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"singulier"+"\n";
										
									}
									else if (motCat[1].intern()=="ACJpl") {
										retour+=motCat[0]+";"+"Vb"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"pluriel"+"\n";
									}
									else if (motCat[1].intern()=="ADJsg") {
										retour+=motCat[0]+";"+"Adj"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"singulier"+"\n";
									}
									else if (motCat[1].intern()=="ADJpl") {
										retour+=motCat[0]+";"+"Adj"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"pluriel"+"\n";
									}
									else if (motCat[1].intern()=="ADJ2PARsg") {
										retour+=motCat[0]+";"+"Vb"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"singulier"+"\n";
									}
									else if (motCat[1].intern()=="ADJ2PARpl") {
										retour+=motCat[0]+";"+"Vb"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"pluriel"+"\n";
									}
									else if (motCat[1].intern()=="ADV") {
										retour+=motCat[0]+";"+"Adv"+";"+""+";"+""+";"+""+";"+""+";"+"neutre"+";"+"neutre"+"\n";
									}
									else if (motCat[1].intern()=="ANCFF") {
										retour+=motCat[0]+";"+"Vb"+";"+""+";"+""+";"+""+";"+""+";"+"neutre"+";"+"neutre"+"\n";
									}
									else if (motCat[1].intern()=="CAR") {
										retour+=motCat[0]+";"+"Autre"+";"+""+";"+""+";"+""+";"+""+";"+"neutre"+";"+"neutre"+"\n";
									}
									else if (motCat[1].intern()=="COO") {
										retour+=motCat[0]+";"+"Autre"+";"+""+";"+""+";"+""+";"+""+";"+"neutre"+";"+"neutre"+"\n";
									}
									else if (motCat[1].intern()=="DTCsg") {
										retour+=motCat[0]+";"+"Det"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"singulier"+"\n";
									}
									else if (motCat[1].intern()=="DTCpl") {
										retour+=motCat[0]+";"+"Det"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"pluriel"+"\n";
									}
									else if (motCat[1].intern()=="DTNsg") {
										retour+=motCat[0]+";"+"Det"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"singulier"+"\n";
									}
									else if (motCat[1].intern()=="DTNpl") {
										retour+=motCat[0]+";"+"Det"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"pluriel"+"\n";
									}
									else if (motCat[1].intern()=="DTCsg") {
										retour+=motCat[0]+";"+"Det"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"singulier"+"\n";
									}
									else if (motCat[1].intern()=="ECJsg") {
										retour+=motCat[0]+";"+"Vb"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"singulier"+"\n";
									}
									else if (motCat[1].intern()=="ECJpl") {
										retour+=motCat[0]+";"+"Vb"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"pluriel"+"\n";
									}
									else if (motCat[1].intern()=="ENCFF") {
										retour+=motCat[0]+";"+"Vb"+";"+""+";"+""+";"+""+";"+""+";"+"neutre"+";"+"neutre"+"\n";
									}
									else if (motCat[1].intern()=="EPARsg") {
										retour+=motCat[0]+";"+"Vb"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"singulier"+"\n";
									}
									else if (motCat[1].intern()=="EPARpl") {
										retour+=motCat[0]+";"+"Vb"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"pluriel"+"\n";
									}
									else if (motCat[1].intern()=="INJ") {
										retour+=motCat[0]+";"+"Autre"+";"+""+";"+""+";"+""+";"+""+";"+"neutre"+";"+"neutre"+"\n";
									}
									else if (motCat[1].intern()=="NN") {
										retour+=motCat[0]+";"+"Autre"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+"\n";
									}
									else if (motCat[1].intern()=="PREP") {
										retour+=motCat[0]+";"+"Prep"+";"+""+";"+""+";"+""+";"+""+";"+"neutre"+";"+"neutre"+"\n";
									}
									else if (motCat[1].intern()=="PROsg") {
										retour+=motCat[0]+";"+"Pron"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"singulier"+"\n";
									}
									else if (motCat[1].intern()=="PROpl") {
										retour+=motCat[0]+";"+"Pron"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"pluriel"+"\n";
									}
									else if (motCat[1].intern()=="PRV:++") {
										retour+=motCat[0]+";"+"Pron"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+"\n";
									}
									else if (motCat[1].intern()=="PRVsg") {
										retour+=motCat[0]+";"+"Pron"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"singulier"+"\n";
									}
									else if (motCat[1].intern()=="PRVpl") {
										retour+=motCat[0]+";"+"Pron"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"pluriel"+"\n";
									}
									else if (motCat[1].intern()=="REL") {
										retour+=motCat[0]+";"+"Pron"+";"+""+";"+""+";"+""+";"+""+";"+"neutre"+";"+"neutre"+"\n";
									}
									else if (motCat[1].intern()=="SBPsg") {
										retour+=motCat[0]+";"+"Nom"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"singulier"+"\n";
									}
									else if (motCat[1].intern()=="SBPpl") {
										retour+=motCat[0]+";"+"Nom"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"pluriel"+"\n";
									}
									else if (motCat[1].intern()=="SBCsg") {
										retour+=motCat[0]+";"+"Nom"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"singulier"+"\n";
									}
									else if (motCat[1].intern()=="SBCpl") {
										retour+=motCat[0]+";"+"Nom"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"pluriel"+"\n";
									}
									else if (motCat[1].intern()=="SUB$") {
										retour+=motCat[0]+";"+"Autre"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+"\n";
									}
									else if (motCat[1].intern()=="VPARsg") {
										retour+=motCat[0]+";"+"Vb"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"singulier"+"\n";
									}
									else if (motCat[1].intern()=="VPARpl") {
										retour+=motCat[0]+";"+"Vb"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"pluriel"+"\n";
									}
									else if (motCat[1].intern()=="VCJsg") {
										retour+=motCat[0]+";"+"Vb"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"singulier"+"\n";
									}
									else if (motCat[1].intern()=="VCJpl") {
										retour+=motCat[0]+";"+"Vb"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"singulier"+"\n";
									}
									else if (motCat[1].intern()=="VNCFF") {
										retour+=motCat[0]+";"+"Vb"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+"\n";
									}
									else if (motCat[1].intern()=="VNCNT") {
										retour+=motCat[0]+";"+"Vb"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+"\n";
									}
									else if (motCat[1].intern()==".") {
										retour+=motCat[0]+";"+"Autre"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+"\n";
									}
									else if (motCat[1].intern()==",") {
										retour+=motCat[0]+";"+"Autre"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+"\n";
									}
									else if (motCat[1].intern()==":") {
										retour+=motCat[0]+";"+"Autre"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+"\n";
									}
									else if (motCat[1].intern()==";") {
										retour+=motCat[0]+";"+"Autre"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+"\n";
									}
									else if (motCat[1].intern()=="...") {
										retour+=motCat[0]+";"+"Autre"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+"\n";
									}
									else if (motCat[1].intern()=="(") {
										retour+=motCat[0]+";"+"Autre"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+"\n";
									}
									else if (motCat[1].intern()==")") {
										retour+=motCat[0]+";"+"Autre"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+"\n";
									}
									else if (motCat[1].intern()=="?") {
										retour+=motCat[0]+";"+"Autre"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+"\n";
									}
									else if (motCat[1].intern()=="!") {
										retour+=motCat[0]+";"+"Autre"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+"\n";
									}
									else if (motCat[1].intern()=="«") {
										retour+=motCat[0]+";"+"Autre"+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+"\n";
									}
									//si l'étiquette ne correspond à aucune condition ci-dessus
									else {
										retour+=motCat[0]+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+";"+""+";"+"\n";
									}
								}
							}
							
						}
					}
					//si on ne trouve pas le fichier message d'erreur
					catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					//si interrruption ou echec d'execution
					catch (IOException e) {
						e.printStackTrace();
					}
		System.out.println(retour);
		return retour;
				}
			}

