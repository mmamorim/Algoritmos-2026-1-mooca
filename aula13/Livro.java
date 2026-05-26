import java.util.Scanner;

public class Livro {
    public int codigo;
    public String titulo;
    public String autor;    
    public int ano;    

    public Livro() {

    }
    
    public Livro(int codigo, String titulo, String autor, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void imprime() {
        System.out.print("Código: "+codigo+" ");
        System.out.print("Título: "+titulo+" ");
        System.out.print("Autor: "+autor);
        System.out.println("Ano: "+ano);
    }

    public void lerCodigo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite código:");
        codigo = sc.nextInt();
    }
    
    public void lerDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite titulo:");
        titulo = sc.nextLine();
        System.out.println("Digite autor:");
        autor = sc.nextLine();
        System.out.println("Digite ano:");
        ano = Integer.parseInt(sc.nextLine());
    }

}
