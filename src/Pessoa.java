import java.time.LocalDate;

public class Pessoa {
    
    private String nome;
    private String cpf;
    private String endereco;
    private String cartaoSUS;
    private String email;
    private String telefone;
    private String profissao;
    private String comorbidades;
    private LocalDate idade;

    private EstadoVacina estadoVacina = new NaoHabilitada();

    public Pessoa(String nome, String cpf, String endereco, String cartaoSUS, String email, String telefone,
            String profissao, String comorbidades, int anoNascimento, int mesNascimento, int diaNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cartaoSUS = cartaoSUS;
        this.email = email;
        this.telefone = telefone;
        this.profissao = profissao;
        this.comorbidades = comorbidades;
        this.idade = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
    }

    public void atualizaEstadoVacina(Pessoa pessoa){
        estadoVacina.verificaVacina(pessoa);
    }

    public void atualizaCadastro(String nome, String cpf, String endereco, String cartaoSUS, String email, String telefone,
            String profissao, String comorbidades, int anoNascimento, int mesNascimento, int diaNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cartaoSUS = cartaoSUS;
        this.email = email;
        this.telefone = telefone;
        this.profissao = profissao;
        this.comorbidades = comorbidades;
        this.idade = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCartaoSUS() {
        return cartaoSUS;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getComorbidades() {
        return comorbidades;
    }

    public EstadoVacina getVacina() {
        return estadoVacina;
    }

    public void setVacina(EstadoVacina vacina) {
        this.estadoVacina = vacina;
    }

    public LocalDate getIdade() {
        return idade;
    }
}
