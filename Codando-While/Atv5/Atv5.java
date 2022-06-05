import java.util.Scanner;

    public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).

        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;

        int soma = 0;

       

        for(int cont = 0; cont < 4; cont++){
            if(cont == 0){
                System.out.println("Insira a nota da primeira avaliação.");
                a1 = in.nextInt();
                soma += a1;
            } else if(cont == 1){
                System.out.println("Insira a nota da segunda avaliação.");
                a2 = in.nextInt();
                soma += a2;
            } else if(cont == 2){
                System.out.println("Insira a nota da terceira avaliação.");
                a3 = in.nextInt();
                soma += a3;
            } else {
                System.out.println("Insira a nota da quarta avaliação.");
                a4 = in.nextInt();
                soma += a4;
            }
        }
        int media = (soma / 4);

        if(media >= 6){
            System.out.println("Parabens, você foi aprovado!");
        } else {
            System.out.println("Voce foi reprovado.");
        }

        
    }
}