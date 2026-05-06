public class Pessoa {
    public String nome;
    public int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime() {
        System.out.println("NOME: "+nome+" IDADE: "+idade);
    }

    public void fazAniversario() {
        idade++;
    }
}
