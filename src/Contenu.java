//la classe Contenu c'est le tableau a trois colonnes: id, categorie, lemme
class Contenu {
    private String categorie;
    private int id;
	private String lemma;
	private String mot;
	public String anaylise;
	private String mode;
	private String temps;
	private String pers;
	private String genre;
	private String nombre;
	
	//constructeur
	public Contenu(int id,  String mot, String categorie, String lemma, String mode, String temps, String pers, String genre, String nombre) {
	this.id = id;
	this.categorie=categorie;
	this.lemma = lemma;	
	this.mot=mot;
	this.mode=mode;
	this.temps=temps;
	this.pers=pers;
	this.genre=genre;
	this.nombre=nombre;
    }
	
   public int getId() {
       return id;
   }
   public String getWord() {
	   return this.mot;
   } 
   public String getCategory() {
	   return this.categorie;
   }
 
   public String getLemma() {
	   return this.lemma;
   }
   public String getMode() {
	   return this.mode;
   }
   public String getTemps() {
	   return this.temps;
   }
   public String getPers() {
	   return this.pers;
   }
   public String getGenre() {
	   return this.genre;
   }
   public String getNombre() {
	   return this.nombre;
   }
}
