import java.util.Scanner;

public class A5Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String texto;

        System.out.println("Digite um texto:");
        texto = leitor.nextLine();
        System.out.println("Você digitou: "+texto);
        int qtdeLetras = texto.length();
        System.out.println("O texto tem: "+qtdeLetras+" letras");
        System.out.println("A primeira letra é: "+texto.charAt(0));
        System.out.println("A última letra é: "+texto.charAt(qtdeLetras-1));
        System.out.println("Texto Maiusculo: "+texto.toUpperCase());
        System.out.println("Texto Minusculo: "+texto.toLowerCase());

    }
}
