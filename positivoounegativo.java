import java.util.Scanner;

public class positivoounegativo {
    public static void main(String []args){
        //  Escreva um algoritmo que recebe um número e informa se é positivo, negativo ou zero

        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Qual o número?");
        num = sc.nextInt();

        if(num > 0){
            System.out.println("O número " + num + " é positivo");

        if( num < 0) {
            System.out.println("O número " + num + " é positivo");

        if(num == 0){
            System.out.println("O número é zero");
            
        }
        }
    
        } 

    
    }
}
