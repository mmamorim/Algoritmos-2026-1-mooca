import java.util.Scanner;

public class A5Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um texto:");
        String texto = leitor.nextLine();
        System.out.println("O texto digitado é: " + texto);
        int qtdeLetras = texto.length();
        System.out.println("Qtde de letras: " + qtdeLetras);
        System.out.println("Primeira Letra: " + texto.charAt(0));
        System.out.println("Última Letra: " + texto.charAt(qtdeLetras-1));
        System.out.println("Texto em Maiúsculo: " + texto.toUpperCase());
        System.out.println("Texto em Maiúsculo: " + texto.toLowerCase());

    }
}
