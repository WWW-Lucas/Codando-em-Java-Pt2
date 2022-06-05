import java.util.Scanner;

public class Atv1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Escreva um programa em que o usuário informe dois números utilizando o "prompt". Então escreva em tela o maior deles.

        System.out.println("Informe um número");
        int n1 = in.nextInt();
        in.nextLine();

        System.out.println("Informe outro número");
        int n2 = in.nextInt();
        
        if(n1>n2){
            System.out.println("O primeiro número é o maior informado. " + n1);
        } else {
            System.out.println("O segundo número é o maior informado. " + n2);
        }
    }
}