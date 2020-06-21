import java.util.HashMap;

public class LiaPhon implements Parse {
	public String nom;
	
	HashMap <String, String> liaPhonHashCat  = new HashMap<String, String>();
	
	public String regexStr = ";";
	
	public LiaPhon () {
		this.nom=nom;
		liaPhonHashCat.put("ADV",";Adv; ; ; ; ; .");
		liaPhonHashCat.put("ADVNE",";Adv; ; ; ; ; .");
		liaPhonHashCat.put("ADVPAS",";Adv; ; ; ; ; .");
		liaPhonHashCat.put("AFP",";Adj; ; ; ;F�minin;Pluriel;");
		liaPhonHashCat.put("AFS",";Adj; ; ; ;F�minin;Singulier;");
		liaPhonHashCat.put("AINDFP",";Adj; ; ; ;F�minin;Pluriel;");
		liaPhonHashCat.put("AINDFS",";Adj; ; ; ;F�minin;Singulier;");
		liaPhonHashCat.put("AINDMP",";Adj; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("AINDMS",";Adj; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("AMP",";Adj; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("AMS",";Adj; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("CHIF",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("COCO",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("COSUB",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("DETFP",";Det; ; ; ;F�minin;Pluriel;");
		liaPhonHashCat.put("DETFS",";Det; ; ; ;F�minin;Singulier;");
		liaPhonHashCat.put("DETMP",";Det; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("DETMS",";Det; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("DINTFP",";Det; ; ; ;F�minin;Pluriel;");
		liaPhonHashCat.put("DINTFS",";Det; ; ; ;F�minin;Singulier;");
		liaPhonHashCat.put("DINTMP",";Det; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("DINTMS",";Det; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("MOTINC",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("NFP",";Nom; ; ; ;F�minin;Pluriel;");
		liaPhonHashCat.put("NFS",";Nom; ; ; ;F�minin;Singulier;");
		liaPhonHashCat.put("NMP",";Nom; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("NMS",";Nom; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("PDEMFP"," ; ; ;F�minin;Pluriel;");
		liaPhonHashCat.put("PDEMFS"," ; ; ;F�minin;Singulier;");
		liaPhonHashCat.put("PDEMMP"," ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("PDEMMS",";Pron; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("PINDFP",";Pron; ; ; ;F�minin;Pluriel;");
		liaPhonHashCat.put("PINDFS",";Pron; ; ; ;F�minin;Singulier;");
		liaPhonHashCat.put("PINDMP",";Pron; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("PINDMS",";Pron; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("PINTFP",";Pron; ; ; ;F�minin;Pluriel;");
		liaPhonHashCat.put("PINTFS",";Pron; ; ; ;F�minin;Singulier;");
		liaPhonHashCat.put("PINTMP",";Pron; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("PINTMS",";Pron; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("PPER1S",";Pron; ; ;Premi�re; ;Singulier;");
		liaPhonHashCat.put("PPER1P",";Pron; ; ;Premi�re; ;Pluriel;");
		liaPhonHashCat.put("PPER2S",";Pron; ; ;Deuxi�me; ;Singulier;");
		liaPhonHashCat.put("PPER2P",";Pron; ; ;Deuxi�me; ;Pluriel;");
		liaPhonHashCat.put("PPER3FS",";Pron; ; ;Troisi�me;F�minin;Singulier;");
		liaPhonHashCat.put("PPER3FP",";Pron; ; ;Troisi�me;F�minin;Pluriel;");
		liaPhonHashCat.put("PPER3MS",";Pron; ; ;Troisi�me;Masculin;Singulier;");
		liaPhonHashCat.put("PPER3MP",";Pron; ; ;Troisi�me;Masculin;Pluriel;");
		liaPhonHashCat.put("PPOBJFP",";Pron; ; ; ;F�minin;Pluriel;");
		liaPhonHashCat.put("PPOBJFS",";Pron; ; ; ;F�minin;Singulier;");
		liaPhonHashCat.put("PPOBJMP",";Pron; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("PPOBJMS",";Pron; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("PREFFP",";Pron; ; ; ;F�minin;Pluriel;");
		liaPhonHashCat.put("PREFFS",";Pron; ; ; ;F�minin;Singulier;");
		liaPhonHashCat.put("PREFMP",";Pron; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("PREFMS",";Pron; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("PRELFP",";Pron; ; ; ;F�minin;Pluriel;");
		liaPhonHashCat.put("PRELFS",";Pron; ; ; ;F�minin;Singulier;");
		liaPhonHashCat.put("PRELMP",";Pron; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("PRELMS",";Pron; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("PREP",";Prep; ; ; ; ; .");
		liaPhonHashCat.put("PREPADE",";Prep; ; ; ; ; .");
		liaPhonHashCat.put("PREPAU",";Prep; ; ; ; ; .");
		liaPhonHashCat.put("PREPAUX",";Prep; ; ; ; ; .");
		liaPhonHashCat.put("PREPDES",";Prep; ; ; ; ; .");
		liaPhonHashCat.put("PREPDU",";Prep; ; ; ; ; .");
		liaPhonHashCat.put("V1P",";Vb; ; ;Premi�re; ;Pluriel;");
		liaPhonHashCat.put("V1S",";Vb; ; ;Premi�re; ;Singulier;");
		liaPhonHashCat.put("V2P",";Vb; ; ;Deuxi�me; ;Pluriel;");
		liaPhonHashCat.put("V2S",";Vb; ; ;Deuxi�me; ;Singulier;");
		liaPhonHashCat.put("V3S",";Vb; ; ;Troisi�me; ;Singulier;");
		liaPhonHashCat.put("V3P",";Vb; ; ;Troisi�me; ;Pluriel;");
		liaPhonHashCat.put("VA1P",";Vb; ; ;Premi�re; ;Pluriel;");
		liaPhonHashCat.put("VA1S",";Vb; ; ;Premi�re; ;Singulier;");
		liaPhonHashCat.put("VA2P",";Vb; ; ;Deuxi�me; ;Pluriel;");
		liaPhonHashCat.put("VA2S",";Vb; ; ;Deuxi�me; ;Singulier;");
		liaPhonHashCat.put("VA3P",";Vb; ; ;Troisi�me; ;Pluriel;");
		liaPhonHashCat.put("VA3S",";Vb; ; ;Troisi�me; ;Singulier;");
		liaPhonHashCat.put("VAINF",";Vb;Infinitif; ; ; ; .");
		liaPhonHashCat.put("VE1P",";Vb; ; ;Premi�re; ;Pluriel;");
		liaPhonHashCat.put("VE1S",";Vb; ; ;Premi�re;Singulier;");
		liaPhonHashCat.put("VE2P",";Vb; ; ;Deuxi�me; ;Pluriel;");
		liaPhonHashCat.put("VE2S",";Vb; ; ;Deuxi�me; ;Singulier;");
		liaPhonHashCat.put("VE3P",";Vb; ; ;Troisi�me; ;Pluriel;");
		liaPhonHashCat.put("VE3S",";Vb; ; ;Troisi�me; ;Singulier;");
		liaPhonHashCat.put("VEINF",";Vb;Infinitif; ; ; ; .");
		liaPhonHashCat.put("VINF","Vb;Infinitif; ; ; ; ; .");
		liaPhonHashCat.put("VPPFP",";Vb;Participe;Pass�; ;F�minin;Pluriel;");
		liaPhonHashCat.put("VPPFS",";Vb;Participe;Pass�; ;F�minin;Singulier;");
		liaPhonHashCat.put("VPPMP",";Vb;Participe;Pass�; ;Masculin;Pluriel;");
		liaPhonHashCat.put("VPPMS",";Vb;Participe;Pass�; ;Masculin;Singulier;");
		liaPhonHashCat.put("VPPRE",";Vb;Participe;Pr�sent; ; ; .");
		liaPhonHashCat.put("XFAMIL",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("XPAYFP",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("XPAYFS",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("XPAYMP",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("XPAYMS",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("XPREF",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("XPREM",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("XSOC",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("XVILLE",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("YPFAI",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("YPFOR",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("ZTRM",";Autre; ; ; ; ; .");
	}
	public String parse(String nom) {
	String ligne="";
	String ligneligne="";
	FichierR fichierLiaPhon = new FichierR(nom);
	int ficSize = fichierLiaPhon.nbLignes;{
	for (int i=1; i<=ficSize; i++) {
		ligne = fichierLiaPhon.ligne(i);
		ligne = ligne.replace(' ', ';');
		String[] col = ligne.split(regexStr);			
		String cat = col[1];
		ligne=ligne+liaPhonHashCat.get(cat);
		String[] cols = ligne.split(regexStr);
		ligneligne+=cols[0]+";"+cols[3]+";"+cols[2]+";"+cols[4]+";"+cols[5]+";"+cols[6]+";"+cols[7]+";"+cols[8]+"\n";
	//System.out.println(ligneligne);
			}
		}
return(ligneligne);
	}
}
