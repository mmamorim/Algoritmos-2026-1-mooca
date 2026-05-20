import java.util.Scanner;

public class ListaPessoas {
    public Pessoa lista[];

    public ListaPessoas() {
        lista = CsvUtil.ler("pessoas.csv", Pessoa.class);
    }

    public void mostraMenu() {
        System.out.println("PESSOAS");
        System.out.println("=======");
        System.out.println("1 - Listar");
        System.out.println("2 - Cadastrar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Alterar");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite opção:");
        int op = sc.nextInt();
        if(op == 1) { 
            listar();
        }
        if(op == 2) { 
            Pessoa p = new Pessoa();
            p.lerCodigo();
            p.lerDados();
            adicionar(p);;
        }
        if(op == 3) { 
            System.out.println("Digite o codigo: ");
            int codigo = sc.nextInt();
            excluir(codigo);
        }
        if(op == 4) { 
            System.out.println("Digite o codigo: ");
            int codigo = sc.nextInt();
            int posItem = buscar(codigo);
            if(posItem >= 0) {
                Pessoa p = lista[posItem];
                p.lerDados();
                alterar(p);
            }
        }
    }

    public void adicionar(Pessoa item) {
        Pessoa listaNova[] = new Pessoa[lista.length + 1];
        for (int i = 0; i < lista.length; i++) {
            listaNova[i] = lista[i];
        }
        listaNova[lista.length] = item;
        CsvUtil.salvar(listaNova, "pessoas.csv");
    }

    public int buscar(int codigo) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].codigo == codigo) {
                return i;
            }
        }
        return -1;
    }

    public void excluir(int codigo) {
        int posItem = buscar(codigo);
        if (posItem == -1) {
            System.out.println("Codigo não encontrado: " + codigo);
        } else {
            Pessoa listaNova[] = new Pessoa[lista.length - 1];
            int pos = 0;
            for (int i = 0; i < lista.length; i++) {
                if (i != posItem) {
                    listaNova[pos] = lista[i];
                    pos++;
                }
            }
            CsvUtil.salvar(listaNova, "pessoas.csv");
            lista = listaNova;
        }
    }

    public void alterar(Pessoa p) {
        int posItem = buscar(p.codigo);
        if(posItem >= 0) {
            excluir(p.codigo);
            adicionar(p);
        }
    }

    public void listar() {
        for (int i = 0; i < lista.length; i++) {
            lista[i].imprime();
        }
    }
}
