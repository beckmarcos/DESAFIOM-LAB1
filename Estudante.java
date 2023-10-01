
/**
 * Escreva a descrição da classe Estudante aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Estudante
{
    private int Codigo;
    
    private String nome;
    
    private String datanasc;
    
    private String email;
    
    private String senha;
    
    private Cidade cidade;
    
    
    // metodo construtor
    
    public Estudante (int Cod, String name, String data, String ema, String password, Cidade cid){

    Codigo = Cod;

    nome = name;
    
    datanasc = data;
    
    email = ema; 
    
    senha = password;
    
    cidade = cid;
    
    this.cidade.adicionaNovoEstudante();
    

    }
    
    // metodo get
    public int getCodigo(){

        return Codigo;

    }
    
      public String getNome(){

        return nome;

    }
    
       public String getDataNasc(){

        return datanasc;

    }
    
       public String getEmail(){

        return email;

    }
       public String getSenha(){

        return senha;

    }
    
       public String getCidade(){

        return cidade.getDescricao();

    }
    
    //metodo set 
    
    public void setCodigo(int novoCodigo){

        Codigo = novoCodigo;
    }
    
    public void setNome(String novoNome){

        nome = novoNome;
        
    }
    
    public void setDataNasc(String novaDataNasc){

        datanasc = novaDataNasc;
        
    }
    
    public void setEmail(String novoEmail){

        email = novoEmail;
        
    }
    
    public void setSenha(String novaSenha){

        senha = novaSenha;
        
    }
    
    public void setCidade(Cidade novaCidade){

        cidade = novaCidade;
        
    }
    
    // metodo exibe dados
    public  void exibeDados(){
        
        System.out.println("Exibindo dados do Estudante: ");
        
        System.out.println("______________________________________________________");
     
        System.out.println("Código " + getCodigo());

        System.out.println("Nome: " + getNome());

        System.out.println("Data de Nascimento: " + getDataNasc());
        
        System.out.println("Email: " + getEmail());
        
        System.out.println("Senha: " + getSenha());
        
        cidade.exibeDados();

    }
}
