import java.util.Scanner;

public class operação2num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double  num1 = 0.0, num2 = 0.0, resultado = 0.0 ;
        String operaçao;

        System.out.println("digite o primeiro número");
        num1 = sc.nextDouble();
    
        System.out.println("digite o segundo número");
        num2 = sc.nextDouble();

        System.out.println("Informe a operação desejada");
        operaçao = sc.next();

        {
            if (operaçao.equals("+")){
            resultado = num1 + num2;
        }
            if (operaçao.equals("-")){
            resultado = num1 - num2;
        }
            if (operaçao.equals("*")){
            resultado = num1 * num2;
        }
            if (operaçao.equals("/")){
            resultado = num1 / num2;
        }

        System.out.println("Resultado: " + resultado);


        }
    }
    
}
