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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cartaoSUS == null) ? 0 : cartaoSUS.hashCode());
        result = prime * result + ((comorbidades == null) ? 0 : comorbidades.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
        result = prime * result + ((estadoVacina == null) ? 0 : estadoVacina.hashCode());
        result = prime * result + ((idade == null) ? 0 : idade.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((profissao == null) ? 0 : profissao.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (cartaoSUS == null) {
            if (other.cartaoSUS != null)
                return false;
        } else if (!cartaoSUS.equals(other.cartaoSUS))
            return false;
        if (comorbidades == null) {
            if (other.comorbidades != null)
                return false;
        } else if (!comorbidades.equals(other.comorbidades))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (endereco == null) {
            if (other.endereco != null)
                return false;
        } else if (!endereco.equals(other.endereco))
            return false;
        if (estadoVacina == null) {
            if (other.estadoVacina != null)
                return false;
        } else if (!estadoVacina.equals(other.estadoVacina))
            return false;
        if (idade == null) {
            if (other.idade != null)
                return false;
        } else if (!idade.equals(other.idade))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (profissao == null) {
            if (other.profissao != null)
                return false;
        } else if (!profissao.equals(other.profissao))
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa [cartaoSUS=" + cartaoSUS + ", comorbidades=" + comorbidades + ", cpf=" + cpf + ", email=" + email
                + ", endereco=" + endereco + ", estadoVacina=" + estadoVacina + ", idade=" + idade + ", nome=" + nome
                + ", profissao=" + profissao + ", telefone=" + telefone + "]";
    }
}
