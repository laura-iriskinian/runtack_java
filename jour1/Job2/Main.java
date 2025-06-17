package Job2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner askName = new Scanner(System.in); //Création du scanner

        System.out.print("Entrez votre nom : ");
        String name = askName.nextLine(); //Lecture d'une ligne de texte

        System.out.println("Bonjour, " + name + "!");

        askName.close(); //Fermer le scanner
    }
}
