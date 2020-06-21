import java.util.List;

public class test {

	public static void main(String[] args){


     //fichier_test t = new fichier_test("sortieBrillPropre_coupe.txt","Brill");
	//fichier_test t= new fichier_test("form2lemme.txt","LiaPhon");
		//fichier_test t = new fichier_test("treetagger.ttg","TreeTagger");
		fichier_test t = new fichier_test("sortieTalismane.csv","Talisman");
  	  
  	  //System.out.println(t.lignesParsees);
  	  String tpU="Vb";
  	  for(int i=0; i<t.contenus.size();i++) {
  		  //(int id,  String mot, String categorie, String lemma, String mode, String temps, String pers, String genre, String nombre
  		  System.out.println(t.contenus.get(i).getId() + ";" + t.contenus.get(i).getWord()+";"+t.contenus.get(i).getCategory()+";"+ t.contenus.get(i).getLemma()+";"+t.contenus.get(i).getMode()+";"+ t.contenus.get(i).getTemps()+";"+  t.contenus.get(i).getPers()+ t.contenus.get(i).getGenre()+";"+t.contenus.get(i).getNombre());
  	  }
  	  //System.out.println(t.contenus);
  	   System.out.println(t.motsEnFonctionDeCategorie(t.contenus, tpU));
  	   System.out.println(t.nbOccLemme(t.contenus));
      }
    
}
