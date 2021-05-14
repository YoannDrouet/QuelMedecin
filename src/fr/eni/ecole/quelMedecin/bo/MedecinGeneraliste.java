package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;
import java.util.Locale;

/**
 * Classe MedecinGeneraliste qui hérite de la classe Medecin
 * <ul>
 *     <li><b>tarif :</b> tarif de consultation, commun à tous les medecins</li>
 * </ul>
 * @author Yoann Drouet
 */
public class MedecinGeneraliste extends Medecin {

    private static int tarif;

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        super(nom, prenom, numeroDeTelephone, adresse);
    }

    public static int getTarif() {
        return tarif;
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
