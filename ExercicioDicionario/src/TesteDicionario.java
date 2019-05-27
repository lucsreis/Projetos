import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesteDicionario {
    public static void main(String[] args) {

        Dicionario dicionario1 = new Dicionario();
        dicionario1.setTipo("ovos");
        dicionario1.setNumero(0);
        Dicionario dicionario2 = new Dicionario();
        dicionario2.setTipo("agua");
        dicionario2.setNumero(1);
        Dicionario dicionario3 = new Dicionario();
        dicionario3.setTipo("escopeta");
        dicionario3.setNumero(2);
        Dicionario dicionario4 = new Dicionario();
        dicionario4.setTipo("cavalo");
        dicionario4.setNumero(3);
        Dicionario dicionario5 = new Dicionario();
        dicionario5.setTipo("dentista");
        dicionario5.setNumero(4);
        Dicionario dicionario6 = new Dicionario();
        dicionario6.setTipo("fogo");
        dicionario6.setNumero(5);

        Map<Integer , String > mapaDeDicionarios = new HashMap<>();
        mapaDeDicionarios.put(dicionario1.getNumero(), dicionario1.getTipo());
        mapaDeDicionarios.put(dicionario2.getNumero(), dicionario2.getTipo());
        mapaDeDicionarios.put(dicionario3.getNumero(), dicionario3.getTipo());
        mapaDeDicionarios.put(dicionario4.getNumero(), dicionario4.getTipo());
        mapaDeDicionarios.put(dicionario5.getNumero(), dicionario5.getTipo());
        mapaDeDicionarios.put(dicionario6.getNumero(), dicionario6.getTipo());


        for (Integer chave : mapaDeDicionarios.keySet()){
            System.out.println(chave+ "--"+mapaDeDicionarios.get(chave));
        }










    }

}
