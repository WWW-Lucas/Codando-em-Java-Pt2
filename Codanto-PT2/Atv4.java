import java.util.Scanner;

public class Atv4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

        System.out.println("Informe um valor.");
        int n1 = in.nextInt();
        in.nextLine();

        System.out.println("Informe outro valor.");
        int n2 = in.nextInt();
        in.nextLine();

        System.out.println("Informe mais um valor.");
        int n3 = in.nextInt();
        
        if(n1 > n2 && n3 > n2){
            System.out.println("A soma dos 2 maiores valores informados  é de: " + (n1 + n3));
        } else if(n1 > n3 && n2 > n3){
            System.out.println("A soma dos 2 maiores valores informados  é de: " + (n1 + n2));
        } else {
            System.out.println("A soma dos 2 maiores valores informados  é de: " + (n2 + n3));
        }
    }
}