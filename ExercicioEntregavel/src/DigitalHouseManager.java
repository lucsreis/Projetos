import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DigitalHouseManager {


    private List<Aluno> listaAlunos = new ArrayList<>();

    private List<Professor> listaProfessor = new ArrayList<>();

    private List<Curso> listaCurso = new ArrayList<>();

    private List<Matricula> listaMatricula = new ArrayList<>();


    public void registrarCurso(String nomeCurso, String codigoCurso, Integer quantidadeMaxDeAlunos) {
        Curso curso = new Curso(nomeCurso, codigoCurso, quantidadeMaxDeAlunos);
        listaCurso.add(curso);

    }

    public void excluirCurso(Integer codigoDoCurso) {

        listaCurso.remove(codigoDoCurso);

    }

    public void registrarProfessorAdjunto(String nomeProf, String sobrenomeProf, Integer codigoProf, Integer qtHorasMonitoria) {
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto();
        professorAdjunto.setNomeProf(nomeProf);
        professorAdjunto.setSobrenomeProf(sobrenomeProf);
        professorAdjunto.setCodigoProf(codigoProf);
        professorAdjunto.setTempoDeCasa(0);
        professorAdjunto.setQtHorasMonitoria(qtHorasMonitoria);

        listaProfessor.add(professorAdjunto);


    }


    public void registrarProfessorTitular(String nomeProf, String
            sobrenomeProf, Integer codigoProf, String especialidade) {
        ProfessorTitular professorTitular = new ProfessorTitular();
        professorTitular.setNomeProf(nomeProf);
        professorTitular.setSobrenomeProf(sobrenomeProf);
        professorTitular.setCodigoProf(codigoProf);
        professorTitular.setTempoDeCasa(0);
        professorTitular.setEspecialidade(especialidade);

        listaProfessor.add(professorTitular);


    }

    public void excluirProfessor(Integer codigoProf) {
        listaProfessor.remove(codigoProf);

    }

    public void registrarAluno(String nome, String sobrenome, Integer codigo) {
        Aluno aluno = new Aluno(nome, sobrenome, codigo);
        aluno.setNome(nome);
        aluno.setSobrenome(sobrenome);
        aluno.setCodigo(codigo);
        listaAlunos.add(aluno);

    }


    public void matricularAluno(Integer codigo, String codigoCurso) {
        Curso curso = getCursoPorCodigo(codigoCurso);
        Aluno aluno = getAlunoPorCodigo(codigo);


        if (curso.adicionarUmAluno(aluno)) {
            Matricula matricula = new Matricula(aluno, curso);
            listaMatricula.add(matricula);

            System.out.println("Sua matrícula foi realizada " + aluno.getNome() + " " + aluno.getSobrenome());

        } else {
            System.out.println("Sua matrícula não pode ser realizada pois não há vagas ");
        }


    }

    public Aluno getAlunoPorCodigo(Integer codigo) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getCodigo().equals(codigo)) {
                return aluno;

            }

        }

        return null;


    }

    public Curso getCursoPorCodigo(String codigoCurso) {
        for (Curso curso : listaCurso) {
            if (curso.getCodigoCurso().contains(codigoCurso)) {
                return curso;

            }

        }

        return null;


    }

    public Professor getProfessorPorCodigo(Integer codigoProf) {
        for (Professor professor : listaProfessor) {
            if ((professor.getCodigoProf()) == codigoProf) {
                return professor;
            }
        }
        return null;
    }


    public void alocarProfessores(String codigoCurso, Integer
            codigoProfTitular, Integer codigoProfAdjunto) {

        ProfessorTitular professorTitular = (ProfessorTitular) getProfessorPorCodigo(codigoProfTitular);
        ProfessorAdjunto professorAdjunto = (ProfessorAdjunto) getProfessorPorCodigo(codigoProfAdjunto);
        Curso curso = getCursoPorCodigo(codigoCurso);
        curso.setProfessorTitular(professorTitular);
        curso.setProfessorAdjunto(professorAdjunto);


    }

    public Curso consultarCursoPorCodigo(String codigoCurso) {

        for (int i = 0; i < listaCurso.size(); i++) {
            Curso cursoBuscado = listaCurso.get(i);
            if (cursoBuscado.getCodigoCurso().equals(codigoCurso)) {
                return cursoBuscado;
            } else {
                System.out.println("Curso não encontrado");
            }

        }
    return null;

    }
}


