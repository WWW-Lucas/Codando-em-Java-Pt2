import java.util.Scanner;

public class Atv2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

        System.out.println("Informe um número");
        int numero = in.nextInt();

        if(numero == 0){
            System.out.println("O número informado corresponde a 0.");
        } else if(numero > 0) {
            System.out.println("O número informado é um número positivo.");
        } else if(numero < 0){
            System.out.println("O número informado é um número negativo.");
        }
    }
}