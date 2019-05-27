import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private List<Livros> estoques = new ArrayList<>();

    public Catalogo() {


        Livros livro1 = new Livros("001","Paulo Coelho", "O Alquimista", 1987, 1212100, 50.00 );
        estoques.add(livro1);
        Livros livro2 = new Livros("002","Machado de Assis", "Memorias Postumas", 1955, 1215100, 68.00 );
        estoques.add(livro2);
        Livros livro3 = new Livros("003","João Guimaraes Rosa", "Grande Sertão Veredas", 1968, 1218100, 56.00 );
        estoques.add(livro3);
        Livros livro4 = new Livros("004","Jose de Alencar", "Senhora", 1958, 1235100, 38.00 );
        estoques.add(livro4);
        Livros livro5 = new Livros("005","Monteiro Lobato", "Sitio do Picapau Amarelo", 1935, 1267100, 44.00 );
        estoques.add(livro5);
    }

    public void cadastrarLivro(Livros livro) {
        estoques.add(livro);

    }

    public Livros consultarLivroPorCodigo(String codigo) {
        for (Livros livro : estoques) {
            if (livro.getCodigo() == "001") ;
            return livro;

        }

    return null;
    }

    public void efetuarVendaPorCodigo (String codigo){
        for (Livros livro : estoques){


        }

    }

}





