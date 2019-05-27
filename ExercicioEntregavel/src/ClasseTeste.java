import java.util.Scanner;

public class ClasseTeste {
    public static void main(String[] args) {



        DigitalHouseManager manager = new DigitalHouseManager();

        System.out.println(" ---------------------------------------------------");
        System.out.println(" --- registrando dois cursos --- ");

        manager.registrarCurso("Full Stack", "20001", 3);
        manager.registrarCurso("Android", "20002", 2);

        System.out.println(" ---------------------------------------------------");
        System.out.println(" --- registrando os alunos --- ");

        manager.registrarAluno("Ana","Carolina",100);
        manager.registrarAluno("Mick","Jagger",101);
        manager.registrarAluno("Bono","Vox",102);
        manager.registrarAluno("Maria","Bethania",103);
        manager.registrarAluno("Caetano","Veloso",104);
        manager.registrarAluno("Bob","Marley" ,105);

        System.out.println(" ---------------------------------------------------");
        System.out.println(" --- matriculando os alunos em FullStack e Android --- ");
        System.out.println(" ---------------------------------------------------");

        manager.matricularAluno(100,"20001");
        manager.matricularAluno(101,"20001");
        manager.matricularAluno(102,"20001");
        manager.matricularAluno(103,"20002");
        manager.matricularAluno(104,"20002");
        manager.matricularAluno(105,"20002");

        System.out.println(" ---------------------------------------------------");
        System.out.println(" --- registrando os professores Titular e Adjunto --- ");

        manager.registrarProfessorAdjunto("Paul","Allen",1100,32);
        manager.registrarProfessorAdjunto("Bill","Gates",1000,40);
        manager.registrarProfessorTitular("Steve","Jobs",2000,"Android");
        manager.registrarProfessorTitular("Steva","Wozniak",2100,"Full Stack");


        System.out.println(" ---------------------------------------------------");
        System.out.println(" --- alocando professores Titulares e Adjuntos aos cursos --- ");

        manager.alocarProfessores("20001",2000,1100);
        manager.alocarProfessores("20002",2100,1000);
        System.out.println(" ---------------------------------------------------");
        System.out.println(" --- consultando aluno por código ---");

        System.out.println(" ---------------------------------------------------");
        Aluno aluno = manager.getAlunoPorCodigo(102);
        System.out.println(" O nome do aluno é " + aluno.getNome()+ " " +aluno.getSobrenome());



        System.out.println(" ---------------------------------------------------");
        System.out.println(" --- testando funcionalidade de consultar curso --- ");
        System.out.println(" ---------------------------------------------------");
        Curso curso = manager.consultarCursoPorCodigo("20001");
        System.out.println(" O nome do curso é " + curso.getNomeCurso());
        System.out.println(" ---------------------------------------------------");











    }

}
