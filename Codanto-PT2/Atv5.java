import java.util.Scanner;

public class Atv5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Faça um programa que leia dois valores informados pelo usuário e exiba uma das três mensagens a seguir: ‘Números iguais’, caso os números sejam iguais ‘Primeiro é maior’, caso o primeiro seja maior que o segundo; ‘Segundo maior’, caso o segundo seja maior que o primeiro.

        System.out.println("Informe um número.");
        int n1 = in.nextInt();
        in.nextLine();

        System.out.println("Informe outro número.");
        int n2 = in.nextInt();
        
        if(n1 == n2){
            System.out.println("Os números informados são iguais.");
        } else if(n1 > n2) {
            System.out.println("O primeiro número informado é o maior.");
        } else {
            System.out.println("O segundo número informado é o maior.");
        }
    }
}