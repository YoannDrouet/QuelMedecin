package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;

public class Creneau {
    private LocalTime horaireDebut;
    private int duree;
    private MedecinGeneraliste medecin;

    public Creneau(LocalTime horaireDebut, int duree, MedecinGeneraliste medecin) {
        this.horaireDebut = horaireDebut;
        this.duree = duree;
        this.medecin = medecin;
        this.medecin.ajouterCreneau(this);
    }

    public void afficher(){
        System.out.println(this.horaireDebut.toString() + " - " + this.horaireDebut.plusMinutes(duree) +
                " (" + duree + " minutes)");
    }

    public MedecinGeneraliste getMedecin() {
        return this.medecin;
    }
}
