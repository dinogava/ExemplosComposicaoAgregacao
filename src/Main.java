public class Main {
    public static void main(String[] args) {

       Endereco end = new Endereco("888643540","henriquelage",540,"centro","criciuma","sc","Brasil");
        System.out.println("---endereço---");
       end.imprime();

       PessoaMorador people = new PessoaMorador("joaozinho",24,"056788932-98","5129095",end);
        System.out.println("---morador---");
       people.imprime();

    }
}