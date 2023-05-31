/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 15
*/

/** 
Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.

**/

package Pratica1;
import java.util.Scanner;

public class Quest15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa Calcular Descontos");
        
        // Entrada de dados
        System.out.println("Quanto você ganha por hora: ");
        double sHora = scanner.nextDouble();

        System.out.println("Quantas horas você trabalhou esse mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        scanner.close();

        double salarioBruto = sHora * horasTrabalhadas;
        double IR = salarioBruto * 0.11;
        double INSS = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double descontos = IR + INSS + sindicato;

        System.out.printf("Seu Salario Bruto: R$%.2f reais \n", salarioBruto);
        System.out.printf("O IR: R$%.2f reais \n", IR);
        System.out.printf("Quanto pagou ao INSS: R$%.2f reais \n", INSS);
        System.out.printf("Quanto pagou ao Sindicato: R$%.2f reais \n", sindicato);
        System.out.printf("Seu Salário Líquido: R$%.2f reais \n", (salarioBruto-descontos));
    }
}
