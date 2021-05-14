package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe Medecin qui hérite de la classe Personne
 * <ul>
 *     <li><b>creneau :</b> le tableau de créneau de rendez-vous du medecin</li>
 *     <li><b>nbCreneau :</b> le nombre de créneau de rendez-vous que possède le médecin</li>
 * </ul>
 * @author Yoann Drouet
 */
public class Medecin extends Personne{
    protected Creneau[] creneau;
    protected int nbCreneau;

    public Medecin(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.creneau = new Creneau[15];
        this.nbCreneau = 0;
    }

    public String getNom() {
        return nom;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    /**
     * Vérifie que le nombre de créneau est inférieur à 15<br>
     * Si c'est le cas rajoute le créneau à ce médecin<br>
     * Sinon indique que l'on ne peut pas rajouter de créneau
     * @param creneau
     */
    public void ajouterCreneau(Creneau creneau){
        if (nbCreneau<15){
            this.creneau[this.nbCreneau] = creneau;
            nbCreneau++;
        }else{
            System.out.println("Ce médecin à atteint son nombre de créneaux maximum");
        }
    }
}
