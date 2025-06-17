package Job6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somme = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Entrez un entier: ");
            somme += scanner.nextInt();
        }

        System.out.println("La moyenne est : " + (somme / 5.0));

        scanner.close();
    }
}
