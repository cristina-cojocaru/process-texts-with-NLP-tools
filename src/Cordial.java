
public class Cordial implements Parse {
	public String  parse (String filename){
		FichierR fic=new FichierR(filename);
		String retour="";
		int i=1;
		while (i<=fic.nbLignes) {
			String[] tab = fic.ligne(i).split("\t");
			if (tab.length>1){
			
			// LES DETERMINANTS
			if(tab[2].intern()=="DETDMS") {
				retour+=tab[0]+";"+"Det"+";"+tab[1]+";"+";"+";"+"Masculin"+";Singulier\n";
			}
			else if(tab[2].intern()=="DETIMS") {
				retour+=tab[0]+";"+"Det"+";"+tab[1]+";"+";"+";"+"Masculin"+";Singulier\n";
			}
			else if(tab[2].intern()=="DETDFS") {
				retour+=tab[0]+";"+"Det"+";"+tab[1]+";"+";"+";"+"Féminin"+";Singulier\n";
			}	
			else if(tab[2].intern()=="DETIFS") {
				retour+=tab[0]+";"+"Det"+";"+tab[1]+";"+";"+";"+"Féminin"+";Singulier\n";
			}
			else if(tab[2].intern()=="DETDPIG") {
				retour+=tab[0]+";"+"Det"+";"+tab[1]+";"+";"+";"+"Neutre"+";Pluriel\n";
			}
			
			//LES ADJECTelse ifS
			else if(tab[2].intern()=="ADJMP") {
				retour+=tab[0]+";"+"Adj"+";"+tab[1]+";"+";"+";"+"Masculin"+";Pluriel\n";
			}
			else if(tab[2].intern()=="ADJMS") {
				retour+=tab[0]+";"+"Adj"+";"+tab[1]+";"+";"+";"+"Masculin"+";Singulier\n";
			}
			else if(tab[2].intern()=="ADJFP") {
				retour+=tab[0]+";"+"Adj"+";"+tab[1]+";"+";"+";"+"Féminin"+";Pluriel\n";
			}
			else if(tab[2].intern()=="ADJFS") {
				retour+=tab[0]+";"+"Adj"+";"+tab[1]+";"+";"+";"+"Féminin"+";Singulier\n";
			}
			else if(tab[2].intern()=="ADJIN" || tab[2].intern()=="ADJINV" || tab[2].intern()=="ADJINT" || tab[2].intern()=="ADJMIN" || tab[2].intern()=="ADJNUM" || tab[2].intern()=="ADJPIG" || tab[2].intern()=="ADJSIG") {
				retour+=tab[0]+";"+"Adj"+";"+tab[1]+";"+";"+";"+";"+";\n";
			}
		
			//LES NOMS
			else if(tab[2].intern()=="NCFIN") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";Féminin"+";Neutre\n";
			}
			else if(tab[2].intern()=="NCFP") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";Féminin"+";Pluriel\n";
			}
			else if(tab[2].intern()=="NCFS") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";Féminin"+";Singulier\n";
			}
			else if(tab[2].intern()=="NCHFS") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";Féminin"+";Singulier\n";
			}
			else if(tab[2].intern()=="NCHMS") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";Masculin"+";Singulier\n";
			}
			else if(tab[2].intern()=="NCI") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";"+";\n";
			}
			else if(tab[2].intern()=="NCMIN") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";Masculin"+";Neutre\n";
			}
			else if(tab[2].intern()=="NCMP") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";Masculin"+";Pluriel\n";
			}
			else if(tab[2].intern()=="NCMS") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";Masculin"+";Singulier\n";
			}
			else if(tab[2].intern()=="NCPIG") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";Neutre"+";Pluriel\n";
			}
			else if(tab[2].intern()=="NCSIG") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";Neutre"+";Singulier\n";
			}
			else if(tab[2].intern()=="NPFS") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";Féminin"+";Singulier\n";
			}
			else if(tab[2].intern()=="NPI") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";"+";\n";
			}
			else if(tab[2].intern()=="NPMIN") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";Masculin"+";Neutre\n";
			}
			else if(tab[2].intern()=="NPMS") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";Masculin"+";Singulier\n";
			}
			else if(tab[2].intern()=="NPSIG") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";Neutre"+";Singulier\n";
			}
			
			//PRONOMS
			
			else if(tab[2].intern()=="PDS") {
				retour+=tab[0]+";"+"Pron"+";"+tab[1]+";"+";"+";"+";"+";\n";
			}
			else if(tab[2].intern()=="PII") {
				retour+=tab[0]+";"+"Pron"+";"+tab[1]+";"+";"+";"+";"+";\n";
			}
			else if(tab[2].intern()=="PPER1S") {
				retour+=tab[0]+";"+"Pron"+";"+tab[1]+";"+";"+";"+";"+";\n";
			}
			else if(tab[2].intern()=="PPER3P") {
				retour+=tab[0]+";"+"Pron"+";"+tab[1]+";"+";"+";"+";"+";\n";
			}
			else if(tab[2].intern()=="PPER3S") {
				retour+=tab[0]+";"+"Pron"+";"+tab[1]+";"+";"+";"+";"+";\n";
			}
			else if(tab[2].intern()=="PREP") {
				retour+=tab[0]+";"+"Prep"+";"+tab[1]+";"+";"+";"+";"+";\n";
			}
			else if(tab[2].intern()=="PRI") {
				retour+=tab[0]+";"+"Pron"+";"+tab[1]+";"+";"+";"+";"+";\n";
			}
			
			//Verbes
			//Infinitif
			
			else if(tab[2].intern()=="VINF") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Infinitif"+";"+";"+";"+";\n";
			}
			//Participe Passé
			else if(tab[2].intern()=="VPARPFP") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Participe"+";Passé"+";"+";Féminin"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VPARPFS") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Participe"+";Passé"+";"+";Féminin"+";Singulier\n";
			}
			else if(tab[2].intern()=="VPARPMP") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Participe"+";Passé"+";"+";Masculin"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VPARPMS") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Participe"+";Passé"+";"+";Masculin"+";Singulier\n";
			}
			//Participe Présent
			else if(tab[2].intern()=="VPARPRES") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Participe"+";Présent"+";"+";"+";\n";
			}
			else if(tab[2].intern()=="VSUBP2S") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Subjonctif"+";Présent"+";Deuxième"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VSUBP3S") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Subjonctif"+";Présent"+";Troisième"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VSUBP1S") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Subjonctif"+";Présent"+";Première"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VSUBP1P") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Subjonctif"+";Présent"+";Première"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VSUBP2P") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Subjonctif"+";Présent"+";Deuxième"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VSUBP3P") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Subjonctif"+";Présent"+";Troisième"+";"+";Pluriel\n";
			}
			
			
			
			
			
			//Verbes au conditionnel présent
			else if(tab[2].intern()=="VCONP1S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Conditionnel"+";Présent"+";Première"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VCONP2S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Conditionnel"+";Présent"+";Deuxième"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VCONP3S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Conditionnel"+";Présent"+";Troisième"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VCONP1P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Conditionnel"+";Présent"+";Première"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VCONP2P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Conditionnel"+";Présent"+";Deuxième"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VCONP3P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Conditionnel"+";Présent"+";Troisième"+";"+";Pluriel\n";
			}
			//Verbes à l'impératif présent
			else if(tab[2].intern()=="VIMPP2S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Impératif"+";Présent"+";Deuxième"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VIMPP2P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Impératif"+";Présent"+";Deuxième"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VIMPP1P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Impératif"+";Présent"+";Première"+";"+";Pluriel\n";
			}
			//Verbes à l'infinitelse if
			else if(tab[2].intern()=="VINDF1S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Futur"+";Première"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDF2S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Futur"+";Deuxième"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDF3S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Futur"+";Troisième"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDF1P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Futur"+";Première"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VINDF2P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Futur"+";Deuxième"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VINDF3P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Futur"+";Troisième"+";"+";Pluriel\n";
			}
			//Verbes à l'Indicatif Imparfait
			else if(tab[2].intern()=="VINDI1S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Imparfait"+";Première"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDI2S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Imparfait"+";Deuxième"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDI3S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Imparfait"+";Troisième"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDI1P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Imparfait"+";Première"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VINDI2P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Imparfait"+";Deuxième"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VINDI3P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Imparfait"+";Troisième"+";"+";Pluriel\n";
			}
			//Verbes à l'Indicatif Présent
			else if(tab[2].intern()=="VINDP1S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Présent"+";Première"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDP2S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Présent"+";Deuxième"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDP3S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Présent"+";Troisième"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDP1S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Présent"+";Première"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VINDP2S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Présent"+";Deuxième"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VINDP3S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Présent"+";Troisième"+";"+";Pluriel\n";
			}
			else{
				retour+=tab[0]+";"+"Autre"+";"+tab[1]+";"+";"+";"+";"+";\n";
			}
		}else {
			retour+="Oups... Le fichier semble être incompatible ou mal formaté. Vérifiez s'il s'agit bien d'un fichier de sortie Cordial.";
		}
		i++;
	}
		return retour;
}



}
