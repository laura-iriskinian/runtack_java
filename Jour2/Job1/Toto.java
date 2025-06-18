//package Jour2.Job1;
//
//public class Toto {
//    int toto = 0;
//    Toto() {
//        toto = toto +1;
//    }
//    public static void main(String[] tutu) {
//        Toto t1 = new Toto();
//        Toto t2 = new Toto();
//        System.out.println("Toto : " + toto);
//    }
//}
//
////Erreur = java: non-static variable toto cannot be referenced from a static context
////ligne 11 essaye d'accéder directement à toto qui est une variable
//// d'instance (non-static) sans préciser à quel objet elle appartient
//
//
////Correction
//public class Toto {
//    int toto = 0;
//
//    Toto() {
//        toto = toto + 1;
//    }
//
//    public static void main(String[] tutu) {
//        Toto t1 = new Toto();
//        Toto t2 = new Toto();
//
//        // Afficher la valeur de 'toto' à partir d'un objet
//        System.out.println("Toto t1 : " + t1.toto);
//        System.out.println("Toto t2 : " + t2.toto);
//    }
//}
