package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe Personne
 * <ul>
 *     <li><b>nom :</b> le  nom de la personne</li>
 *     <li><b>prenom :</b> le prenom de la personne</li>
 *     <li><b>numeroDeTelephone :</b> le numéro de téléphone de la personne</li>
 *     <li><b>adresse :</b> l'adresse de la personne</li>
 * </ul>
 * @author Yoann Drouet
 */
public class Personne {
    protected String nom;
    protected String prenom;
    protected String numeroDeTelephone;
    protected Adresse adresse;

    public Personne(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
    }
}
