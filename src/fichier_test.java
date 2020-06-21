import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 

public class fichier_test {
	private String nomFic;
    private String typeFic;
    public String lignesParsees = new String("");
    public List<Contenu> contenus = new ArrayList<>();
  
    //pour ceux qui s'occupent de l'interface: utilisez nomFic pour demander a l'utilisateur un nom de fichier et typeFic pour demander le type
   
    public fichier_test(String nomFic, String typeFic) {
		this.nomFic = nomFic;
		this.typeFic=typeFic;	
    	 Parse analyse=null;
        
        //methode qui transforme n'importe quel fic en Contenu
    	

      if (typeFic=="TreeTagger") {
    	  analyse=new Treetagger();
      }
      else if (typeFic=="Spacy") {
    	  analyse=new Spacy();
    	  
      }
      else if(typeFic=="Talisman") {
    	  analyse=new Talisman();
      }
      else if(typeFic=="Brill") {
    	  analyse=new Brill();
      }
      else if(typeFic=="StanfordCoreFrench") {
    	  analyse=new StanfordCoreFrench();
      }
      else if(typeFic=="LiaPhon") {
    	  analyse=new LiaPhon();
      }
      else if(typeFic=="Cordial") {
    	  analyse=new Cordial();
      }
      lignesParsees = analyse.parse(nomFic);
  	  String[] arrOfLignes=lignesParsees.split("\n");
  	  
	  for(int i=0; i<arrOfLignes.length; i++) {  
		  String[] arrOfStr=arrOfLignes[i].split(";") ;
		  if(arrOfStr.length >= 8)
			  contenus.add(new Contenu(i, arrOfStr[0], arrOfStr[1],arrOfStr[2],arrOfStr[3],arrOfStr[4],arrOfStr[5],arrOfStr[6],arrOfStr[7]));//i=ID, arrOfStr[0]=le mot, arrOfStr[1]=categorie, arrOfStr[2]=le lemme
  	  }
    }
      

 
    //les méthodes pour manipuler le tableau
    
    
    //filtrer d'après une certaine catégorie donnée par l'utilisateur
    //(afficher tous les mots d'apres une certaine categorie)
    //typeCateg= la categorie donnee par l'utilisateur
    public List<String> motsEnFonctionDeCategorie(List<Contenu> contenus, String typeCateg) {
    	List<String>mots = new ArrayList<>();
    	for(int i=0; i<contenus.size();i++) {
    		Contenu ligne=contenus.get(i);
    		if(ligne.getCategory().equals(typeCateg)) {
    			mots.add(ligne.getWord());
    		}
    	}
    	return mots;
    }
  
    
   
  //methode qui renvoie le nombre d'occurences de tous les lemmes et affiche aussi tous les lemmes 
    public Map<String, Integer> nbOccLemme(List<Contenu> contenus){
    	Map<String, Integer> lemmesOcc = new HashMap<String, Integer>();
    	
    	for(int i=0; i<contenus.size();i++) {
    		Contenu ligne=contenus.get(i);
    		
    		//lemmesOcc.put(ligne.getLemma(),nbOcc);
    		if(lemmesOcc.containsKey(ligne.getLemma())) {
    			
    			lemmesOcc.put(ligne.getLemma(),lemmesOcc.get(ligne.getLemma())+1);
    		}
    		else {
    			
    			lemmesOcc.put(ligne.getLemma(),1);
    		}
    		
    		//lemmesOcc.put(ligne.getLemma(),Collections.frequency(contenus,ligne.getLemma()));
    	    
    	}
    	
    	 
    	return lemmesOcc;
    }
    
    public Map<String, Integer> nbOccFormes(List<Contenu> contenus){
    	Map<String, Integer> formesOcc = new HashMap<String, Integer>();
    	
    	for(int i=0; i<contenus.size();i++) {
    		Contenu ligne=contenus.get(i);
    		
    		//lemmesOcc.put(ligne.getLemma(),nbOcc);
    		if(formesOcc.containsKey(ligne.getWord())) {
    			
    			formesOcc.put(ligne.getWord(),formesOcc.get(ligne.getWord())+1);
    		}
    		else {
    			
    			formesOcc.put(ligne.getWord(),1);
    		}
    		
    	    
    	}
    	
    	 
    	return formesOcc;
    }
    //methode qui renvoie le nombre d'occurences d'une categorie donnee par l'utilisateur
    public int nbOccurencesCategorie (List<Contenu>tableau, String typeCateg) {
    	int nbOcc=0;
    	for(int i=0;i<tableau.size();i++) {
    		Contenu ligne=tableau.get(i);
    		if(ligne.getCategory().equals(typeCateg)) {
    			nbOcc++;
    		}
    	}
    	return nbOcc;
    }
    
    //methode qui renvoie tous les verbes d'un certain mode donne par l'utilisateur
    public List<String> verbEnFonctionDeMode (List<Contenu>contenus,String modeUtil){
    	List<String>verbes=new ArrayList<>();
    	for(int i=0;i<contenus.size();i++) {
    		Contenu ligne=contenus.get(i);
    		if(ligne.getCategory().contentEquals("verb")&&ligne.getMode().equals(modeUtil)){
    			verbes.add(ligne.getWord());
    		}
    	}
    	return verbes;
    }
    
  //methode qui renvoie tous les verbes d'un certain temps donne par l'utilisateur
    public List<String> verbEnFonctionDeTemps (List<Contenu>contenus,String tempsUtil){
    	List<String>verbes=new ArrayList<>();
    	for(int i=0;i<contenus.size();i++) {
    		Contenu ligne=contenus.get(i);
    		if(ligne.getCategory().contentEquals("verb")&&ligne.getTemps().equals(tempsUtil)){
    			verbes.add(ligne.getWord());
    		}
    	}
    	return verbes;
    }
    
    //methode qui renvoie tous les verbes d'une certaine personne donnee par l'utilisateur
    public List<String> verbEnFonctionDePersonne (List<Contenu>contenus,String persUtil){
    	List<String>verbes=new ArrayList<>();
    	for(int i=0;i<contenus.size();i++) {
    		Contenu ligne=contenus.get(i);
    		if(ligne.getCategory().contentEquals("verb")&&ligne.getPers().equals(persUtil)){
    			verbes.add(ligne.getWord());
    		}
    	}
    	return verbes;
    }
    
  //methode qui renvoie tous les noms d'un certain genre donne par l'utilisateur
    public List<String> nomsEnFonctionDeGenre (List<Contenu>contenus,String genreUtil){
    	List<String>noms=new ArrayList<>();
    	for(int i=0;i<contenus.size();i++) {
    		Contenu ligne=contenus.get(i);
    		if(ligne.getCategory().contentEquals("nom")&&ligne.getGenre().equals(genreUtil)){
    			noms.add(ligne.getWord());
    		}
    	}
    	return noms;
    }
    
  //methode qui renvoie tous les noms d'un certain nombre donne par l'utilisateur
    public List<String> nomsEnFonctionDeNombre (List<Contenu>contenus,String nombreUtil){
    	List<String>noms=new ArrayList<>();
    	for(int i=0;i<contenus.size();i++) {
    		Contenu ligne=contenus.get(i);
    		if(ligne.getCategory().contentEquals("nom")&&ligne.getNombre().equals(nombreUtil)){
    			noms.add(ligne.getWord());
    		}
    	}
    	return noms;
    }
    

    }
    
   