import java.util.Scanner;

public class Atv1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.


        int cont = 0;
        int numero = 0;

        while(cont < 10){
            System.out.print("Insira um Numero");
            numero =  in.nextInt();

            if(numero > 0){
                System.out.println("O Numero informado e positivo.");
            } else if(numero == 0){
                System.out.println("O Numero informado e igual a 0.");
            } else {
                System.out.println("O Numero informado e negativo.");
            }

            
        }
    }
}