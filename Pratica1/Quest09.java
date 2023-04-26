package Pratica1;

import java.util.Scanner;
public class Quest09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura (graus Fahrenheit): ");
        double grausFahrenheit = scanner.nextDouble();
        scanner.close();
        
        double grausCelcius = 5 * ((grausFahrenheit-32) / 9);

        System.out.printf("Convertendo %.2f graus Fahrenheit para Celcius fica: %.2f" , grausFahrenheit, grausCelcius);
    }
}
