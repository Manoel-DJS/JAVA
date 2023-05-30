package CalculadoradeSalario;

public class Professor {
    private String nomeProfessor;
    private double salario;

    public void calcularSalario(String tipoProfessor, double salarioNovo){
        if(tipoProfessor.equalsIgnoreCase("CLT")){
            if(salarioNovo < 1903.98){
                System.out.println("Isento de imposto");
                this.salario = salarioNovo;
            } else if(salarioNovo > 1903.98 && salarioNovo <= 2826.65){
                System.out.println("Alíquota imposto é de 7,5%");
                this.salario = salarioNovo - salarioNovo*0.075;
            }
        } else if(tipoProfessor.equalsIgnoreCase("PJ")){

        } else if(tipoProfessor.equalsIgnoreCase("HORISTA")){

        }
    }

    public double getSalario() {
        return salario;
    }

    public void calcularSalarioPJ(){

    }

    public void calcularSalarioHorista(){

    }
}
