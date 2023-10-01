
/**
 * Classe cidade referente ao desafio do Módulo 3.
 * 
 * @author (Marcos Beck) 
 
 */
public class Cidade
{
    private int codigo;
    
    private String descricao;
    
    private String uf;
    
    private int qntdestu = 0;
    
    // metodo construtor 
    public Cidade (int cod, String desc, String est){

    codigo = cod;

    descricao = desc;

    uf = est;

    }
    // metodo get
    public int getCodigo(){

        return codigo;

    }

 

    public String getDescricao(){

        return descricao;

    }

   

    public String getUF(){

        return uf;

    }
    
    //metodo set 
    
    public void setDescricao(String novaDescricao){

        descricao = novaDescricao;

    }

   

    public void setIdade(String novaUF){

        uf = novaUF;

    }
    
    // metodo adicionaNovoEstudante
     public void adicionaNovoEstudante(){
        qntdestu ++;
        
        }
       
    
    
    
    // metodo exibeDados
    public void exibeDados(){
        
        System.out.println("Exibindo dados da Cidade: ");
        
        System.out.println("______________________________________________________");

        System.out.println("Código: " + getCodigo());

        System.out.println("Descrição: " + getDescricao());

        System.out.println("UF: " + getUF());
        
        System.out.println("Quantidade de estudantes: " + qntdestu);

    }
       
    
}
