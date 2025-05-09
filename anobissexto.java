import java.util.Scanner;

public class anobissexto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // desenvolva um programa que pede um ano e determina se ele é bissexto ou não

        int ano = 0;
        boolean condicao1 = ano % 4 == 0;
        boolean condicao2 = ano % 100 != 0;
        boolean condicao3 = ano % 400 == 0;

        System.out.println("Qual o ano?");
        ano = sc.nextInt();
         

        if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            System.out.println("Bissexto");
        }else{
            System.out.println("Não Bissexto");

        }

    }
}
