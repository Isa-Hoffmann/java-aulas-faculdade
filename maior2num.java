import java.util.Scanner;

public class maior2num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double num1 = 0.0, num2 = 0.0, resultado;

        System.out.println("Digite o primeiro número");
        num1 = sc.nextDouble();

        System.out.println("Digite o segundo número");
        num2 = sc.nextDouble();

        if ( num1 < num2 ){
            System.out.println("O maior número é o segundo : " + num2);
        }else if (num1 == num2){
            System.out.println("Os números são iguais");
        }else{
            System.out.println("O maior número é o primeiro : " + num1);
        }
    }    
 }
    
