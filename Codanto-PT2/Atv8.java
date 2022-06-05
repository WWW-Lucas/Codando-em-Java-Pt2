import java.util.Scanner;

public class Atv8{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int cont = 0;
        int numeros = 0;
        while(cont < 10){
            System.out.println("Informe um valor");
            numeros += in.nextInt();
            cont++;
        }
        System.out.println(numeros);
    }
}