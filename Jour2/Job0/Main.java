package Jour2.Job0;

public class Main {
    public static void main(String[] args) {
        Personne p = new Personne(
                "Dupont", "Marie",
                "10/01/1995", "Paris",
                "123 rue des Lilas", "0612345678"
        );

        //Accès direct aux attributs publics
        System.out.println("Nom public : " + p.nom);
        System.out.println("Prénom public : " + p.prenom);

        //accès aux attributs privés via getters
        System.out.println("Adresse privée : " + p.getAdresse());

        System.out.println("\n--- Informations complètes ---");
        p.afficherInfos();
    }
}
