package CalculadoradeSalario;
import java.util.Scanner;

public class Professor {
    Scanner scanner = new Scanner(System.in);
    private String nomeProfessor;
    private double salario;
    private String pagamento;

    /* 
    public void calcularSalario(String tipoProfessor, double salarioNovo){

    }
    */
    public void calcularSalario(String tipoProfessor){
        if(tipoProfessor.equalsIgnoreCase("CLT")){
            this.pagamento = "Pagamento Mensal";

        } else if(tipoProfessor.equalsIgnoreCase("PJ")){
            this.pagamento = "Pagamento por contrato";

        } else if(tipoProfessor.equalsIgnoreCase("HORISTA")){
            this.pagamento = "Regime HORISTA";
            System.out.println("Valor Hora: ");
            int n = scanner.nextInt();
            this.salario = n;
            

        }
    }   
    public double getSalario() {
        return salario;
    }
    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public void calcularSalarioPJ(){

    }

    public void calcularSalarioHorista(){

    }
}

/**

    public void calcularSalario(String tipoProfessor, double salarioNovo){
        if(tipoProfessor.equalsIgnoreCase("CLT")){
            if(salarioNovo < 1903.98){
                System.out.println("Isento de imposto");
                this.salario = salarioNovo;
            } else if(salarioNovo > 1903.98 && salarioNovo <= 2826.65){
                System.out.println("Alíquota imposto é de 7,5%");
                this.salario = salarioNovo - salarioNovo*0.075;
            } else if(salarioNovo )
        } else if(tipoProfessor.equalsIgnoreCase("PJ")){

        } else if(tipoProfessor.equalsIgnoreCase("HORISTA")){

        }
    }

**/