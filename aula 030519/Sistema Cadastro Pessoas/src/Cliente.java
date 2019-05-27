public class Cliente extends Pessoa{

    private int codigo;

    @Override
    public void imprimeDados(){
       super.imprimeDados();
        System.out.println("Codigo do cliente " + codigo);


    }

    public int getCodigo() {

        return codigo;
    }

    public void setCodigo(int codigo) {

        this.codigo = codigo;
    }
}
