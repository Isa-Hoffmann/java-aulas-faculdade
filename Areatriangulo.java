import java.util.Scanner;

public class Areatriangulo{
    public static void main (String[] agrs) {
        int base, altura, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println
        ("Informe a medida da base:");
        base = sc.nextInt();
        System.out.println
        ("Informe a altura:");
        altura = sc.nextInt();
        sc.close();
        resultado = (base*altura) / 2;
        System.out.println("A área do triãngulo é:" + resultado);



    
    }
    
}
