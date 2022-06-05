import java.util.Scanner;

public class Atv12{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a nota da primeira avaliação do aluno.");
        double a1 = in.nextDouble();
        in.nextLine();

        System.out.println("Informe a nota da segunda avaliação do aluno.");
        double a2 = in.nextDouble();
        in.nextLine();

        System.out.println("Informe a nota da terceira avaliação do aluno.");
        double a3 = in.nextDouble();
        in.nextLine();

        System.out.println("Informe a nota da quarta avaliação do aluno.");
        double a4 = in.nextDouble();
        in.nextLine();

        double notaMedia = (a1 + a2 + a3 + a4) / 4;

        if(notaMedia >= 6){
            System.out.println("Parabens! Você foi aprovado. A sua media foi: " + notaMedia);
        } else {
            System.out.println("Você não foi aprovado. A sua media é de: " + notaMedia);
        }
    }
}