package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;

/**
 * Classe Creneau
 * <ul>
 *     <li><b>horaireDebut :</b> l'heure du début de la consultation</li>
 *     <li><b>duree :</b> la durée de la consultation</li>
 *     <li><b>medecinGeneraliste :</b> le médecin réalisant le rendez-vous</li>
 * </ul>
 * @author Yoann Drouet
 */
public class Creneau {
    private LocalTime horaireDebut;
    private int duree;
    private Medecin medecin;

    public Creneau(LocalTime horaireDebut, int duree, Medecin medecin) {
        this.horaireDebut = horaireDebut;
        this.duree = duree;
        this.medecin = medecin;
        this.medecin.ajouterCreneau(this);
    }

    public Medecin getMedecin() {
        return this.medecin;
    }

    /**
     * Affiche l'instance sous la forme de <br>
     * horaire de début - horaire de fin (durée)
     */
    public void afficher(){
        System.out.println(this.horaireDebut.toString() + " - " + this.horaireDebut.plusMinutes(duree) +
                " (" + duree + " minutes)");
    }
}
