
import java.util.ArrayList;
import java.util.List;


public class CadastroPessoas {

    private int quantidadeDePessoas;
    private List<Pessoa> listaDePessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa pessoa){

        listaDePessoas.add(pessoa);
        quantidadeDePessoas = quantidadeDePessoas + 1;

            }

    public void ImprimeCadastro() {

        for (Pessoa pessoa : listaDePessoas) {
            pessoa.imprimeDados();
            System.out.println("*******************************");

        }
    }

    public int getQuantidadeDePessoas() {

    return quantidadeDePessoas;

    }

    public void setQuantidadeDePessoas(int quantidadeDePessoas) {
        this.quantidadeDePessoas = quantidadeDePessoas;
    }
}
