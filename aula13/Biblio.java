import java.util.Scanner;

public class Biblio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 1;
        while (op > 0) {
            mostraMenu();
            System.out.print("Pressione [ENTER] para continuar...");
            // O programa fica travado aqui até o ENTER ser acionado
            sc.nextLine();
        }

    }

    public static void mostraMenu() {
        Scanner sc = new Scanner(System.in);

        Screen.clear();
        System.out.println("==================");
        System.out.println("SISTEMA BIBLIOTECA");
        System.out.println("==================");
        System.out.println("1 - Cadastro de Alunos");
        System.out.println("2 - Cadastro de Livros");
        System.out.println("3 - Emprestimo");
        System.out.println("4 - Devolução");
        System.out.println("5 - Sair");

        int op = sc.nextInt();
        if (op == 1) {
            CrudAluno alunos = new CrudAluno();
            alunos.mostraMenu();
        }
        if (op == 5) {
            System.out.println("Até mais!");
            System.exit(0);
        }

    }
}
