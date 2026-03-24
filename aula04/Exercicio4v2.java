import java.util.Scanner;

public class Exercicio4v2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Digite N1:");
        n1 = leitor.nextInt();
        System.out.println("Digite N2:");
        n2 = leitor.nextInt();
        System.out.println("Digite N3:");
        n3 = leitor.nextInt();

        System.out.println("Valores n1: " + n1 + " n2: " + n2 + " n3: " + n3);

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("Maior: " + n1);
        } else {
            if (n2 > n3) {
                System.out.println("Maior: " + n2);
            } else {
                System.out.println("Maior: " + n3);
            }
        }

    }
}
