import java.util.Scanner;

public class A5Exercicio2 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um texto:");
        String texto = leitor.nextLine();
        System.out.println("Você digitou: "+texto);
        texto = texto.toLowerCase();
        System.out.println("Como ficou: "+texto);
        int qtdeVogais = 0;
        String letrasVogais = "aáàaãaâeéèiou";

        for(int i=0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if(letrasVogais.contains(""+letra)) {
                qtdeVogais++;
            }
            // if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            //     qtdeVogais++;
            // }
        }
        System.out.println("Qtde vogais: "+qtdeVogais);
    }
}
