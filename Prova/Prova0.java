/** 

Manoel Vinicius Silva Souza
Ra: 722315125

**/

package Prova;
import java.util.Scanner;

public class Prova0 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        // Req01
        System.out.println("Digite a placa do veículo: ");
        String placaVeiculo = scanner.nextLine();

        // Req02
        System.out.println("Digite o preço do combustível: ");
        double litroCombustivel = scanner.nextDouble();

        // Req03
        System.out.println("Digite a quantidade de quilometros rodados a 60km/h: ");
        double KM60 = scanner.nextDouble();

        // Req04
        System.out.println("Digite a quantidade de quilometros rodados a 80km/h: ");
        double KM80 = scanner.nextDouble();
        
        // Req05
        System.out.println("Digite a quantidade de quilometros rodados a 100km/h: ");
        double KM100 = scanner.nextDouble();

        // Req06
        System.out.println("Digite a quantidade de quilometros rodados a 120km/h: ");
        double KM120 = scanner.nextDouble();

        // Req07
        System.out.println("Digite a quantidade de quilometros rodados a 140km/h: ");
        double KM140 = scanner.nextDouble();

        scanner.close();

        // Processamento
        // Req08
        double combustivelGasto60 = (KM60 / 30.7);
        double combustivelGasto80 = (KM80 / 26.8);
        double combustivelGasto100 = (KM100 / 22.4);
        double combustivelGasto120 = (KM120 / 18.1);
        double combustivelGasto140 = (KM140 / 14.5);

        // Req09
        double quantidadeTotalC = combustivelGasto60 + combustivelGasto80 + combustivelGasto100 + combustivelGasto120 + combustivelGasto140;

        // Req10
        double C = 0;
        if(KM60 != 0){
            C+=1;
        }
        if(KM80 != 0){
            C+=1;
        }
        if(KM100 != 0){
            C+=1;
        }
        if(KM120 != 0){
            C+=1;
        }
        if(KM140 != 0){
            C+=1;
        }
        double mediaPonderada;
        if(KM60 != 0 && KM80 != 0 && KM100 != 0 && KM120 != 0 && KM140 != 0){
             mediaPonderada = ((KM60) + (KM80) + (KM100) + (KM120) + (KM140)) / C;
        } else{
             mediaPonderada = ((KM60*0.6) + (KM80*0.8) + (KM100*1) + (KM120*1.2) + (KM140*1.4)) / C;
        }
        
        // Req11
        double custoTotal = quantidadeTotalC * litroCombustivel;
        System.out.println(custoTotal);
        
        //Saídas
        // Req12
        System.out.printf("Placa do veículo: %s \n", placaVeiculo);
        
        // Req13
        System.out.printf("Valor total: R$%.2f \n", custoTotal);

        // Req14
        System.out.printf("Velocidade média ponderada:  %.4f Km/h \n", mediaPonderada);

        // Req15
        System.out.printf("Consumo total: %.4f litros \n", quantidadeTotalC);

        // Req16
        // https://github.com/Manoel-DJS/JAVA/blob/main/Prova/Prova0.java
    }
}
