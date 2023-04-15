package Lista;
import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite um número: ");
        int numero = ler.nextInt();
        
        // Condição
        if(numero % 2 == 0){
            System.out.println("Número é par.");
        } else{
            System.out.println("É ímpar");
        }
    }
}
