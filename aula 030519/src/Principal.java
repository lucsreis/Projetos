public class Principal {

    public static void main(String[] args) {

Funcionario funcionario1 = new Funcionario();
funcionario1.setNome("Joao");
funcionario1.setSalario(1000F);
funcionario1.baterPonto();


        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getSalario());



            System.out.println("***********************************");

        Professor professor1 = new Professor();
        professor1.setNome("Maria");
        professor1.setSalario(15000F);
        professor1.setCurso("Professor de Mobile");
        professor1.baterPonto();
        System.out.println(professor1.getNome());
        System.out.println(professor1.getSalario());
        System.out.println(professor1.getCurso());






    }

}
