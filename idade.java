import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 0;

        System.out.println("Digite a idade desejada");
        idade = sc.nextInt();

        if (idade <= 11){
            System.out.println("Criança");
        }
         else if (idade <= 18){
            System.out.println("Adolescente");
        }
        else if (idade <= 59){
            System.out.println("Adulto");
        }
     else { 
        System.out.println("Idoso");
     }
    }
}