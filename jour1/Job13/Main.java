package Job13;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un entier positif inférieur ou égal à 9 : ");
        int n = scanner.nextInt();

        if (n <= 9 && n >= 0) {
            System.out.println("Table de multiplication de " + n + " : ");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }else {
            System.out.println("Erreur : veuillez entrer un entier inférieur ou égal à 9");
        }
        scanner.close();
    }
}
