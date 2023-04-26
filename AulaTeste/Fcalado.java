package AulaTeste;
import java.util.Scanner;

public class Fcalado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Diagnóstico de IMC");
        //Entradas

        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        
        scanner.close();


        //Processamento
        double imc = peso / Math.pow(altura, 2);
        //Saídas
        System.out.printf("valor do imc %.2f" + imc); 1
    }

}


// static void não precisa de return// NAU USA

// static double ou int ou float
// PRECISA DE RETORNO
