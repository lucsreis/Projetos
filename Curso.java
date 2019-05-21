import java.util.ArrayList;
import java.util.List;

public class Curso extends DigitalHouseManager {

    private String nomeCurso;
    private String codigoCurso;
    private Integer quantidadeDeAlunos;

    List<Aluno> listaAlunos = new ArrayList<>();






    public boolean adicionarUmAluno (Aluno umAluno) {
        if (listaAlunos.size() <= quantidadeDeAlunos );
        return true;

    }


    public void excluirUmAluno (Aluno umAluno){
        this.listaAlunos.remove(umAluno);

    }

    public Integer getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(Integer quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Curso(String nomeCurso, String codigoCurso, Integer quantidadeDeAlunos) {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }
}
