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
		liaPhonHashCat.put("AFP",";Adj; ; ; ;Féminin;Pluriel;");
		liaPhonHashCat.put("AFS",";Adj; ; ; ;Féminin;Singulier;");
		liaPhonHashCat.put("AINDFP",";Adj; ; ; ;Féminin;Pluriel;");
		liaPhonHashCat.put("AINDFS",";Adj; ; ; ;Féminin;Singulier;");
		liaPhonHashCat.put("AINDMP",";Adj; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("AINDMS",";Adj; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("AMP",";Adj; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("AMS",";Adj; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("CHIF",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("COCO",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("COSUB",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("DETFP",";Det; ; ; ;Féminin;Pluriel;");
		liaPhonHashCat.put("DETFS",";Det; ; ; ;Féminin;Singulier;");
		liaPhonHashCat.put("DETMP",";Det; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("DETMS",";Det; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("DINTFP",";Det; ; ; ;Féminin;Pluriel;");
		liaPhonHashCat.put("DINTFS",";Det; ; ; ;Féminin;Singulier;");
		liaPhonHashCat.put("DINTMP",";Det; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("DINTMS",";Det; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("MOTINC",";Autre; ; ; ; ; .");
		liaPhonHashCat.put("NFP",";Nom; ; ; ;Féminin;Pluriel;");
		liaPhonHashCat.put("NFS",";Nom; ; ; ;Féminin;Singulier;");
		liaPhonHashCat.put("NMP",";Nom; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("NMS",";Nom; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("PDEMFP"," ; ; ;Féminin;Pluriel;");
		liaPhonHashCat.put("PDEMFS"," ; ; ;Féminin;Singulier;");
		liaPhonHashCat.put("PDEMMP"," ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("PDEMMS",";Pron; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("PINDFP",";Pron; ; ; ;Féminin;Pluriel;");
		liaPhonHashCat.put("PINDFS",";Pron; ; ; ;Féminin;Singulier;");
		liaPhonHashCat.put("PINDMP",";Pron; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("PINDMS",";Pron; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("PINTFP",";Pron; ; ; ;Féminin;Pluriel;");
		liaPhonHashCat.put("PINTFS",";Pron; ; ; ;Féminin;Singulier;");
		liaPhonHashCat.put("PINTMP",";Pron; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("PINTMS",";Pron; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("PPER1S",";Pron; ; ;Première; ;Singulier;");
		liaPhonHashCat.put("PPER1P",";Pron; ; ;Première; ;Pluriel;");
		liaPhonHashCat.put("PPER2S",";Pron; ; ;Deuxième; ;Singulier;");
		liaPhonHashCat.put("PPER2P",";Pron; ; ;Deuxième; ;Pluriel;");
		liaPhonHashCat.put("PPER3FS",";Pron; ; ;Troisième;Féminin;Singulier;");
		liaPhonHashCat.put("PPER3FP",";Pron; ; ;Troisième;Féminin;Pluriel;");
		liaPhonHashCat.put("PPER3MS",";Pron; ; ;Troisième;Masculin;Singulier;");
		liaPhonHashCat.put("PPER3MP",";Pron; ; ;Troisième;Masculin;Pluriel;");
		liaPhonHashCat.put("PPOBJFP",";Pron; ; ; ;Féminin;Pluriel;");
		liaPhonHashCat.put("PPOBJFS",";Pron; ; ; ;Féminin;Singulier;");
		liaPhonHashCat.put("PPOBJMP",";Pron; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("PPOBJMS",";Pron; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("PREFFP",";Pron; ; ; ;Féminin;Pluriel;");
		liaPhonHashCat.put("PREFFS",";Pron; ; ; ;Féminin;Singulier;");
		liaPhonHashCat.put("PREFMP",";Pron; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("PREFMS",";Pron; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("PRELFP",";Pron; ; ; ;Féminin;Pluriel;");
		liaPhonHashCat.put("PRELFS",";Pron; ; ; ;Féminin;Singulier;");
		liaPhonHashCat.put("PRELMP",";Pron; ; ; ;Masculin;Pluriel;");
		liaPhonHashCat.put("PRELMS",";Pron; ; ; ;Masculin;Singulier;");
		liaPhonHashCat.put("PREP",";Prep; ; ; ; ; .");
		liaPhonHashCat.put("PREPADE",";Prep; ; ; ; ; .");
		liaPhonHashCat.put("PREPAU",";Prep; ; ; ; ; .");
		liaPhonHashCat.put("PREPAUX",";Prep; ; ; ; ; .");
		liaPhonHashCat.put("PREPDES",";Prep; ; ; ; ; .");
		liaPhonHashCat.put("PREPDU",";Prep; ; ; ; ; .");
		liaPhonHashCat.put("V1P",";Vb; ; ;Première; ;Pluriel;");
		liaPhonHashCat.put("V1S",";Vb; ; ;Première; ;Singulier;");
		liaPhonHashCat.put("V2P",";Vb; ; ;Deuxième; ;Pluriel;");
		liaPhonHashCat.put("V2S",";Vb; ; ;Deuxième; ;Singulier;");
		liaPhonHashCat.put("V3S",";Vb; ; ;Troisième; ;Singulier;");
		liaPhonHashCat.put("V3P",";Vb; ; ;Troisième; ;Pluriel;");
		liaPhonHashCat.put("VA1P",";Vb; ; ;Première; ;Pluriel;");
		liaPhonHashCat.put("VA1S",";Vb; ; ;Première; ;Singulier;");
		liaPhonHashCat.put("VA2P",";Vb; ; ;Deuxième; ;Pluriel;");
		liaPhonHashCat.put("VA2S",";Vb; ; ;Deuxième; ;Singulier;");
		liaPhonHashCat.put("VA3P",";Vb; ; ;Troisième; ;Pluriel;");
		liaPhonHashCat.put("VA3S",";Vb; ; ;Troisième; ;Singulier;");
		liaPhonHashCat.put("VAINF",";Vb;Infinitif; ; ; ; .");
		liaPhonHashCat.put("VE1P",";Vb; ; ;Première; ;Pluriel;");
		liaPhonHashCat.put("VE1S",";Vb; ; ;Première;Singulier;");
		liaPhonHashCat.put("VE2P",";Vb; ; ;Deuxième; ;Pluriel;");
		liaPhonHashCat.put("VE2S",";Vb; ; ;Deuxième; ;Singulier;");
		liaPhonHashCat.put("VE3P",";Vb; ; ;Troisième; ;Pluriel;");
		liaPhonHashCat.put("VE3S",";Vb; ; ;Troisième; ;Singulier;");
		liaPhonHashCat.put("VEINF",";Vb;Infinitif; ; ; ; .");
		liaPhonHashCat.put("VINF","Vb;Infinitif; ; ; ; ; .");
		liaPhonHashCat.put("VPPFP",";Vb;Participe;Passé; ;Féminin;Pluriel;");
		liaPhonHashCat.put("VPPFS",";Vb;Participe;Passé; ;Féminin;Singulier;");
		liaPhonHashCat.put("VPPMP",";Vb;Participe;Passé; ;Masculin;Pluriel;");
		liaPhonHashCat.put("VPPMS",";Vb;Participe;Passé; ;Masculin;Singulier;");
		liaPhonHashCat.put("VPPRE",";Vb;Participe;Présent; ; ; .");
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
