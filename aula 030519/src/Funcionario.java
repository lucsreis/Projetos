public class Funcionario {

    private String nome;
    private float salario;

    public void baterPonto() {
        System.out.println("Funcionário " + nome +" bateu o ponto");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
