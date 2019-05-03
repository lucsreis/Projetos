public class Professor extends Funcionario {

@Override
public void baterPonto(){

    System.out.println("Professor bateu o ponto no app");

}


    private String curso;


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
