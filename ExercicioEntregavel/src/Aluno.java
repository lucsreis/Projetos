import java.util.Objects;

public class Aluno {

private String nome;
private String sobrenome;
private Integer codigo;

    public Aluno(String nome, String sobrenome, Integer codigo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return getCodigo().equals(aluno.getCodigo());
    }

    @Override
    public int hashCode() {
        return Objects.hash( getCodigo());
    }
}
