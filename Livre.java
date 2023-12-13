public class Livre{
    // Variables 
    private String titre, auteur; 
    private int NbPages;
    // Constructeur 
    public Livre(String unAuteur, String unTitre){
        auteur = unAuteur; 
        titre = unTitre; 
    } 
    // Accesseur 
    public String getAuteur() { 
        return auteur; 
    } 

    // Modificateur 
    public  void setNbPages(int nb) { 
        NbPages = nb; 
    }
       // la methode main
    public static void main (String [] args)
    {
        // creation de mes deux objets Livre
        Livre roman1 = new Livre ("Ferdinand oyono" , "une vie de boy" );
        Livre roman2 = new Livre ("Mariama Bâ" ," une si longue lettre" );
        
        // appel des fonctions pour l'affichage des auteurs
        String auteur1 = roman1.getAuteur ();
        String auteur2 = roman2.getAuteur ();

        System.out.println ("L'auteur d'une vie de boy est : "+auteur1);
        System.out.println ("L'auteur d'une si longue lettre est : "+auteur2);  
    
    } 
}
