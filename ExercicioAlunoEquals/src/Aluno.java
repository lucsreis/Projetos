import java.util.Objects;

public class Aluno {

    private String nome;
    private Integer numeroDeAluno;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(getNome(), aluno.getNome()) &&
                Objects.equals(getNumeroDeAluno(), aluno.getNumeroDeAluno());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumeroDeAluno());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroDeAluno() {
        return numeroDeAluno;
    }

    public void setNumeroDeAluno(Integer numeroDeAluno) {
        this.numeroDeAluno = numeroDeAluno;
    }


}
