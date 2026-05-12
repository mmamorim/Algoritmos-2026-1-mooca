public class ProgAula11 {
    public static void main(String[] args) {
        Screen.clear();

        Pessoa listaPessoas[] = {
            new Pessoa("Ana",19,"ana@ana.com"),
            new Pessoa("Bia",21,"bia@bia.com"),
            new Pessoa("João",21,"joao@joao.com"),
            new Pessoa("Abreu",24,"abre@abreu.com")
        };

        for(int i=0; i < listaPessoas.length; i++) {
            listaPessoas[i].imprime();
        }
    }
}
