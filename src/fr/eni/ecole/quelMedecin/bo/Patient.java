package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Classe Patient
 * <ul>
 *     <li><b>nom :</b> nom du patient</li>
 *     <li><b>prenom :</b> prenom du patient</li>
 *     <li><b>numeroDeTelephone</b> numéro de téléphone du patient</li>
 *     <li><b>sexe :</b> le sexe du patient</li>
 *     <li><b>numeroSecuriteSociale :</b> le numéro de sécurité sociale du patient</li>
 *     <li><b>dateDeNaissance :</b> date de naissance du patient</li>
 *     <li><b>commentaire :</b> commentaire (allergie, maladie chronique,...)</li>
 * </ul>
 * @author Yoann Drouet
 */
public class Patient {
    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private char sexe;
    private long numeroSecuriteSociale;
    private LocalDate dateDeNaissance;
    private String commentaires;

    /**
     * Permet de construire une instance de la classe Patient
     * @param nom
     * @param prenom
     * @param numeroDeTelephone
     * @param sexe
     * @param numeroSecuriteSociale
     * @param dateDeNaissance
     * @param commentaires
     */
    public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numeroSecuriteSociale, LocalDate dateDeNaissance, String commentaires) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        if (sexe == 'F') {
            this.sexe = sexe;
        }else{
            this.sexe = 'M';
        }
        this.numeroSecuriteSociale = numeroSecuriteSociale;
        this.dateDeNaissance = dateDeNaissance;
        this.commentaires = commentaires;
    }

    /**
     *
     * @return Le nom du patient
     */
    public String getNom() {
        return nom.toUpperCase();
    }

    /**
     *
     * @return Le prenom du patient
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     *
     * @return Le numero de téléphone du patient
     */
    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    /**
     *
     * @return Le sexe du patient
     */
    public char getSexe() {
        return sexe;
    }

    /**
     *
     * @return Le numéro de sécurité sociale du patient
     */
    public long getNumeroSecuriteSociale() {
        return numeroSecuriteSociale;
    }

    /**
     *
     * @return La date de naissance du patient sous forme de String
     */
    public String getDateDeNaissance() {
        String dateNaissance;
        int jours = this.dateDeNaissance.getDayOfMonth();
        int annee = this.dateDeNaissance.getYear();
        int mois = this.dateDeNaissance.getMonthValue();
        String valMois;

        switch (mois){
            case 1 : valMois = "janvier";break;
            case 2 : valMois = "février";break;
            case 3 : valMois = "mars";break;
            case 4 : valMois = "avril";break;
            case 5 : valMois = "mai";break;
            case 6 : valMois = "juin";break;
            case 7 : valMois = "juillet";break;
            case 8 : valMois = "août";break;
            case 9 : valMois = "septembre";break;
            case 10 : valMois = "octobre";break;
            case 11 : valMois = "novembre";break;
            default : valMois = "décembre";
        }

        dateNaissance = String.valueOf(jours) + " " + valMois + " " + String.valueOf(annee);
        return dateNaissance;
    }

    /**
     *
     * @return Le commentaire de la fiche patient
     */
    public String getCommentaires() {
        if (this.commentaires != null) {
            return commentaires;
        }else{
            return "[Pas de commentaires]";
        }
    }

    /**
     * Permet d'afficher les caractéristiques d'une instance de la fiche patient
     */
    public void afficher(){
        System.out.printf("%s %s%n",this.getNom(), this.getPrenom());
        System.out.printf("Téléphone : %s%n", this.getNumeroDeTelephone());
        System.out.printf("Sexe %s%n", Character.toString(this.getSexe()));
        System.out.printf("Numéro de Sécurité sociale : %d%n", this.getNumeroSecuriteSociale());
        System.out.printf("Date de naissance : %s%n", this.dateDeNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.printf("Commentaires : %s%n", this.getCommentaires());
    }
}
