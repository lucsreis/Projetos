import java.util.ArrayList;
import java.util.List;

public class Animais {

    public static void main(String[] args) {


            List<String> animal = new ArrayList<>();
        try {
            animal.add("Pato");
            animal.add("Cachorro");
            animal.add("Gato");

            System.out.println(animal.get(2));
        } catch (Exception exception) {

            System.out.println("tipo da excessão " + exception.getClass());
        }

        }


    }


