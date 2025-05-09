import java.util.Locale;
import java.util.Scanner;

public class AC {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        sc.useLocale(Locale.US);
        double AC1 = 0.0, AC2 = 0.0, AG = 0.0, AF = 0.0, media = 0, notaMinima = 0;

        System.out.println("Digite a nota da AC1");
        AC1 = sc.nextDouble();

        System.out.println("Digite a nota da AC2");
        AC2 = sc.nextDouble();

        System.out.println("Digite a nota da AG");
        AG = sc.nextDouble();

        System.out.println("Digite a nota da AF");
        AF = sc.nextDouble();

        media = (AC1 * 0.15) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.45);
        System.out.println("Média: " + media);

        System.out.println("Notas digitadas: AC1 = " + AC1 + ", AC2 = "+ AC2 + ", AG = " + AG +", AF = " + AF);
        

        System.out.println("Digite a nota mínima para a aprovação");
        notaMinima = sc.nextDouble();
        
       System.out.println("Média do aluno: " + media + " | Nota mínima para aprovação: " + notaMinima); 
        if (media >= notaMinima) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }

}
}
