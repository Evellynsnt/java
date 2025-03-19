import java.util.InputMismatchException;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insira sua idade: ");
            int idade = sc.nextInt();

            if(idade <= 0){
                System.out.println("A idade deve ser maior que zero.");
            } else{
                System.out.println("Idade cadastrada com sucesso:"+idade);
            }
            
        } catch(InputMismatchException e){
            System.out.println("Idade inválida!");
            System.out.println("Detalhes do erro: "+e.getMessage());
        } finally{
            System.out.println("Finalizando programa!");
        }
        sc.close();
    }
}
