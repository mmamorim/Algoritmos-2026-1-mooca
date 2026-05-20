import java.util.Scanner;

public class TesteAula12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ListaPessoas lista = new ListaPessoas();

        int op = 1;
        while(op > 0) {
            Screen.clear();
            lista.mostraMenu();
            System.out.println("Deseja sair? 0 - sair");
            op = sc.nextInt();
        }

        //Pessoa p2 = new Pessoa(333, "Bia", 20, "bia@bia.com");
        //p1.imprime();
        //p2.imprime();

        //lista.listar();
        //lista.excluir(54);
        //lista.listar();

        //Pessoa p1 = new Pessoa();
        
        //p1.lerCodigo();
        //p1.lerDados();
        //p1.imprime();

        //lista.alterar(p1);
        //lista.adicionar(p1);
    }
}
