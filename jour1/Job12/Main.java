package Job12;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Entrez un nombre entier positif : ");
        int n =  scanner.nextInt();

        for (int i = 0; i<= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
