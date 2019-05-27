import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {

        Amigos amigos1 = new Amigos();
        amigos1.setNome("João ");
        amigos1.setApelido("Juan ");
        amigos1.setApelido("Fissura ");
        amigos1.setApelido("Maromba ");

        Amigos amigos2 = new Amigos();
        amigos2.setNome("Miguel ");
        amigos2.setApelido("Night Wash ");
        amigos2.setApelido("Bruce Wayne ");
        amigos2.setApelido("Tampinha ");

        Amigos amigos3 = new Amigos();
        amigos3.setNome("Maria ");
        amigos3.setApelido("Wonder Woman ");
        amigos3.setApelido("Mary ");
        amigos3.setApelido("Marilene ");

        Amigos amigos4 = new Amigos();
        amigos4.setNome("Lucas ");
        amigos4.setApelido("Jorge ");
        amigos4.setApelido("George ");
        amigos4.setApelido("Lukinha ");

        List<Amigos> amigosList = new ArrayList<>();
        amigosList.add(amigos1);
        amigosList.add(amigos2);
        amigosList.add(amigos3);
        amigosList.add(amigos4);

        for (int i =0; i < amigosList.size(); i++){
            System.out.println(amigosList.get(i).getNome());
            System.out.println(amigosList.get(i).getApelido());

        }







    }

}
