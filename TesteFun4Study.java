
/**
 * Escreva a descrição da classe TesteFun4Study aqui.
 * 
 * @author (Marcos) 
 * @version (número de versão ou data)
 */

public class TesteFun4Study
{
    public static void main(String[] args) {
        Cidade cid;
        Estudante est;
        int s; 
        int s2;
        int verific = 0;
        char respo;
        int op;

        do{
            verific = 0;
            System.out.println("Cadastrando a Cidade");
            System.out.println("________________________________________________________________________");

            cid = new Cidade(Teclado.leInt("Informe o código da Cidade: "),
                Teclado.leString("Informe o nome: "),
                Teclado.leString("Informe a UF: "));
            cid.exibeDados(); 
            System.out.println("________________________________________________________________________");

            do{
                verific++;
                System.out.println("Cadastrando o Estudante");
                System.out.println("________________________________________________________________________");

                est = new Estudante(Teclado.leInt("Informe o código do estudante: "),
                    Teclado.leString("Informe o nome: "),
                    Teclado.leString("Informe a data de nascimento: "),
                    Teclado.leString("Informe o e-mail: "),
                    Teclado.leString("Informe a senha: "),
                    cid);
                System.out.println("________________________________________________________________________");

                est.exibeDados();

                respo = Teclado.leChar("Deseja alterar um dado do Estudante criado(S-Sim / N-Não) ?");

                while((respo == 'S') || (respo == 's')){
                    System.out.println("________________________________________________________________________");
                    System.out.println("\n Atualize os dados desejados \n");
                    System.out.println("Estudante " + est.getNome() +  ":\n");
                    System.out.println("1-Código;");
                    System.out.println("2-Nome;");
                    System.out.println("3-Data de Nascimento;");
                    System.out.println("4-E-mail;");
                    System.out.println("5-Senha;");
                    op = Teclado.leInt("Digite a opção de dado que deseja alterar:");
                    System.out.println("________________________________________________________________________");
                    switch(op){
                        case 1:
                        est.setCodigo(Teclado.leInt("Digite o novo código"));
                        break;
                        case 2:
                        est.setNome(Teclado.leString("Digite o nome"));
                        break;
                        case 3:
                        est.setDataNasc(Teclado.leString("Digite a nova de nascimento"));
                        break;
                        case 4:
                        est.setEmail(Teclado.leString("Digite o novo E-mail"));
                        break;
                        case 5:
                        alterarSenha(est);
                        break;
                        default:
                        System.out.println("\n Digite uma opção válida\n");
                        System.out.println("________________________________________________________________________");
                    }

                    respo = Teclado.leChar("Deseja continuar alterando os dados do Estudante(S-Sim / N-Não) ?"); 
                    if((respo == 'N') || (respo == 'n')){
                        System.out.println("Dados do estudante atualizados");
                        System.out.println("________________________________________________________________________");
                        System.out.println("Estudante " + est.getNome() +  ":\n");
                        est.exibeDados();
                    }
                }

                System.out.println("________________________________________________________________________");

                s2 = Teclado.leInt("Digite 0 para não cadastrar mais nenhum estudante:");
                if(s2 == 0 && verific < 4){
                    System.out.println("Crie no mínimo 4 estudantes:");
                    
                }

            }while(s2 != 0 || verific < 4);

            s = Teclado.leInt("Digite 0 para não cadastrar a cidade");
            

        }while(s != 0 );

    }
    // abaixo metodo para alterar senha
    public static void alterarSenha(Estudante est1){
        System.out.println("Alterando a Senha");  

        String senhaAnterior;
        String novaSenha;
        String confirmaSenha;

        do {

            senhaAnterior = Teclado.leString("Digite a senha do Estudante " + est1.getNome() + ":");

            if(!(est1.getSenha()).equals(senhaAnterior)){
                System.out.println("Não foi possível alterar a senha!\nA senha incorreta"); 
            }
        } while (!(est1.getSenha()).equals(senhaAnterior));
        do {
            novaSenha = Teclado.leString("Digite a nova senha: ");
            confirmaSenha = Teclado.leString("Confirme a nova senha: ");
            if(!novaSenha.equals(confirmaSenha)){

                System.out.println("Não foi possível alterar a senha!\nAs senhas digitadas não são iguais!");
            }

        }while(!novaSenha.equals(confirmaSenha)); 

        est1.setSenha(novaSenha);
        System.out.println("Senha alterada com sucesso!!");
    }

}    


