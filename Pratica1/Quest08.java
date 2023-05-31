/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 8 
*/

/**
Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

**/ 

package Pratica1;

import java.util.Scanner;
public class Quest08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa Horas Trabalhadas no Mês");

        // Entrada de Dados 
        System.out.println("Digite quanto você ganha por hora: ");
        double salarioHora = scanner.nextDouble();
        System.out.println("Quantas horas você trabalhou neste mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        scanner.close();

        // Processamento
        double salario = calcularSalario(salarioHora, horasTrabalhadas);
        
        // Saída
        System.out.printf("Seu salário é: %.2f \n", salario);

    }

    private static double calcularSalario(double sHora, double htrabalhada) {
        double resultado = 0;
        resultado = sHora*htrabalhada;
        return resultado;
    }
}
