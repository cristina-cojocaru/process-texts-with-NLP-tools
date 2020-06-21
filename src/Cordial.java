
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
				retour+=tab[0]+";"+"Det"+";"+tab[1]+";"+";"+";"+"F�minin"+";Singulier\n";
			}	
			else if(tab[2].intern()=="DETIFS") {
				retour+=tab[0]+";"+"Det"+";"+tab[1]+";"+";"+";"+"F�minin"+";Singulier\n";
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
				retour+=tab[0]+";"+"Adj"+";"+tab[1]+";"+";"+";"+"F�minin"+";Pluriel\n";
			}
			else if(tab[2].intern()=="ADJFS") {
				retour+=tab[0]+";"+"Adj"+";"+tab[1]+";"+";"+";"+"F�minin"+";Singulier\n";
			}
			else if(tab[2].intern()=="ADJIN" || tab[2].intern()=="ADJINV" || tab[2].intern()=="ADJINT" || tab[2].intern()=="ADJMIN" || tab[2].intern()=="ADJNUM" || tab[2].intern()=="ADJPIG" || tab[2].intern()=="ADJSIG") {
				retour+=tab[0]+";"+"Adj"+";"+tab[1]+";"+";"+";"+";"+";\n";
			}
		
			//LES NOMS
			else if(tab[2].intern()=="NCFIN") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";F�minin"+";Neutre\n";
			}
			else if(tab[2].intern()=="NCFP") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";F�minin"+";Pluriel\n";
			}
			else if(tab[2].intern()=="NCFS") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";F�minin"+";Singulier\n";
			}
			else if(tab[2].intern()=="NCHFS") {
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";F�minin"+";Singulier\n";
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
				retour+=tab[0]+";"+"Nom"+";"+tab[1]+";"+";"+";"+";F�minin"+";Singulier\n";
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
			//Participe Pass�
			else if(tab[2].intern()=="VPARPFP") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Participe"+";Pass�"+";"+";F�minin"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VPARPFS") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Participe"+";Pass�"+";"+";F�minin"+";Singulier\n";
			}
			else if(tab[2].intern()=="VPARPMP") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Participe"+";Pass�"+";"+";Masculin"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VPARPMS") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Participe"+";Pass�"+";"+";Masculin"+";Singulier\n";
			}
			//Participe Pr�sent
			else if(tab[2].intern()=="VPARPRES") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Participe"+";Pr�sent"+";"+";"+";\n";
			}
			else if(tab[2].intern()=="VSUBP2S") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Subjonctif"+";Pr�sent"+";Deuxi�me"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VSUBP3S") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Subjonctif"+";Pr�sent"+";Troisi�me"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VSUBP1S") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Subjonctif"+";Pr�sent"+";Premi�re"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VSUBP1P") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Subjonctif"+";Pr�sent"+";Premi�re"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VSUBP2P") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Subjonctif"+";Pr�sent"+";Deuxi�me"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VSUBP3P") {
				retour+=tab[0]+";"+"Verbe"+";"+tab[1]+";Subjonctif"+";Pr�sent"+";Troisi�me"+";"+";Pluriel\n";
			}
			
			
			
			
			
			//Verbes au conditionnel pr�sent
			else if(tab[2].intern()=="VCONP1S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Conditionnel"+";Pr�sent"+";Premi�re"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VCONP2S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Conditionnel"+";Pr�sent"+";Deuxi�me"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VCONP3S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Conditionnel"+";Pr�sent"+";Troisi�me"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VCONP1P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Conditionnel"+";Pr�sent"+";Premi�re"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VCONP2P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Conditionnel"+";Pr�sent"+";Deuxi�me"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VCONP3P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Conditionnel"+";Pr�sent"+";Troisi�me"+";"+";Pluriel\n";
			}
			//Verbes � l'imp�ratif pr�sent
			else if(tab[2].intern()=="VIMPP2S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Imp�ratif"+";Pr�sent"+";Deuxi�me"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VIMPP2P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Imp�ratif"+";Pr�sent"+";Deuxi�me"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VIMPP1P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Imp�ratif"+";Pr�sent"+";Premi�re"+";"+";Pluriel\n";
			}
			//Verbes � l'infinitelse if
			else if(tab[2].intern()=="VINDF1S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Futur"+";Premi�re"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDF2S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Futur"+";Deuxi�me"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDF3S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Futur"+";Troisi�me"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDF1P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Futur"+";Premi�re"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VINDF2P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Futur"+";Deuxi�me"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VINDF3P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Futur"+";Troisi�me"+";"+";Pluriel\n";
			}
			//Verbes � l'Indicatif Imparfait
			else if(tab[2].intern()=="VINDI1S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Imparfait"+";Premi�re"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDI2S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Imparfait"+";Deuxi�me"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDI3S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Imparfait"+";Troisi�me"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDI1P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Imparfait"+";Premi�re"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VINDI2P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Imparfait"+";Deuxi�me"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VINDI3P") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Imparfait"+";Troisi�me"+";"+";Pluriel\n";
			}
			//Verbes � l'Indicatif Pr�sent
			else if(tab[2].intern()=="VINDP1S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Pr�sent"+";Premi�re"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDP2S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Pr�sent"+";Deuxi�me"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDP3S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Pr�sent"+";Troisi�me"+";"+";Singulier\n";
			}
			else if(tab[2].intern()=="VINDP1S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Pr�sent"+";Premi�re"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VINDP2S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Pr�sent"+";Deuxi�me"+";"+";Pluriel\n";
			}
			else if(tab[2].intern()=="VINDP3S") {
				retour+=tab[0]+";"+"Vb"+";"+tab[1]+";Indicatif"+";Pr�sent"+";Troisi�me"+";"+";Pluriel\n";
			}
			else{
				retour+=tab[0]+";"+"Autre"+";"+tab[1]+";"+";"+";"+";"+";\n";
			}
		}else {
			retour+="Oups... Le fichier semble �tre incompatible ou mal format�. V�rifiez s'il s'agit bien d'un fichier de sortie Cordial.";
		}
		i++;
	}
		return retour;
}



}
