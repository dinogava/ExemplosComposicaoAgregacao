public class PessoaMorador {
    String nome;
    int idade;
    String cpf;
    String rg;
    Endereco endereco;

    public PessoaMorador (String nome,int idade,String cpf,String rg,Endereco endereco){
        this.nome=nome;
        this.idade=idade;
        this.cpf=cpf;
        this.rg=rg;
        this.endereco=endereco;
    }
    public PessoaMorador(){

    }
    public void imprime(){
        System.out.println("nome: "+this.nome);
        System.out.println("idade: "+this.idade);
        System.out.println("cpf: "+this.cpf);
        System.out.println("rg: "+this.rg);
        System.out.println("endereço: "+this.endereco);

    }



}
