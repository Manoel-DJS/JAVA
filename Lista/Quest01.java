package Lista;
import java.util.Scanner;

public class Quest01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Digite um número(A): ");
        int numA = ler.nextInt();

        System.out.println("Digite um número(B): ");
        int numB = ler.nextInt();
        
        // Soluçando
        if(numA > numB){
            System.out.println("Valor A: " + numA);
        } else{
            System.out.println("Valor B: " + numB);
        }
    }
}
