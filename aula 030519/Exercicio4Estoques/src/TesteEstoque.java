public class TesteEstoque {
    public static void main(String[] args) {

    Estoque estoque = new Estoque(20,30,0);
    estoque.getNome("caixa");
    estoque.getUnidade();


        System.out.println("Seu estoque alterou em " + estoque  );




    }

}
