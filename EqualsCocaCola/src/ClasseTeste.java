import java.util.concurrent.Callable;

public class ClasseTeste {

    public static void main(String[] args) {

    Coca coca1 = new Coca();
    coca1.setPreco(8.50);
    coca1.setTamanho(2);
    Coca coca2 = new Coca();
    coca2.setPreco(10);
    coca2.setTamanho(2);

    if (coca1.equals(coca2)){

        System.out.println("possuem o mesmo tamanho");

    }

    else {
        System.out.println("tem tamanhos diferentes");

    }


    }

}
