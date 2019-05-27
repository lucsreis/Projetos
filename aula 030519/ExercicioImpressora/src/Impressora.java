import java.util.ArrayList;
import java.util.List;

public class Impressora {

    private List<Imprimivel> listaImprimivel = new ArrayList<>();


        public void imprimirTudo () {

            for (Imprimivel imprimivel: listaImprimivel){
                Imprimivel.imprimir();

            }
        }
        public void adicionarImprimivel (Imprimivel imprimivel){
            listaImprimivel.add(imprimivel);





        }



    }


