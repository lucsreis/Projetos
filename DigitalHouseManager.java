import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DigitalHouseManager {


    List<Aluno> listaAlunos = new ArrayList<>();

    List<Professor> listaProfessor = new ArrayList<>();

    List<Curso> listaCurso = new ArrayList<>();

    List<Matricula> listaMatricula = new ArrayList<>();


    public void registrarCurso (String nomeCurso, String codigoCurso, Integer quantidadeDeAlunos ){
        Curso curso = new Curso(nomeCurso,codigoCurso,quantidadeDeAlunos);
        curso.setNomeCurso(nomeCurso);
        curso.setCodigoCurso(codigoCurso);
        curso.setQuantidadeDeAlunos(quantidadeDeAlunos);

    }

    public void excluirCurso (Integer codigoDoCurso){

    listaCurso.remove(codigoDoCurso);

    }

    public void registrarProfessorAdjunto (String nomeProf, String sobrenomeProf, Integer codigoProf, Integer qtHorasMonitoria ){
        Professor professorAdjunto = new Professor();
        professorAdjunto.setNomeProf(nomeProf);
        professorAdjunto.setSobrenomeProf(sobrenomeProf);
        professorAdjunto.setCodigoProf(codigoProf);
        professorAdjunto.setTempoDeCasa(0);



    }



    public void registrarProfessorTitular(String nomeProf, String
        sobrenomeProf, Integer codigoProf, String especialidade){
        Professor professorTitular = new Professor();
        professorTitular.setNomeProf(nomeProf);
        professorTitular.setSobrenomeProf(sobrenomeProf);
        professorTitular.setCodigoProf(codigoProf);
        professorTitular.setTempoDeCasa(0);



    }

    public void excluirProfessor(Integer codigoProf){

        listaProfessor.remove(codigoProf);

    }

    public void registrarAluno(String nome, String sobrenome,Integer codigo){
        Aluno aluno = new Aluno(nome, sobrenome, codigo);
        aluno.setNome(nome);
        aluno.setSobrenome(sobrenome);
        aluno.setCodigo(codigo);

    }

    public void matricularAluno(String nome, String codigoCurso , Date dataDeMatricula)
    {
        Matricula matricula = new Matricula(matricularAluno()
        matricula.setAluno(nome);
        matricula.setCurso(codigoCurso);
        matricula.setDataDeMatricula(dataDeMatricula);

    }




}
