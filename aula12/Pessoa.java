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
}
