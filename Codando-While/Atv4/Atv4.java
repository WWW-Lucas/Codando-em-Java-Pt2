import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;

        int soma = 0;

        for(int cont = 0; cont<=10; cont++){
            if(cont == 1){
                System.out.print("Insira um Numero");
                n1 = in.nextInt();
                soma += n1;
            }else if(cont == 2){
                System.out.print("Insira um Numero");
                n2 = in.nextInt();
                soma += n2;
            }else if(cont == 3){
                System.out.print("Insira um Numero");
                n3 = in.nextInt();
                soma += n3;
            }else if(cont == 4){
                System.out.print("Insira um Numero");
                n4 = in.nextInt();
                soma += n4;
            }else if(cont == 5){
                System.out.print("Insira um Numero");
                n5 = in.nextInt();
                soma += n5;
            }else if(cont == 6){
                System.out.print("Insira um Numero");
                n6 = in.nextInt();
                soma += n6;
            }else if(cont == 7){
                System.out.print("Insira um Numero");
                n7 = in.nextInt();
                soma += n7;
            }else if(cont == 8){
                System.out.print("Insira um Numero");
                n8 = in.nextInt();
                soma += n8;
            }else if(cont == 9){
                System.out.print("Insira um Numero");
                n9 = in.nextInt();
                soma += n9;
            }else if(cont == 10){
                System.out.print("Insira um Numero");
                n10 = in.nextInt();
                soma += n10;
            }
        }

        System.out.println("A soma de todos os Numeros informados e: " + soma + ", a media aritimética destes números e: " + (soma/10));
    }
}