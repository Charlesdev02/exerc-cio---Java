import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        System.out.println("Informe um numero");
        int n1 = scanner.nextInt();


        while (contador <= 10){

        System.out.println(n1 + " X " +  contador + " = " + (n1 * contador));
        scanner.close();
        contador ++;
        scanner.close();
    }
}

    }


