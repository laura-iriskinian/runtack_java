package Job14;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier positif : ");
        int n = scanner.nextInt();

        int nInv = 0;
        int original = n;

        while (n != 0) {
            int chiffre = n % 10;
            nInv = nInv * 10 + chiffre;
            n /= 10;
        }

        System.out.println("Le nombre inversé de " + original + " est : " + nInv);

        scanner.close();
    }
}
