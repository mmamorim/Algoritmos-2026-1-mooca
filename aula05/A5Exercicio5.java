import java.util.Scanner;

public class A5Exercicio5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma senha:");
        String senha = leitor.nextLine();
        int qtdeNumeros = 0;
        String maiusculas = "ABCDEFGHIJKLMNOPQRSTUVWYXZ";
        int qtdeMaiusculas = 0;
        String numeros = "0123456789";

        for (int i = 0; i < senha.length(); i++) {
            char letra = senha.charAt(i);
            if (numeros.contains("" + letra)) {
                qtdeNumeros++;
            }
            if (maiusculas.contains("" + letra)) {
                qtdeMaiusculas++;
            }
        }
        System.out.println("qtdeNumeros: " + qtdeNumeros);
        System.out.println("qtdeMaiusculas: " + qtdeMaiusculas);
        if (senha.length() < 8) {
            System.out.println("SENHA INVÁLIDA: Menos que 8 caracteres!");
        } else {
            if (qtdeNumeros < 1) {
                System.out.println("SENHA INVÁLIDA: Menos que 1 número!");
            } else {
                if (qtdeMaiusculas < 1) {
                    System.out.println("SENHA INVÁLIDA: Menos que 1 maiuscula!");
                } else {
                    System.out.println("SENHA OK!");
                }
            }
        }
    }
}
