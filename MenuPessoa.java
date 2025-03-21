import java.util.ArrayList;
import java.util.Scanner;

import java.nio.channels.ScatteringByteChannel;


public class MenuPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> list = new ArrayList<>();
        
        int op =0;
        while (op !=4){
            System.out.println("\n=========== MENU =============");
            System.out.println("1- CADASTRAR");
            System.out.println("2- LISTAR");
            System.out.println("3- REMOVER");
            System.out.println("4- SAIR");
            System.out.println("ESCOLHA A OPÇÃO:");
            op = sc.nextInt();

            switch(op) {
                case 1:
                System.out.println("Digite seu nome: ");
                String nome=sc.next();
                System.out.println("Digite seu telefone:");
                String telefone = sc.next();
                list.add(new Pessoa(nome,telefone));

                    break;
                case 2:
                if(list.isEmpty()){
                    System.out.println("Lista vazia");
                } else{
                    for (Pessoa p:list){
                        System.out.println("Nome:"+p.getNome()+"Telefone:"+p.getTelefone());
                    }
                }
                case 3:
                if(list.isEmpty()){
                    System.out.println("Lista vazia");
                } else{
                    System.out.println("Digite o índice a ser removido:");
                    int indice = sc.nextInt();

                if(indice>=0 && indice<list.size()) {
                    list.remove(indice);
                    System.out.println("Contato removido com sucesso!");
                }
            }
                case 4: 
                System.out.println("Finalizando o programa...");
                default:

                    break;
            }

        }
        sc.close();
    }
}
