public class Contas {

    private String numeroDaConta;
    private Double saldo;
    private Clientes titular;


    public String getNumeroDaConta() {

        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {

        this.numeroDaConta = numeroDaConta;
    }


    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    public Double getSaldo() {

        return saldo;
    }

    public Clientes getTitular() {

        return titular;
    }

    public void setTitular(Clientes Titular) {
        this.titular = titular;

    }

    public void depositar (Double quantiaDeDinheiro) {
        this.saldo = quantiaDeDinheiro + saldo;
        System.out.println("Seu depósito foi realizado");
        System.out.println("Seu novo saldo é :" + saldo);
    }

    public void sacar (Double quantiaDeDinheiro){
        this.saldo = saldo - quantiaDeDinheiro;
        if (saldo < quantiaDeDinheiro){
            System.out.println(" Seu saldo é insuficiente");
        }
        else {

            System.out.println(" Saque efetuado com sucesso " );
            System.out.println(" seu novo saldo é :" + saldo);

        }


        }


    }










