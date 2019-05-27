import java.util.ArrayList;
import java.util.List;



    public class TesteArrayProduto {

        public static void main(String[] args) {

            List<Produto>ListaDeProdutos = new ArrayList<>();


            Produto produto1 = new Produto("refrigerante", 5 );
            ListaDeProdutos.add(produto1);

            Produto produto2 = new Produto("sanduiche", 7);
            ListaDeProdutos.add(produto2);

            for (Produto produto : ListaDeProdutos) {

                System.out.println("item" + produto1.getDescricao() + "R$ " + produto1.getPreco());
                System.out.println("item" + produto2.getDescricao() + "R$ " + produto2.getPreco());

            }


            }




        }








