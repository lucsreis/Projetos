public class ContaCorrente extends Conta {

public float LimiteChequeEspecial;

    public float getLimiteChequeEspecial() {

        return LimiteChequeEspecial;


    }




    public void setLimiteChequeEspecial(float limiteChequeEspecial) {

        LimiteChequeEspecial = limiteChequeEspecial;

        if (saldo  >  LimiteChequeEspecial);

                System.out.println("Sua conta está estourada em " + getSaldo());

    }






}
