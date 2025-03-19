import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    try{
        System.out.println("Digite um número: ");
        int x = sc.nextInt();
        int resultado = x / 0;
        System.out.println("Resultado: "+resultado);

    } catch (InputMismatchException e){
        System.out.println("Formato inválido!");
        System.out.println("Detalhes do erro!"+e.getMessage());
    } catch (ArithmeticException e) {
        System.out.println("Operação inválida!");
        System.out.println("Detalhes do erro: "+e.getMessage());
    } finally{
        System.out.println("Programa finalizado!");
    }
    sc.close();
}
    }
    
