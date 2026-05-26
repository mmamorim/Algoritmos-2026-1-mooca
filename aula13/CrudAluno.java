import java.util.Scanner;

public class CrudAluno {
    public Aluno lista[];
    public String arquivoDados;

    public CrudAluno() {
        arquivoDados = "alunos.csv";
        lista = CsvUtil.ler(arquivoDados, Aluno.class);
    }

    public void mostraMenu() {
        System.out.println("CADASTRO DE ALUNOS");
        System.out.println("==================");
        System.out.println("1 - Listar");
        System.out.println("2 - Cadastrar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Alterar");
        System.out.println("5 - Voltar");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite opção:");
        int op = sc.nextInt();
        if(op == 1) { 
            listar();
        }
        if(op == 2) { 
            Aluno a = new Aluno();
            a.lerCodigo();
            a.lerDados();
            adicionar(a);;
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
                Aluno a = lista[posItem];
                a.lerDados();
                alterar(a);
            }
        }
    }

    public void adicionar(Aluno item) {
        Aluno listaNova[] = new Aluno[lista.length + 1];
        for (int i = 0; i < lista.length; i++) {
            listaNova[i] = lista[i];
        }
        listaNova[lista.length] = item;
        CsvUtil.salvar(listaNova, arquivoDados);
        lista = listaNova;
        item.imprime();
        System.out.println("Cadastro com sucesso!");
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
            Aluno listaNova[] = new Aluno[lista.length - 1];
            int pos = 0;
            for (int i = 0; i < lista.length; i++) {
                if (i != posItem) {
                    listaNova[pos] = lista[i];
                    pos++;
                }
            }
            CsvUtil.salvar(listaNova, arquivoDados);
            lista = listaNova;
        }
    }

    public void alterar(Aluno elem) {
        int posItem = buscar(elem.codigo);
        if(posItem >= 0) {
            excluir(elem.codigo);
            adicionar(elem);
        }
    }

    public void listar() {
        for (int i = 0; i < lista.length; i++) {
            lista[i].imprime();
        }
    }
}
