package CalculadoradeSalario;

public class CalculaSalarioProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.calcularSalario("CLT", 2000);
        System.out.println("Salario do professor: " + professor.getSalario());
    }
}
