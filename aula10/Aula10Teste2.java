public class Aula10Teste2 {

    public static void main(String[] args) {

        Pessoa ana = new Pessoa("Ana",20);
        Pessoa bia = new Pessoa("Bia",22);
        Pessoa abreu = new Pessoa("Abreu",22);
        Pessoa joao = new Pessoa("João",27);

        bia.imprime();
        ana.fazAniversario();
        ana.imprime();
        abreu.fazAniversario();
        abreu.fazAniversario();
        abreu.imprime();
        joao.imprime();

    }
}
