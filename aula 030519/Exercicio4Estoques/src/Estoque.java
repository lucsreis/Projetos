public class Estoque  {


public int quantidadeAtual;
public int quantidadeMinima;
public int unidade;
public String nome;



public Estoque (int unidade, int quantidadeAtual, int quantidadeMinima){
       this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMinima = quantidadeMinima;
        this.unidade = unidade;



}



    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;

    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
    this.setQuantidadeMinima(quantidadeMinima = (int) 0F);
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public void mudarNome (String nome){


}

    public String getNome(String caixa) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mudarQtMinima (int quantidadeMinima){



}
public void repor (int quantidade){
this.repor(quantidadeAtual + quantidade );

    System.out.println(" Seu estoque foi aumentado em " + unidade);

}
public void darBaixa (int quantidade){
    this.darBaixa(quantidadeAtual - quantidade);

    System.out.printf("Seu estoque reduziu em " + quantidade);

}
public void mostra (){
    System.out.println("O produto possui quantidade minima de " + quantidadeMinima + " e quantidade atual de "  + quantidadeAtual);

}

    public boolean precisaRepor ( ) {
        if (quantidadeMinima < quantidadeAtual) {
            return false;
        } else {
            return true;
        }
    }






}
