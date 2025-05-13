package medicos;

public class Medico {
    private Long id;
    private String nome;
    private String crm;

   public Medico(){

   }

   public void cadastraMedicos(Long id,String nome,String crm){
       this.id =id;
       this.nome=nome;
       this.crm =crm;
   }
   public void setId(Long id){
       this.id =id;
   }

   public Long getId(){
       return id;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "dados do Doutor(a):" +
                "id=" + id +
                ", nome='" + nome +
                ", crm='" + crm;
    }
}
