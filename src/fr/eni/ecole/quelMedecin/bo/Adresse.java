package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe Adresse
 * <ul>
 *     <li><b>infosComplémentaires :</b> infos complémentaires à l'adresse</li>
 *     <li><b>numero :</b> le numero de la voie</li>
 *     <li><b>complement :</b> complement au numéro (bis, ter,...)</li>
 *     <li><b>codePostale :</b> le code postal de la ville</li>
 *     <li><b>ville :</b> la ville correspondant à l'adresse</li>
 * </ul>
 * @author Yoann Drouet
 */
public class Adresse {
    private String infosComplémentaires;
    private int numero;
    private String complement;
    private String voie;
    private int codePostal;
    private String ville;

    /**
     * Premier constructeur de la classe Adresse
     * @param infosComplémentaires
     * @param numero
     * @param complement
     * @param voie
     * @param codePostal
     * @param ville
     */
    public Adresse(String infosComplémentaires, int numero, String complement, String voie, int codePostal, String ville) {
        this.infosComplémentaires = infosComplémentaires;
        this.numero = numero;
        this.complement = complement;
        this.voie = voie;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    /**
     * Second constructeur de la classe Adresse, ne prend pas d'information complémentaire
     * @param numero
     * @param complement
     * @param voie
     * @param codePostal
     * @param ville
     */
    public Adresse(int numero, String complement, String voie, int codePostal, String ville) {
        this.infosComplémentaires = null;
        this.numero = numero;
        this.complement = complement;
        this.voie = voie;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    /**
     *
     * @return Les informations complémentaires de l'adresse
     */
    public String getInfosComplémentaires() {
        return infosComplémentaires;
    }

    /**
     *
     * @return Le numero de vois
     */
    public int getNumero() {
        return numero;
    }

    /**
     *
     * @return Le complement au numero
     */
    public String getComplement() {
        return complement;
    }

    /**
     *
     * @return La voie ainsi que son nom
     */
    public String getVoie() {
        return voie;
    }

    /**
     *
     * @return Un code postale à 5 chiffres sous forme de String
     */
    public String getCodePostal() {
        String codePostal = String.valueOf(this.codePostal);
        while (codePostal.length()<5){
            codePostal = "0"+codePostal;
        }
        return codePostal;
    }

    /**
     *
     * @return La ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * Affiche les caractéristiques d'une instance d'Adresse
     */
    public void afficher(){
        if (infosComplémentaires != null){
            System.out.printf("%s%n", this.getInfosComplémentaires());
        }
        System.out.printf("%d", this.getNumero());
        if (complement != null){
            System.out.printf("%s", this.getComplement());
        }
        System.out.printf(" %s%n", this.getVoie());
        System.out.printf("%s %s%n", this.getCodePostal(), this.getVille());
    }
}
