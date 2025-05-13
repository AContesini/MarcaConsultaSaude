package pacientes;

public class Pacientes {
    private Long id;
    private String nome;
    private String cpf;
    private String Telefone1;
    private String Telefone2;
    private String Email;
    private String endereco;

    public Pacientes(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getTelefone1() {
        return Telefone1;
    }

    public void setTelefone1(String telefone1) {
        Telefone1 = telefone1;
    }

    public String getTelefone2() {
        return Telefone2;
    }

    public void setTelefone2(String telefone2) {
        Telefone2 = telefone2;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Paciente:" +
                "id=" + id +
                ", nome='" + nome +
                ", cpf='" + cpf +
                ", Telefone1='" + Telefone1 +
                ", Telefone2='" + Telefone2 +
                ", Email='" + Email +
                ", endereco='" + endereco ;
    }
}
