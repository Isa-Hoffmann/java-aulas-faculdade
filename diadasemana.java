import java.util.Scanner;
 /*faça um algoritmo que solicita um número de 1 a 7
         representando um dia da semana e informe o nome do dia correspondente*/

public class diadasemana{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int diadasemananum = 0;

        System.out.println("Digite o número referente ao dia da semana");
        diadasemananum = sc.nextInt();

        switch (diadasemananum) {
            case 1 :
                System.out.println("Domingo");
                break;

            case 2 :
                System.out.println("Segunda-Feira");
                break;

            case 3 :
                System.out.println("Terça-Feira");
                break;

            case 4 :
                System.out.println("Quarta-Feira");
                break;

            case 5 :
                System.out.println("Quinta-feira");
                break;

            case 6 :
                System.out.println("Sexta-Feira");
                break;

            case 7 :
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Apenas 7 dias na semana");
                break;
        }
         
    }
}