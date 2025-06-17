package Job10;

public class Main {
    public static void main(String[] args) {
        int n = 8;
        long factorielle = 1;

        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }

        System.out.println("La factorielle de " + n + "est : " + factorielle);
    }
}
