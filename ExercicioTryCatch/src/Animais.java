import java.util.ArrayList;
import java.util.List;




public class Animais {

 public static void main(String[] args) {


    try {


        List<String> listaAnimal = new ArrayList<>();
        listaAnimal.add("Pato");
        listaAnimal.add("Cachorro");
        listaAnimal.add("Gato");

        System.out.println(listaAnimal.get(2));
    }catch (Exception exception){

        System.out.println("operação inválida");
    }

}

}
