package CalculadoradeSalario;
import java.util.Scanner;

public class Professor {
    Scanner scanner = new Scanner(System.in);
    private String nomeProfessor;
    private double salario;
    private String tipoProfessor;

    public void calcularSalario(String tipoProfessor){
        if(tipoProfessor.equalsIgnoreCase("CLT")){
            System.out.println("Digite o salário mensal do professor: ");
            double salarioMensal = scanner.nextDouble();

            this.tipoProfessor = "Professor CLT";
            this.salario = salarioMensal;

            scanner.close();
            
        } else if(tipoProfessor.equalsIgnoreCase("PJ")){
            System.out.println("Digite o valor do contrato: ");
            double valorContrato = scanner.nextDouble();

            this.tipoProfessor = "Professor PJ";
            this.salario = valorContrato;
            scanner.close();

        } else if(tipoProfessor.equalsIgnoreCase("HORISTA")){ // Regime de pagamento para professor Horista
            ProfessorHorista profhorista = new ProfessorHorista(); 
            System.out.println("Valor da hora: ");
            double valorHora = scanner.nextDouble();
            profhorista.setValorHora(valorHora);
            
            System.out.println("Digite a quantidade de horas trabalhadas: ");           
            double horasTrabalhadas = scanner.nextDouble();
            profhorista.setHorasTrabalhadas(horasTrabalhadas);

            double resposta = profhorista.getHorasTrabalhadas() * profhorista.getValorHora();

            this.salario = resposta;
            this.tipoProfessor = "Professor Horista";
            
            scanner.close();
        }
    }   

    public double getSalario() {
        return salario;
    }

    // get / set NomeFessor
    public String getNomeProfessor() {
        return nomeProfessor;
    }
    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
    
    public String getTipoProfessor() {
        return tipoProfessor;
    }
}


    /* 
    public void calcularSalario(String tipoProfessor, double salarioNovo){

    }
    */

/**


                this.pagamento = "Regime HORISTA";
            System.out.println("Valor Hora: ");
            int n = scanner.nextInt();
            this.salario = n;

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