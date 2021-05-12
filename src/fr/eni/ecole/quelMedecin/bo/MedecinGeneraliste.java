package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;
import java.util.Locale;

/**
 * Classe MedecinGeneraliste
 * <ul>
 *     <li><b>nom :</b> nom du medecin</li>
 *     <li><b>prenom :</b> prenom du medecin</li>
 *     <li><b>numeroDeTelephone :</b> numero de téléphone du medecin</li>
 *     <li><b>adresse :</b> L'adresse postale du medecin généraliste</li>
 *     <li><b>creneau :</b> Un tableau de créneau pouvant aller jusqu'à 15 par personne</li>
 *     <li><b>nbCreneau :</b> Compteur permettant de savoir combien de créneau de rendes-vous possède un médecin</li>
 * </ul>
 * <ul>
 *     <li><b>tarif :</b> tarif de consultation, commun à tous les medecins</li>
 * </ul>
 * @author Yoann Drouet
 */
public class MedecinGeneraliste {
    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private Adresse adresse;
    private Creneau[] creneau;
    private int nbCreneau;

    private static int tarif;

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
        creneau = new Creneau[15];
        nbCreneau = 0;
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

    public String getNom() {
        return nom;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public static int getTarif() {
        return tarif;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public static void setTarif(int tarif) {
        MedecinGeneraliste.tarif = tarif;
    }

    /**
     * Affiche l'instance sous la forme de <br>
     * NOM Prénom<br>
     * Numéro de téléphone : XXXXXXXXXX<br>
     * Tarif : XX€<br>
     * Adresse :<br>
     * Infomartions complémentaire (s'il y en a)<br>
     * Numéro Complément<br>
     * Nom de voie<br>
     * Code postal Ville<br>
     */
    public void afficher(){
        System.out.printf("%s %s%n",this.getNom().toUpperCase(), this.prenom);
        System.out.printf("Numéro de téléphone : %s%n", this.getNumeroDeTelephone());
        System.out.printf("Tarif : %d€%n", getTarif());
        System.out.println("Adresse :");
        this.adresse.afficher();
        for (int i = 0; i < creneau.length; i++) {
            if (creneau[i] != null){
                this.creneau[i].afficher();
            }
        }
    }
}
