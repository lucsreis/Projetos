public class Gerente  extends Funcionario {

    private String area;
    private float imposto = 0.05F;



    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Area do gerente" + area);
    }

        @Override
        public float valorDoImposto() {
            float valorDoImposto = getSalario() * imposto;
            return valorDoImposto;
        }



        public String getArea () {
            return area;
        }

        public void setArea (String area)
        {
            this.area = area;
        }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }
}


