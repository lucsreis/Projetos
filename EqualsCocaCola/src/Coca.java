import java.util.Objects;

public class Coca {

    private Integer tamanho;
    private double preco;

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coca)) return false;
        Coca coca = (Coca) o;
        return
                Objects.equals(getTamanho(), coca.getTamanho());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTamanho(), getPreco());
    }
}
