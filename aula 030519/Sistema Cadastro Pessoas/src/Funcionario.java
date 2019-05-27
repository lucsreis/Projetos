public class Funcionario extends Pessoa{

     private float salario;
     private float percentualDoImposto = 0.03F;


    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Salario R$ " + salario);
        System.out.println("Valor do imposto " + valorDoImposto());


    }

    public float valorDoImposto(){
        float valorDoImposto = salario * percentualDoImposto;
        return valorDoImposto;

    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


}
