package CalculadoradeSalario;
import java.util.Scanner;

public class CalculaSalarioProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Professor professor = new Professor();

        System.out.println(" *Programa Calcula Sálario Professor* \n");

        System.out.println("Digite o nome do professor: ");
        String nomeProfessor = scanner.nextLine();

        professor.setNomeProfessor(nomeProfessor); // Alterando nome na classe

        System.out.println("Digite o regime de pagamento (CLT, Horista ou PJ): ");
        String regimePagamento = scanner.nextLine();
        professor.calcularSalario(regimePagamento);
        
        scanner.close();

        System.out.println("\n " + professor.getNomeProfessor());
        System.out.println(professor.getTipoProfessor() + " // Seu salário é: R$" + professor.getSalario());

    }
}
