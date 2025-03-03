public class Pessoa {
    
    private String nome;
    private String telefone;

    // construtor
    public Pessoa(String nome, String telefone) {
        this.telefone = telefone;
        this.nome = nome;
    }
        
    // acessador
    public String getNome(){
        return nome;
    } 
    
    // modificador
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTelefone(String telefone){
        this.telefone=telefone;
    }
    
    public String getTelefone(){
        return telefone;
    } 
}
