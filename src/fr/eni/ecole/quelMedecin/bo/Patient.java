package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Classe Patient qui hérite de la classe Personne
 * <ul>
 *     <li><b>sexe :</b> le sexe du patient</li>
 *     <li><b>numeroSecuriteSociale :</b> le numéro de sécurité sociale du patient</li>
 *     <li><b>dateDeNaissance :</b> date de naissance du patient</li>
 *     <li><b>commentaire :</b> commentaire (allergie, maladie chronique,...)</li>
 * </ul>
 * @author Yoann Drouet
 */
public class Patient extends Personne{

    private char sexe;
    private long numeroSecuriteSociale;
    private LocalDate dateDeNaissance;
    private String commentaires;

    public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numeroSecuriteSociale, LocalDate dateDeNaissance, String commentaires , Adresse adresse) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.sexe = sexe;
        this.numeroSecuriteSociale = numeroSecuriteSociale;
        this.dateDeNaissance = dateDeNaissance;
        this.commentaires = commentaires;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public char getSexe() {
        return sexe;
    }

    public long getNumeroSecuriteSociale() {
        return numeroSecuriteSociale;
    }

    public String getCommentaires() {
        if (this.commentaires != null) {
            return commentaires;
        }else{
            return "[Pas de commentaires]";
        }
    }

    /**
     * Affiche l'instance sous la forme de <br>
     * NOM Prénom<br>
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
        System.out.printf("%s %s%n",this.getNom().toUpperCase(), this.getPrenom());
        System.out.printf("Téléphone : %s%n", this.getNumeroDeTelephone());
        System.out.printf("Sexe %s%n", Character.toString(this.getSexe()));
        System.out.printf("Numéro de Sécurité sociale : %d%n", this.getNumeroSecuriteSociale());
        System.out.printf("Date de naissance : %s%n", this.dateDeNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.printf("Commentaires : %s%n", this.getCommentaires());
        System.out.println("Adresse :");
        this.adresse.afficher();
    }
}
