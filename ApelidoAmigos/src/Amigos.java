public class Amigos {

    public String nome;
    public String apelido;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void imprimirDetalhes(){

        System.out.println( "Nome " + nome);
        System.out.println(" Apelidos " + apelido);

    }



}
