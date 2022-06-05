import java.util.Scanner;

public class Atv3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        
       for(int cont = 0; cont <3; cont++ ){
           if(cont == 0 ){
               System.out.println("Insira um Numero");
               n1 = in.nextInt();
           } else if(cont == 1){
               System.out.println("Insira um Numero");
                   n2 = in.nextInt();
           } else {
               System.out.println("Insira um Numero");
               n3 = in.nextInt();
           }
       }
       if(n1 > n3 && n2 > n3){
           System.out.println("A soma dos 2 maiores numeros e de: " + (n1+n2));
       } else if(n1 > n2 && n3 > n2){
           System.out.println("A soma dos 2 maiores e de: " + (n1 + n3));
       } else if(n2 > n1 && n3 > n1){
           System.out.println("A soma dos 2 maiores numeros e de: " + (n2 + n3));
       }
       
    }
}