/** 

Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

**/

package Pratica1;
import java.util.Scanner;

public class Quest10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Programa que transforma graus Celcius para graus Fahrenheit");
        System.out.println("Digite a temperatura(graus Celcius): ");
        double grausCelcius = scanner.nextDouble();

        double grausFahrenheit = (((5 * grausCelcius) / 9) +32);

        System.out.printf("%.1f graus Celcius transformados para graus Fahrenheit fica: %.1f graus", grausCelcius, grausFahrenheit);
    }
}
