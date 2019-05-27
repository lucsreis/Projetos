public class Cachorro implements Saudavel{

    private String raça;


    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }


    @Override
    public boolean saudavel(String diagnostico) {
        if(diagnostico.contains("doente")){

        return false;} else
            return true;
    }
}
