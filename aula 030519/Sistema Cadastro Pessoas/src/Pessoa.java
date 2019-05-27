public abstract class Pessoa {

    private String nome;
    private Data DataNascimento;

    public void imprimeDados(){
        System.out.println("Nome completo "+ nome);
        System.out.println("Data de Nascimento " +getDataNascimento().getDataFormatada());

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        DataNascimento = dataNascimento;
    }



}
