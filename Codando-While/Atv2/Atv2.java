import java.util.Scanner;

public class Atv2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

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
       if(n1 > n2 && n1 > n3){
           System.out.println("O primeiro Numero inserido e o maior.");
       } else if(n2 > n1 && n2 > n3){
           System.out.println("O segundo Numero inserido e o maior.");
       } else {
           System.out.println("O terceiro Numero e o maior");
       }
       
    }
}