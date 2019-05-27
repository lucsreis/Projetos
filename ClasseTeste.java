import java.util.Scanner;

public class ClasseTeste {
    public static void main(String[] args) {


        DigitalHouseManager manager = new DigitalHouseManager();
        manager.registrarCurso("Full Stack", "20001", 3);
        manager.registrarCurso("Android", "20002", 2);

        manager.registrarAluno("Ana","Carolina",100);
        manager.registrarAluno("Mick","Jagger",101);
        manager.registrarAluno("Bono","Vox",102);
        manager.registrarAluno("Maria","Bethania",103);
        manager.registrarAluno("Caetano","Veloso",104);
        manager.registrarAluno("Bob","Marley" ,105);

        manager.matricularAluno(100,"20001");
        manager.matricularAluno(101,"20001");
        manager.matricularAluno(102,"20001");
        manager.matricularAluno(103,"20002");
        manager.matricularAluno(104,"20002");
        manager.matricularAluno(105,"20002");

        manager.registrarProfessorAdjunto("Paul","Allen",1100,32);
        manager.registrarProfessorAdjunto("Bill","Gates",1000,40);
        manager.registrarProfessorTitular("Steve","Jobs",2000,"Android");
        manager.registrarProfessorTitular("Steva","Wozniak",2100,"Full Stack");

        manager.alocarProfessores("20001",2000,1100);
        manager.alocarProfessores("20002",2100,1000);

        manager.consultarCursoPorCodigo("20001");







        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************************");
        System.out.println(" Bem vindo ao sistema de gestão de Cursos");
        System.out.println("******************************************");

        System.out.println("Digite uma das opções :");

        System.out.println("--------------------------------");
        System.out.println("Consultar Curso  -  opção : 1");
        System.out.println("Consultar aluno  -  opção : 2");


        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o código do curso :");

            String codigoCurso = scanner.next();


        }
        if (opcao == 2) {
            System.out.println("Digite o código do aluno :");

            Integer codigo = scanner.nextInt();


        }


    }

}
