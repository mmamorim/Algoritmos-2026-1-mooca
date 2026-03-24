import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero, unid, dez, cent;

        System.out.println("Digite um número de 3 digitos: ");
        numero = leitor.nextInt();

        System.out.println("Valor do número digitado: "+numero);
        
        unid = numero % 10;
        System.out.println("UNIDADE: "+unid);
        dez = (numero / 10) % 10;
        System.out.println("DEZENA: "+dez);
        cent = numero / 100;
        System.out.println("CENTENA: "+cent);

    }
}
