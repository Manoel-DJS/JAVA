/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 10 
*/

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

        scanner.close();
        double grausFahrenheit = ((1.8 * grausCelcius)+32);


        System.out.printf("%.1f graus Celcius transformados para graus Fahrenheit fica: %.1f graus", grausCelcius, grausFahrenheit);
    }
}
