import java.util.Scanner;

public class Volumecilindro {
    public static void main(String[] args) {
        int raio, altura, num1, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o raio da circunferência");
        raio = sc.nextInt();
        System.out.println("Informe a altura do cilindro");
        altura = sc.nextInt();
        System.out.println("Informe o valor dado a π");
        num1 = sc.nextInt();
        sc.close();
        resultado = raio*altura*num1;
        System.out.println("O volume do cilíndro é:" + resultado);
        }
}
