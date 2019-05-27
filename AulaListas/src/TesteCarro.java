import java.util.*;

public class TesteCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setCor("Preto");
        carro1.setMarca("Ford");
        carro1.setPlaca("ABC-1234");

        Carro carro2 = new Carro();
        carro2.setCor("Branco");
        carro2.setMarca("Fiat");
        carro2.setPlaca("BCA-3456");

        Carro carro3 = new Carro();
        carro3.setCor("Preto");
        carro3.setMarca("Fiat");
        carro3.setPlaca("FCA-6789");

        List<Carro> listaDeCarros = new ArrayList<>();
        listaDeCarros.add(carro1);
        listaDeCarros.add(carro2);
        listaDeCarros.add(carro3);
        listaDeCarros.add(carro3);

        System.out.println("Tamanho da lista " + listaDeCarros.size());

        for (Carro carro : listaDeCarros) {
        carro.imprimirDetalhes();


        }

        System.out.println("****************************");
        System.out.println(" EXEMPLO DE CONJUNTO");
        System.out.println("****************************");


        Set<Carro> conjuntoDeCarros = new HashSet<>();
        conjuntoDeCarros.add(carro1);
        conjuntoDeCarros.add(carro2);
        conjuntoDeCarros.add(carro3);

        System.out.println("Tamanho do conjunto " + conjuntoDeCarros.size());

        System.out.println("----------------------------");

        for (Carro carro : conjuntoDeCarros){
           carro.imprimirDetalhes();



        }

        System.out.println("****************************");
        System.out.println(" EXEMPLO DE MAPA");
        System.out.println("****************************");


        Map<String, Carro> mapaDeCarros = new HashMap<>();
        mapaDeCarros.put(carro1.getPlaca(), carro1);
        mapaDeCarros.put(carro2.getPlaca(), carro2);
        mapaDeCarros.put(carro3.getPlaca(), carro3);

        System.out.println("Tamanho do mapa " + mapaDeCarros.size());

        System.out.println("----------------------------");

        for (String chave: mapaDeCarros.keySet()){

            Carro carro = mapaDeCarros.get(chave);
            carro.imprimirDetalhes();

        }
        System.out.println("----------------------------");
        System.out.println("Buscando um carro no Mapa");

        System.out.println("----------------------------");

        Carro carroValor = mapaDeCarros.get("ABC-1234");
        carroValor.imprimirDetalhes();





    }


    }


