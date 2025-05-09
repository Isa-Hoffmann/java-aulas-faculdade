import java.util.Scanner;

public class Somanumeros{
    /**
     * @param args
     */
    public static void main (String[] args) {
        int num1, num2, num3, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.println
        ("Informe o primeiro número inteiro");
        num1 = sc.nextInt();

        System.out.println
        ("Informe o segundo número inteiro");
        num2 = sc.nextInt();

        System.out.println
        ("Informe o segundo número inteiro");
        num3 = sc.nextInt();
        sc.close();
        resultado = num1 + num2 + num3;
        
        System.out.println("A soma dos números é:" + resultado);
    }
}
        


