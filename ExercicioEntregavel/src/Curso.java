import java.util.ArrayList;
import java.util.List;

public class Curso extends DigitalHouseManager {

    private String nomeCurso;
    private String codigoCurso;
    private Integer quantidadeMaxDeAlunos;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;

    private List<Aluno> listaAlunos = new ArrayList<>();





    public boolean adicionarUmAluno (Aluno umAluno) {
        if (listaAlunos.size() < quantidadeMaxDeAlunos){
            listaAlunos.add(umAluno);
            return true;
        } else {
            return false;
        }


    }


    public void excluirUmAluno (Aluno umAluno){
        this.listaAlunos.remove(umAluno);

    }

    public Integer getQuantidadeMaxDeAlunos() {
        return quantidadeMaxDeAlunos;
    }

    public void setQuantidadeMaxDeAlunos(Integer quantidadeMaxDeAlunos) {
        this.quantidadeMaxDeAlunos = quantidadeMaxDeAlunos;
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

    public Curso(String nomeCurso, String codigoCurso, Integer quantidadeMaxDeAlunos) {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.quantidadeMaxDeAlunos = quantidadeMaxDeAlunos;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }
}
