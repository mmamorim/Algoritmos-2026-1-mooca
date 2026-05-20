import java.util.Scanner;

public class Pessoa {
    public int codigo;
    public String nome;
    public int idade;
    public String email;    

    public Pessoa() {

    }
    
    public Pessoa(int codigo, String nome, int idade, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public void imprime() {
        System.out.print("Código: "+codigo+" ");
        System.out.print("Nome: "+nome+" ");
        System.out.print("Idade: "+idade+" ");
        System.out.println("Email: "+email);
    }

    public void lerCodigo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite código:");
        codigo = sc.nextInt();
    }
    
    public void lerDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite nome:");
        nome = sc.nextLine();
        System.out.println("Digite idade:");
        idade = Integer.parseInt(sc.nextLine());
        System.out.println("Digite email:");
        email = sc.nextLine();
    }

}
