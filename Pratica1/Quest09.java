/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 9 
*/

/** 
Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9).

**/

package Pratica1;

import java.util.Scanner;
public class Quest09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura (graus Fahrenheit): ");
        double grausFahrenheit = scanner.nextDouble();
        scanner.close();
        
        double grausCelcius = 5 * ((grausFahrenheit-32) / 9);

        System.out.printf("Convertendo %.1f graus Fahrenheit para Celcius fica: %.1f" , grausFahrenheit, grausCelcius);
    }
}
