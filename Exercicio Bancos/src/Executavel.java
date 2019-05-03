public class Executavel {

public static void main (String[] args){

    System.out.println("*************************");

    Clientes cliente1 = new Clientes();
    cliente1.setNome("Luciano");
    cliente1.setSobrenome(" Reis");

    System.out.println(cliente1.getNome()+ cliente1.getSobrenome());


    Contas conta1 = new Contas();
    conta1.setNumeroDaConta("12345");
    conta1.setSaldo(1000D);
    conta1.setTitular(cliente1);

    System.out.println("Seu saldo inicial é :" + conta1.getSaldo());

    conta1.depositar(2500D);
    conta1.sacar(700D);


    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*");

    Clientes cliente2 = new Clientes();
    cliente2.setNome("Maria");
    cliente2.setSobrenome(" da Luz");

    System.out.println(cliente2.getNome()+cliente2.getSobrenome());



    Contas conta2 = new Contas();
    conta2.setNumeroDaConta("23456");
    conta2.setSaldo(500D);
    conta2.setTitular(cliente2);


    System.out.println("Seu saldo inicial é :" + conta2.getSaldo());
conta2.depositar(700D);
conta2.sacar(70D);


    System.out.println("***************************");
}

}
