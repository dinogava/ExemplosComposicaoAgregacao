public class Endereco {

    String cep;
    String rua;
    int numero;
    String bairro;
    String cidade;
    String uf;
    String pais;

    public Endereco(String cep,String rua,int numero,String bairro,String cidade,String uf,String pais) {
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.pais = pais;
    }
    public Endereco(){

    }
    public void imprime(){
            System.out.println("cep: "+this.cep);
            System.out.println("rua: "+this.rua);
            System.out.println("bairro: "+this.bairro);
            System.out.println("cidade: "+this.cidade);
            System.out.println("unidade federativa: "+this.uf);
            System.out.println("país: "+this.pais);

        }




}
