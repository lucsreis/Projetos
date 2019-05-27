public class ClasseTeste {

    public static void main(String[] args) {

    Pessoa pessoa1 = new Pessoa();
    pessoa1.setNome("Maria");
    pessoa1.setRg(123456);
    Pessoa pessoa2 = new Pessoa();
    pessoa2.setNome("João");
    pessoa2.setRg(123456);


    if (pessoa1.equals(pessoa2)){

        System.out.println(" possuem o mesmo RG ");
    }
    else{

        System.out.println(" possuem RG diferente ");
    }


    }
}
