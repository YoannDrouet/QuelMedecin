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

    public Adresse(String infosComplémentaires, int numero, String complement, String voie, int codePostal, String ville) {
        this.infosComplémentaires = infosComplémentaires;
        this.numero = numero;
        this.complement = complement;
        this.voie = voie;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public Adresse(int numero, String complement, String voie, int codePostal, String ville) {
        this.infosComplémentaires = null;
        this.numero = numero;
        this.complement = complement;
        this.voie = voie;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public String getInfosComplémentaires() {
        return infosComplémentaires;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplement() {
        return complement;
    }

    public String getVoie() {
        return voie;
    }

    public String getCodePostal() {
        String codePostal = String.valueOf(this.codePostal);
        while (codePostal.length()<5){
            codePostal = "0"+codePostal;
        }
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    /**
     * Affiche l'instance sous la forme de <br>
     * Infomartions complémentaire (s'il y en a)<br>
     * Numéro Complément<br>
     * Nom de voie<br>
     * Code postal Ville<br>
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
