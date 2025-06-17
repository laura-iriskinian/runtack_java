package Job4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner askNum = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int num1 = askNum.nextInt();

        System.out.print("Entrez un deuxième nombre : ");
        int num2 = askNum.nextInt();

        System.out.println(num1 * num2);

        askNum.close();
    }
}
