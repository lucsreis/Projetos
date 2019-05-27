import java.util.Objects;
import java.util.Scanner;

public class ClubeFutebol {

    private String nome;
    private String cidade;
    private  int quantidadeTorcedores;


    @Override
    public String toString(){
         return "****************" + "\n" +"nome do Clube: " + nome + "\n"+
              "cidade : "+cidade + "\n"+
                 "quantidade de torcedores: " + quantidadeTorcedores ;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClubeFutebol)) return false;
        ClubeFutebol that = (ClubeFutebol) o;
        return getQuantidadeTorcedores() == that.getQuantidadeTorcedores() &&
                getNome().equals(that.getNome()) &&
                getCidade().equals(that.getCidade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCidade(), getQuantidadeTorcedores());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getQuantidadeTorcedores() {
        return quantidadeTorcedores;
    }

    public void setQuantidadeTorcedores(int quantidadeTorcedores) {
        this.quantidadeTorcedores = quantidadeTorcedores;
    }

}
