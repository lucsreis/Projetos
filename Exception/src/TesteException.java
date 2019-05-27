public class TesteException {

    public static void main(String[] args) {

        System.out.println("Programa iniciando");

    try {
        int resultado = 1000 / 1;
        System.out.println("Resultado "+resultado);
    } catch (Exception exception){
        System.out.println("operação inválida");
        System.out.println(exception.getMessage());


    }finally {
        System.out.println("Isso sempre vai acontecer");
    }




        System.out.println("Programa finalizado");



    }

}
