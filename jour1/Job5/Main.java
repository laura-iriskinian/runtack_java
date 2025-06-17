package Job5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner askNum = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int a = askNum.nextInt();
        System.out.print("Entrez un deuxième nombre : ");
        int b = askNum.nextInt();
        System.out.print("Entrez un troisième nombre : ");
        int c = askNum.nextInt();

        int max1, max2;

        if (a >= b && a >= c) {
            max1 = a;
            max2 = Math.max(b, c);
        } else if (b >= a && b >= c) {
            max1 = b;
            max2 = Math.max(a, c);
        } else {
            max1 = c;
            max2 = Math.max(a, b);
        }

        System.out.println("Les deux plus grands nombres sont : " + max1 + "et" + max2);

        askNum.close();
    }
}
