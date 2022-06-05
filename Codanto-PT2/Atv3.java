import java.util.Scanner;

public class Atv3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

        System.out.println("Informe um valor.");
        int n1 = in.nextInt();
        in.nextLine();

        System.out.println("Informe outro valor.");
        int n2 = in.nextInt();
        in.nextLine();

        System.out.println("Informe mais um valor.");
        int n3 = in.nextInt();
        
        if(n1 > n2 && n1 > n3){
            System.out.println("O primeiro número é o maior informado." + n1);
        } else if( n2 > n1 && n2 > n3){
            System.out.println("O segundo número é o maior informado." + n2);
        } else {
            System.out.println("O terceiro número é o maior informado." + n3);
        }
    }
}