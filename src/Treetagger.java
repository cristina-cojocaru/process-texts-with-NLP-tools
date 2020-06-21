
public class Treetagger implements Parse {

	//String fic;
	//FichierR monFichier;
	// Constructeur
	//public Treetagger() {
		//monFichier=new FichierR("corpus.ttg");
	//}
	
	// Méthode parse
	public String parse(String fileName) {

		String Output="";
		FichierR monFichier=new FichierR(fileName);
					
		for (int i=1; i<=monFichier.nbLignes;i++) {
			
			// Découpage des colonnes
		    String[] col = monFichier.ligne(i).split("\t");
		    String[] result = new String[5];
		    result[0]=col[0]; // forme
		    String[] categ= col[1].split(":");
	        result[2] = col[2]; //lemme
		            
	       //normalisation des CAT
	        switch(categ[0]) {
		       case "DET" : result[1]="Det" ; break;
		       case "NOM" : result[1]="Nom" ; break;
		       case "ADJ" : result[1]="Adj" ; break;
		       case "PRO" : result[1]="Pron" ; break;
		       case "ADV" : result[1]="Adv" ; break;
		       case "PRP" : result[1]="Prep" ; break;
		       
		       	default: result[1]= "Autre" ; break;
	       	     		
	        }
	       
	    // Découpage de la colonne categ
	        if (categ[0].intern()=="VER") {
	        	
	    	  result[1] = "Vb"; // il porte le nom Vb
		       
		     //normalisation des MOD
	    	  switch(categ[1]) {
	       		case "cond" : result[3]="Conditionnel" ; break;
		       	case "impe" : result[3]="Impératif" ; break;
		       	case "infi" : result[3]="Infinitif" ; break;
		       	case "subi" : result[3]="Subjonctif" ; 
		       	case "subp" : result[3]="Subjonctif" ; break;
		       	case "futu" : result[3]="Indicatif" ; 
		       	case "impf" : result[3]="Indicatif" ; 
		       	case "pres" : result[3]="Indicatif" ;
		       	case "simp" : result[3]="Indicatif" ; break;
		       	
		       	default: result[3]= "" ; break;  		
		       }
		     //normalisation des temps
		       switch(categ[1]) {
		       	case "impe" : result[4]="Présent" ;
		       	case "cond" : result[4]="Présent" ;
		       	case "pres" : result[4]="Présent" ; 
		       	case "subp" : result[4]="Présent" ; break;
		       	case "futu" : result[4]="Futur" ; break;
		       	case "simp" : result[4]="Passé simple" ; break;
		       	case "subi" : result[4]="Imparfait" ; 
		       	case "impf" : result[4]="Imparfait" ; break;
		       	
		       	default: result[4]= "" ; break;  		
		       }
	       } else {
	    	   result[3]="";
	    	   result[4]="";
	       }
	        Output+=result[0]+";"+result[1]+";"+result[2]+";"+result[3]+";"+result[4]+";"+""+";"+""+";"+" \n";
	        
		}
		
       return Output;
} 
}






