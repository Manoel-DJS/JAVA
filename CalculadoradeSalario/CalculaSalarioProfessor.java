package CalculadoradeSalario;
import java.util.Scanner;

public class CalculaSalarioProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.calcularSalario("horista");

        System.out.println("Salario do professor: " + professor.getSalario());


    }
}
