
import java.util.Scanner;

public class SwithCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int DiaDaSemana = scanner.nextInt();
        switch (DiaDaSemana){
            case 1:
                System.out.println("SEGUNDA!!");
                break;
            case 2:
                System.out.println("TERÇA!!");
                break;
            case 3:
                System.out.println("QUARTA!!");
                break;
            case 4:
                System.out.println("QUINTA!!");
                break;
            case 5:
                System.out.println("SEXTA!!");
                break;
            case 6:
                System.out.println("SABADU!!");
                break;
            case 7:
                System.out.println("DOMINGO!!");
                break;
        }



    }
}
