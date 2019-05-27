public class Livros {

    private String codigo;
    private String autor;
    private String titulo;
    private int anoLancamento;
    private int codigoIsbn;
    private double preco;
    private int qtdEstoque;

    public Livros(String codigo, String autor, String titulo, int anoLancamento, int codigoIsbn, double preco) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.codigoIsbn = codigoIsbn;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getCodigoIsbn() {
        return codigoIsbn;
    }

    public void setCodigoIsbn(int codigoIsbn) {
        this.codigoIsbn = codigoIsbn;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public void imprimirNaTela (){
        System.out.println("Nome do Livro: " + titulo);
        System.out.println("Nome do autor: " + autor);
        System.out.println("Ano do lançamento: " + anoLancamento);
        System.out.println("Código ISBN: " + codigoIsbn);
        System.out.println("Codigo cadastro: " + codigo);
        System.out.println("Preço :" + preco);
        System.out.println("Qtde. em estoque :" + qtdEstoque);


    }
}
