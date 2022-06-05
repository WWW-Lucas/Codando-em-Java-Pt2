import java.util.Scanner;

public class Atv24{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um número:");
        double n1 = in.nextDouble();
        in.nextLine();

        System.out.println("Infome outro número:");
        double n2 = in.nextDouble();
        in.nextLine();

        System.out.println("Informe qual operacao sera executada: 1 - Adicao, 2 - Subtracao, 3 - Divisao, 4 - Multiplicacao.");
        int operacao = in.nextInt();

        while(operacao < 1 || operacao > 4){
            
            System.out.println("Informe um valor valido.");
            operacao = in.nextInt();
        
        }

        if(operacao == 1){
            System.out.println("A soma dos valores inseridos e de: " + (n1 + n2));
        } else if(operacao == 2){
            System.out.println("A subtração dos valores inseridos e de: " + (n1 - n2));
        } else if(operacao == 3) {
            System.out.println("A divisão dos valores inseridos e de: " + (n1 / n2));
        } else if(operacao == 4){
            System.out.println("O valor da multiplicação dos numeros inseridos e : " + (n1 * n2));
        } 
    }
}