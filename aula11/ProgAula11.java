import java.util.Scanner;

public class ProgAula11 {
    public static Pessoa[] listaPessoas;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Screen.clear();
        listaPessoas = CsvUtil.ler("pessoas.csv", Pessoa.class);
    
        System.out.println("PESSOAS");

        System.out.println("[1] - Listar");
        System.out.println("[2] - Cadastrar");
        System.out.println("Digite Opção: ");
        int op = sc.nextInt();

        if(op == 1) {
            listar();
        }
        if(op == 2) {
            cadastrar();
        }

    }

    public static void cadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite idade: ");
        int idade = Integer.parseInt(sc.nextLine());
        System.out.println("Digite email: ");
        String email = sc.nextLine();

        Pessoa p = new Pessoa(nome,idade,email);
        
        Pessoa listaNova[] = new Pessoa[listaPessoas.length+1];
        for (int i = 0; i < listaPessoas.length; i++) {
            listaNova[i] = listaPessoas[i];
        }
        listaNova[listaPessoas.length] = p;

        CsvUtil.salvar(listaNova, "pessoas.csv");
    }

    public static void listar() {
        for (int i = 0; i < listaPessoas.length; i++) {
            listaPessoas[i].imprime();
        }
    }
}
