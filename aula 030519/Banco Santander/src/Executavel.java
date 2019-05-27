public class Executavel {

    public static void main(String[] args) {

        System.out.println("*****************************");

        Cliente cliente1 = new Cliente();
        cliente1.setNomeDoCliente("Paula");
        cliente1.setSobrenome(" Oliveira");
        cliente1.setNumeroCpf("CPF : 123.456.789-00");
        cliente1.setNumeroRg("RG 123.456-7");
        cliente1.setNumeroDaConta("Conta 12345-7");

        System.out.println(cliente1.getNomeDoCliente()+ cliente1.getSobrenome());
        System.out.println(cliente1.getNumeroDaConta( ));
        System.out.println(cliente1.getNumeroCpf ());
        System.out.println(cliente1.getNumeroRg());

        ContaCorrente conta1 = new ContaCorrente();
        conta1.setSaldo(1000F);
        conta1.setLimiteChequeEspecial(500);


        ContaPoupanca conta2 = new ContaPoupanca();
        conta2.setTaxaDeJuros(10F);

     conta1.depositar(5000F);
        conta1.sacar(500F);





    }

}
