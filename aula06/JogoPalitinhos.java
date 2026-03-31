import java.util.Scanner;

public class JogoPalitinhos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("+---------------------+");
        System.out.println("| JOGO DOS PALITINHOS |");
        System.out.println("+---------------------+");


        int qtdePJ = 3;
        int qtdePC = 3;
        int qtdePJEscode = 0;
        int qtdePCEscode = 0;
        int qtdePalpiteJogador = 0;
        int qtdePalpiteComputador = 0;

        System.out.println("Quantos palitos você vai separar?");
        qtdePJEscode = leitor.nextInt();
        System.out.println("Qual seu palpite?");
        qtdePalpiteJogador = leitor.nextInt();

        System.out.println("Qtde escodida JOGADOR: "+qtdePJEscode);
        System.out.println("Palpite JOGADOR: "+qtdePalpiteJogador);
    }
}
