public abstract class Conta {

    public Float saldo;
    public Cliente cliente;

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {

        this.saldo = saldo;

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(Float quantiaDeDinheiro) {
        this.saldo = quantiaDeDinheiro + saldo;
        System.out.println("Seu depósito foi efetuado");
        System.out.println(" Seu novo saldo é :" + saldo);



    }

    public void sacar (Float quantiaDeDinheiro){
        this.saldo = saldo - quantiaDeDinheiro;
        System.out.println(" Seu saque de " + quantiaDeDinheiro +" foi efetuado");
        System.out.println(" Seu novo saldo é :" + saldo);
      if (quantiaDeDinheiro > saldo){
          System.out.println("Seu saldo está negativo");


                }
      else {


      }


    }
}



