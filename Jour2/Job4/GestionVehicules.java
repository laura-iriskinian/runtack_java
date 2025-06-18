package Jour2.Job4;

public class GestionVehicules {

    public static void main(String[] args) {
        testVoiture();
        testAvion();
    }

    public static void testVoiture() {
        Voiture voiture = new Voiture("Peugeot", 2022, 150000);
        voiture.cylindree = 12;
        voiture.nombrePortes = 5;
        voiture.puissance = 90;
        voiture.kilometrage = 150000;

        voiture.affiche();
    }

    public static void testAvion() {
        Avion avion = new Avion("Boeing", 2010, 5300000);
        avion.moteur = "HELICES";
        avion.heuresVol = 5670;

        avion.affiche();
    }

    static class Vehicule {
        public String marque;
        public int dateAchat;
        public double prixAchat;
        public double prixCourant;

        //Constructeur
        public Vehicule(String marque, int dateAchat, double prixAchat) {
            this.marque = marque;
            this.dateAchat = dateAchat;
            this.prixAchat = prixAchat;
        }

        public void affiche() {
            System.out.println("Nouveau Vehicule : ");
            System.out.println("Marque : " + this.marque);
            System.out.println("Date Achat : " + this.dateAchat);
            System.out.println("Prix Achat : " + this.prixAchat + "€");
            System.out.println("Prix Courant : " + this.prixCourant + "€");
        }

        public void calculPrix(int anneeActuelle) {
            int age = anneeActuelle - this.dateAchat;
            this.prixCourant -= prixAchat * 0.01 * age;
            //this.prixCourant = Math.max(0, (float)(prixAchat - reduction));
        }
    }

    static class Voiture extends Vehicule {
        public int cylindree;
        public int nombrePortes;
        public double puissance;
        public double kilometrage;

        public Voiture(String marque, int dateAchat, double prixAchat) {
            super(marque, dateAchat, prixAchat);
            this.cylindree = 0;
            this.nombrePortes = 0;
            this.puissance = 0;
            this.kilometrage = 0;
        }

        @Override
        public void affiche() {
            super.affiche();
            System.out.println("Cylindree : " + this.cylindree);
            System.out.println("Nombre Portes : " + this.nombrePortes);
            System.out.println("Puissance : " + this.puissance + " chevaux");
            System.out.println("Kilometrage : " + this.kilometrage + "km");
        }

        @Override
        public void calculPrix(int anneeActuelle) {
            int age = anneeActuelle - this.dateAchat;

            double prix = prixAchat;
            prix -= prixAchat * 0.02 * age;

            int tranchesKm = (int) Math.round(this.kilometrage / 10000.0);
            prix -= prixAchat * 0.05 * tranchesKm;

            if (marque.equalsIgnoreCase("Renault") || marque.equalsIgnoreCase("Fiat")) {
                prix -= prixAchat * 0.10;
            } else if (marque.equalsIgnoreCase("Ferrari") || marque.equalsIgnoreCase("Porsche")) {
                prix += prixAchat * 0.20;
            }

            this.prixCourant = Math.max(0, (float) prix);
        }
    }

    static class Avion extends Vehicule {
        public String moteur;
        public int heuresVol;

        public Avion(String marque, int dateAchat, double prixAchat) {
            super(marque, dateAchat, prixAchat);
            this.moteur = "";
            this.heuresVol = 0;
        }

        @Override
        public void affiche() {
            super.affiche();
            System.out.println("Moteur : " + this.moteur);
            System.out.println("Heures Vol : " + this.heuresVol);
        }

        //@Override
        public void calculePrix(int anneeActuelle) {
            double prix = prixAchat;

            if (moteur.equalsIgnoreCase("HELICES")) {
                int tranches = (int)(heuresVol / 100);
                prix -= prixAchat * 0.10 * tranches;
            } else {
                int tranches = (int)(heuresVol / 1000);
                prix -= prixAchat * 0.10 * tranches;
            }

            this.prixCourant = Math.max(0, (float) prix);
        }

    }

}
