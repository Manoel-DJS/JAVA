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
        System.out.printf("valor do imc %.2f" + imc);
    }

}

/** 

import java.util.Locale;
import java.util.Scanner;

public class ConversaoDeTemperatura {
    public static void main(String[] args) {
        // Definindo a configuração regional
        Locale.setDefault(Locale.US);

        Scanner keyboard = new Scanner(System.in);
        double grausFahrenheit = lerTemperaturaEmGrausFahrenheit(keyboard);

        keyboard.close();

        double grausCelsius = converterTemperatura(grausFahrenheit);

        System.out.printf("A temperatura convertida para graus Celsius é %.2f graus", grausCelsius);

        
    }

    private static double lerTemperaturaEmGrausFahrenheit(Scanner keyboard) {
        System.out.print("Informe a temperatura em graus Fahrenheit: ");
        double grausFahrenheit = keyboard.nextDouble();
        return grausFahrenheit;
    }

    private static double converterTemperatura(double grausFahrenheit) {
        double grausCelsius = 5 * ((grausFahrenheit - 32) / 9);
        return grausCelsius;
    }
}
 
**/
// static void não precisa de return// NAU USA

// static double ou int ou float
// PRECISA DE RETORNO
