import java.util.Objects;

public class Pessoa {

    private String nome;
    private Integer rg;




    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getRg());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return getRg().equals(pessoa.getRg());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }
}
