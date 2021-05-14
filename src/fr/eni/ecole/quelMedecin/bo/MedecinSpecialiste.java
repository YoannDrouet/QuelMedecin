package fr.eni.ecole.quelMedecin.bo;

import fr.eni.ecole.quelMedecin.bo.Adresse;
import fr.eni.ecole.quelMedecin.bo.Medecin;

/**
 * Classe MedecinSpecialiste qui hérite de la classe Medecin
 * <ul>
 *     <li><b>specialite :</b> La spécialité du spécialiste</li>
 *     <li><b>tarif :</b> tarif de consultation, propre au spécialiste</li>
 * </ul>
 * @author Yoann Drouet
 */
public class MedecinSpecialiste extends Medecin {

    private String specialite;
    private int tarif;

    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, String specialite, int tarif) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.specialite = specialite;
        this.tarif = tarif;
    }

    public int getTarif() {
        return tarif;
    }

    public void afficher(){
        System.out.printf("%s %s%n",super.getNom().toUpperCase(), this.prenom);
        System.out.printf("Numéro de téléphone : %s%n", super.getNumeroDeTelephone());
        System.out.printf("Spécialité : %s%n", this.specialite);
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
