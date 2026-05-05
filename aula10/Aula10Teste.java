public class Aula10Teste {

    public static void main(String[] args) {

        Produto p1, p2, p3;
        p1 = new Produto();
        p1.id = 10;
        p1.nome = "Chocolate";

        p2 = new Produto();
        p2.id = 15;
        p2.nome = "Leite";

        System.out.println(p1.id+" "+p1.nome);
        System.out.println(p2.id+" "+p2.nome);


    }
}
