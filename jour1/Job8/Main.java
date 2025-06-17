package Job8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre entier positif n : " );
        int n = scanner.nextInt();

        int somme = 0;

        for (int i = 1; i <= n; i++) {
            somme += i * i * i;
        }

        System.out.println("La somme des " + n + "premiers cubes est : " + somme);

        scanner.close();
    }
}
