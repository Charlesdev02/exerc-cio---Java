import java.util.Scanner;

public class calculo {


        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Informe seu nome:");
            String nome = scanner.nextLine();
            System.out.println("SEXO: [M / H] ");
            String sexo = scanner.nextLine();
            System.out.println("Qual o vslor da compra:");
            double produto = scanner.nextDouble();
            if(sexo.equals("M")){
                double desconto = produto * 13/100;
                System.out.println("Total a pagar $: " + desconto);
            } else if (sexo.equals("H")) {
                double desconto_H = produto * 5/100;
                System.out.println("total a pagar $: " + desconto_H);

            }
            else {
                System.out.println("Compra invalida" );
            }

        }
    }


