package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe MedecinGeneraliste
 * <ul>
 *     <li><b>nom :</b> nom du medecin</li>
 *     <li><b>prenom :</b> prenom du medecin</li>
 *     <li><b>numeroDeTelephone :</b> numero de téléphone du medecin</li>
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

    private static int tarif;

    /**
     * Constructeur de la classe MedecinGeneraliste
     * @param nom
     * @param prenom
     * @param numeroDeTelephone
     */
    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
    }

    /**
     *
     * @return Le nom ddu medecin en majuscule
     */
    public String getNom() {
        return nom.toUpperCase();
    }

    /**
     *
     * @return Le numéro de téléphone du medecin
     */
    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    /**
     *
     * @return Le tarif des consultations
     */
    public static int getTarif() {
        return tarif;
    }

    /**
     * Permet de modifier le numéro de téléphone du médecin
     * @param numeroDeTelephone
     */
    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    /**
     * Change le tarif des consultations
     * @param tarif
     */
    public static void setTarif(int tarif) {
        MedecinGeneraliste.tarif = tarif;
    }

    /**
     * Permet d'afficher toutes les caractéristiques d'une instance
     */
    public void afficher(){
        System.out.printf("%s %s%n",this.getNom(), this.prenom);
        System.out.printf("Numéro de téléphone : %s%n", this.getNumeroDeTelephone());
        System.out.printf("Tarif : %d€%n", getTarif());
    }
}
