public class Pessoa {
    public String nome;
    public int idade;
    public String email;    

    public void fazAniversario() {
        idade++;
    }

    public void imprime() {
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Email: "+email);
    }
}
