import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double peso = 0, altura = 0, imc = 0;

        System.out.println("Digite seu peso:");
        peso = leitor.nextDouble();
        System.out.println("Digite sua altura:");
        altura = leitor.nextDouble();

        imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("MAGRO");
        } else {
            if (imc <= 25) {
                System.out.println("NORMAL");
            } else {
                if (imc <= 30) {
                    System.out.println("SOBREPESO");
                } else {
                    System.out.println("OBESO");
                }
            }
        }
        System.out.println("IMC é: R$" + imc);

    }
}
