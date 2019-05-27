public class TestaCadastro {
    public static void main(String[] args) {

Cliente cliente = new Cliente();
cliente.setNome("Alberto Oliveira");
cliente.setCodigo(1);

Data dataCliente  = new Data( 15, 03,  1988 );
cliente.setDataNascimento(dataCliente);

Funcionario funcionario= new Funcionario();
funcionario.setNome("Mara");
funcionario.setSalario(5000F);

Data dataFuncionario = new Data( 10,  03,1975 );
funcionario.setDataNascimento(dataFuncionario);

Gerente gerente = new Gerente();
gerente.setNome("Nero");
gerente.setSalario(20000F);
gerente.setArea("area tecnica");

Data Datagerente = new Data(07,01,1950);

CadastroPessoas cadastroPessoas = new CadastroPessoas();
cadastroPessoas.cadastrarPessoa(cliente);
cadastroPessoas.cadastrarPessoa(funcionario);
cadastroPessoas.cadastrarPessoa(gerente);


        System.out.println("Quantidade de pessoas cadastradas " + cadastroPessoas.getQuantidadeDePessoas());
        System.out.println("*******************************");

        cadastroPessoas.ImprimeCadastro();




    }

}
