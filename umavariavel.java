import java.util.Scanner;

public class umavariavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = 0;

        System.out.println("Digite o primeiro número");
        num = scanner.nextDouble();

        System.out.println("Digite o segundo valor");
        num = num + scanner.nextDouble();

        System.out.println("Digite o terceiro número");
        num = (num + scanner.nextDouble()) / 3;

       // num = num/3;
    
    }
}