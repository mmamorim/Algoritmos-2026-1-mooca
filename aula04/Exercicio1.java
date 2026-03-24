import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double salario = 0;

        System.out.println("Digite um salário:");
        salario = leitor.nextDouble();
        System.out.println("Seu salário é: R$"+salario);

        if(salario <= 2000) {
            salario = salario * 1.5;
        }
        if(salario > 2000 && salario <= 5000) {
            salario = salario * 1.2;
        }
        if(salario > 5000) {
            salario = salario * 1.1;
        }

        System.out.println("Novo salário é: R$"+salario);
    }
}
