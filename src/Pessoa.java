import java.time.LocalDate;
public class Pessoa {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    //Criando metodo Construtor da classe Pessoa
    public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    // Criando get e set de Pessoa
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    //Criando metodo para mostrar na tela o Cadastro feito
    public void cadastrar() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }
}
    //Criando uma classe que estende a classe Pessoa
    class Funcionario extends Pessoa {
    private LocalDate dataContratacao;
    private double salarioBase;

    // Criando metodo Construtor Funcionario
    // Utilizando o 'super' para chamar o construtor da classe Pessoa e herdar seus atributos
    public Funcionario(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase) {
        super(nome, cpf, dataNascimento);
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
    }

    // Criando get e set para dataContratacao e salarioBase
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void cadastrar() {
        super.cadastrar();
        System.out.println("Data de Contratação: " + dataContratacao);
        System.out.println("Salário Base: " + salarioBase);
    }
}
   //Criando a classe Gerente que estende a classe Funcionario
    class Gerente extends Funcionario {
    private String departamento;

    // Criando metodo Construtor Funcionario
    // Utilizando o 'super' para chamar o construtor da classe Funcionario e herdar seus atributos
    public Gerente(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, String departamento) {
        super(nome, cpf, dataNascimento, dataContratacao, salarioBase);
        this.departamento = departamento;
    }

    // get e set para departamento
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //Sobrescreve o método 'cadastrar' para incluir as informações específicas da classe atual
    public void cadastrar() {
        System.out.println("Cadastro feito com Sucesso");
        super.cadastrar();
        System.out.println("Data de Contratação: " + departamento);
    }

}
    //Criando a classe Vendedor que estende a classe Funcionario
    class Vendedor extends Funcionario {
    private double percentualComissao;

    // Criando metodo Construtor Vendedor
    // Utilizando o 'super' para chamar o construtor da classe Funcionario e herdar seus atributos
    public Vendedor(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, double percentualComissao) {
        super(nome, cpf, dataNascimento, dataContratacao, salarioBase);
        this.percentualComissao = percentualComissao;
    }

    // get e set para percentualDeComissao
    public double getPercentualDeComissao() {
        return percentualComissao;
    }

    public void getPercentualDeComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    //Sobrescreve o método 'cadastrar' para incluir as informações específicas da classe atual
    public void cadastrar() {
        System.out.println("Cadastro feito com sucesso");
        super.cadastrar();
        System.out.println("Data de Contratação: " + percentualComissao);

    }

}
// Classe Cliente que estende Pessoa
class Cliente extends Pessoa {
    private String email;
    private String numeroCartaoFidelidade;
    private String telefone;


    // Criando metodo Construtor Cliente
    // Utilizando o 'super' para chamar o construtor da classe Pessoa e herdar seus atributos
    public Cliente(String nome, String cpf, LocalDate dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
        super(nome, cpf, dataNascimento);
        this.email = email;
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
        this.telefone = telefone;
    }

    // get e set para email, numeroCartaoFidelidade e telefone

    public String getNumeroCartaoFidelidade() {
        return numeroCartaoFidelidade;
    }

    public void setNumeroCartaoFidelidade(String numeroCartaoFidelidade) {
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Sobrescreve o método 'cadastrar' para incluir as informações específicas da classe atual
    public void cadastrar() {
        System.out.println("Cadastro feito com sucesso");
        super.cadastrar();
        System.out.println("Email " + email);
        System.out.println("Numero do Cartão Fidelidade: " + numeroCartaoFidelidade);
        System.out.println("Telefone: " + telefone);

    }

}
