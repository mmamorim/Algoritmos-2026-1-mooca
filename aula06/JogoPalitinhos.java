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
        int rodada = 0;

        while (qtdePJ > 0 && qtdePC > 0) {
            rodada++;
            System.out.println("***************");            
            System.out.println("RODADA "+rodada);            
            System.out.println("***************");            
            System.out.println("Qtde TOTAL PALITOS JOGADOR: " + qtdePJ);
            System.out.println("Qtde TOTAL PALITOS COMPUTADOR: " + qtdePC);

            System.out.println("Quantos palitos você vai separar?");
            qtdePJEscode = leitor.nextInt();
            System.out.println("Qual seu palpite?");
            qtdePalpiteJogador = leitor.nextInt();

            System.out.println("Qtde escodida JOGADOR: " + qtdePJEscode);
            System.out.println("Palpite JOGADOR: " + qtdePalpiteJogador);

            qtdePCEscode = (int) (Math.random() * 10) % (qtdePC + 1);
            System.out.println("Qtde escodida COMPUTADOR: " + qtdePCEscode);
            qtdePalpiteComputador = qtdePCEscode + ((int) (Math.random() * 10) % (qtdePJ + 1));
            System.out.println("Palpite COMPUTADOR: " + qtdePalpiteComputador);

            if (qtdePalpiteJogador == qtdePJEscode + qtdePCEscode) {
                System.out.println("Você acertou!!!!");
                qtdePJ--;
            } else {
                if (qtdePalpiteComputador == qtdePJEscode + qtdePCEscode) {
                    System.out.println("COMPUTADOR acertou!!!!");
                    qtdePC--;
                } else {
                    System.out.println("NINGUÉM acertou!!!!");
                }
            }
        }

        System.out.println("GAME OVER");
        if(qtdePJ == 0) {
            System.out.println("❤️❤️ JOGADOR VENCEU!!!! ❤️❤️");
        } else {
            System.out.println("COMPUTADOR VENCEU!!!!");
        }

    }
}
