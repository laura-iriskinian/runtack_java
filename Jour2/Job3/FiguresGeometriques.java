package Jour2.Job3;

public class FiguresGeometriques {

    static class Figure {
        private double x;
        private double y;

        public Figure(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void affiche() {
            System.out.println(x + y);
        }
    }

    static class Rectangle extends Figure{
        private double largeur;
        private double longueur;

        //Constructeur
        public Rectangle(double x, double y) {
            super(0, 0);
            this.largeur = 0;
            this.longueur = 0;
        }

        //Getters
        public double getLargeur() {
            return largeur;
        }

        public double getLongueur() {
            return longueur;
        }

        //Setters
        public void setLargeur(double largeur) {
            this.largeur = largeur;
        }

        public void setLongueur(double longueur) {
            this.longueur = longueur;
        }

        public void affiche() {
            super.affiche();
            System.out.println("Largeur : " + largeur + ", Longueur : " + longueur);
        }
    }

    static class TestRectangle {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(0, 0);

            rectangle.setLargeur(10);
            rectangle.setLongueur(20);

            System.out.println("rectangle = " + rectangle.getLargeur() + " " + rectangle.getLongueur());
        }
    }

    static class Cercle extends Figure {
        private double X;
        private double Y;
        private double rayon;

        public Cercle(double x, double y) {
            super(0, 0);
            this.rayon = 0;
        }

        //Getters
        public double getX() {
            return X;
        }

        public double getY() {
            return Y;
        }

        public double getRayon() {
            return rayon;
        }

        //Setters
        public void setX(double x) {
            this.X = x;
        }

        public void setY(double y) {
            this.Y = y;
        }

        public void setRayon(double rayon) {
            this.rayon = rayon;
        }

        public double surface() {
            return Math.PI * rayon * rayon;
        }

        //Vérifier si point dans cercle
        public boolean contientPoint(double px, double py) {
            double distance = Math.sqrt(Math.pow(px - this.X, 2) + Math.pow(py - this.Y, 2));
            return distance <= rayon;
            //Math.pow met au carré
            //Math.sqrt prend la racine carrée
        }

        public void affiche() {
            super.affiche();
            System.out.println("Rayon : " + rayon);
            System.out.println("Surface : " + surface());

        }

        static class TestCercle {
            public static void main(String[] args) {
                Cercle cercle = new Cercle(0, 0);

                cercle.setX(0);
                cercle.setY(0);
                cercle.setRayon(5);

                System.out.println("cercle = " + cercle.surface());

                boolean dedans = cercle.contientPoint(3, 4); //3 = px, 4 = py
                System.out.println("dedans = " + dedans);
            }
        }

        static class RectangleColore extends Rectangle {
            private int couleur;

            public RectangleColore(double largeur, double longueur, int couleur) {
                super(0, 0); //appelle le constructeur vide de Rectangle
                setLargeur(largeur);
                setLongueur(longueur);
                this.couleur = couleur;
            }

            public int getCouleur() {
                return couleur;
            }

            public void setCouleur(int couleur) {
                this.couleur = couleur;
            }

            public void afficher() {
                System.out.println("Largeur : " + getLargeur());
                System.out.println("Longueur : " + getLongueur());
                System.out.println("Couleur : " + couleur);
            }

        }
    }

}