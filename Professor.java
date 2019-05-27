import java.util.Objects;

public class Professor {

    private String nomeProf;
    private String sobrenomeProf;
    private Integer tempoDeCasa;
    private Integer codigoProf;




    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public String getSobrenomeProf() {
        return sobrenomeProf;
    }

    public void setSobrenomeProf(String sobrenomeProf) {
        this.sobrenomeProf = sobrenomeProf;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodigoProf() {
        return codigoProf;
    }

    public void setCodigoProf(Integer codigoProf) {
        this.codigoProf = codigoProf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        Professor professor = (Professor) o;
        return getCodigoProf().equals(professor.getCodigoProf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoProf());
    }
}
