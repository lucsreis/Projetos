import java.util.HashSet;
import java.util.Set;

public class TesteFutebol {

    public static void main(String[] args) {

        ClubeFutebol botafogo = new ClubeFutebol();
        botafogo.setCidade("Rio de Janeiro");
        botafogo.setNome("Botafogo");
        botafogo.setQuantidadeTorcedores(5);
        ClubeFutebol botafogo2 = new ClubeFutebol();
        botafogo2.setCidade("Ribeirão");
        botafogo2.setNome("Botafogo");
        ClubeFutebol flamengo = new ClubeFutebol();
        flamengo.setNome("Flamengo");
        flamengo.setCidade(("Rio de Janeiro"));



        if (botafogo.equals(botafogo2)){

            System.out.println("São o mesmo clube");

        } else {
            System.out.println("São Clubes diferentes");

        }

        Set<ClubeFutebol> conjuntoClubes = new HashSet<>();

        conjuntoClubes.add(botafogo);
        conjuntoClubes.add(botafogo2);
        conjuntoClubes.add(flamengo);

        System.out.println("qtde de clubes " + conjuntoClubes.size());
        System.out.println(botafogo);
        System.out.println(botafogo2);
        System.out.println(flamengo);



    }

}
