package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Classe RendezVous
 * <ul>
 *     <li><b>creneau :</b> le creneau de consultation concerné par le rendez-vous</li>
 *     <li><b>patient :</b> le patient qui prend le rendez-vous</li>
 *     <li><b>dateRDV :</b> la date du rendez-vous</li>
 * </ul>
 * @author Yoann Drouet
 */
public class RendezVous {
    private Creneau creneau;
    private Patient patient;
    private LocalDate dateRDV;

    public RendezVous(Creneau creneau, Patient patient, LocalDate dateRDV) {
        this.creneau = creneau;
        this.patient = patient;
        this.dateRDV = dateRDV;
    }

    /**
     * Affiche l'instance sous la forme de <br>
     * Date plage horaire durée<br>
     * Nom du médecin<br>
     * NOM Prénom du patient<br>
     * Numéro de téléphone : XXXXXXXXXX<br>
     * Sexe : X<br>
     * Numéro de sécurité sociale : XXXXXXXXXXXXXXX<br>
     * Date de naissance : JJ Mois AAAA<br>
     * Commentaire : XXXXXX<br>
     * Adresse :<br>
     * Infomartions complémentaire (s'il y en a)<br>
     * Numéro Complément<br>
     * Nom de voie<br>
     * Code postal Ville<br>
     */
    public void afficher(){
        System.out.print("Rendez-vous du " +
                this.dateRDV.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)) +
                " ");
        creneau.afficher();

        System.out.println("Avec le Dr " + this.creneau.getMedecin().getNom());
        System.out.print("Pour ");
        this.patient.afficher();
    }
}
