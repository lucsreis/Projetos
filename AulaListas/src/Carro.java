public class Carro {

    public String cor;
    public String marca;
    public String placa;

    public void imprimirDetalhes(){

        System.out.println("Cor " + cor);
        System.out.println("Marca " + marca);
        System.out.println("Placa " + placa);
        System.out.println("****************************");
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


}
