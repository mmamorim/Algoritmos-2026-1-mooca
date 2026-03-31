import java.util.Scanner;

public class A5Exercicio3 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um texto:");
        String texto = leitor.nextLine();
        String invertido = "";
        for(int i=0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            invertido = letra + invertido;
        }
        System.out.println("Texto Invertido: "+invertido);
    }
}
