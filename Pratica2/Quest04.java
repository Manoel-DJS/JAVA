/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 4 - Visualizar Dados
* Data: 16 / 04 / 2023
*/
package Pratica2;
import java.util.Scanner;

public class Quest04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite seu nome: "); 
        String nome = ler.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = ler.nextLine();
        
        System.out.println("Digite sua idade(anos): ");
        String idade = ler.nextLine();

        System.out.println("De onde você é(naturalidade): ");
        String naturalidade = ler.nextLine();

        // Soluçando
        System.out.println("Deseja visualizar os dados completos? ");
        String validar = ler.nextLine();
        if(validar.equalsIgnoreCase("S")){
            System.out.println("Dados Completos: ");
            System.out.println("Nome Completo: " + nome + " " + sobrenome + " || Idade: " + idade + " || Nascido: " + naturalidade);
        } else if(validar.equalsIgnoreCase("N")){
            System.out.println("Seus dados: ");
            System.out.println("Nome: " + nome + " || idade: " + idade);
        } else{
            System.out.println("ERROR! caractere informado invalido! Digite apenas 'S' ou 'N'");
        }
    }
}
