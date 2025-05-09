import java.util.Scanner;

public class Media{
    public static void main (String[] args) {
        int num1, num2, num3, num4, num5, resultado;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número:");
        num1 = sc.nextInt();

        System.out.println("Informe o segundo número:");
        num2= sc.nextInt();

        System.out.println("Informe o terceiro número:");
        num3 = sc.nextInt();

        System.out.println("Informe o quarto número:");
        num4 = sc.nextInt();

        System.out.println("Informe o quinto número:");
        num5 = sc.nextInt();
        sc.close();

        resultado = (num1+num2+num3+num4+num5) / 5;
        System.out.println("A média dos números é:" + resultado);
    }
}



        

    

