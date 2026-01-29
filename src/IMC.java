import java.util.Scanner;


public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso: ");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("IMC: Peso ideal");

        } else if (imc >= 25 && imc < 30) {
            System.out.println("IMC: Sobre Peso");
        } else if (imc >= 30 && imc < 40) {
            System.out.println("IMC: Oesidade");

        } else {
            System.out.println("IMC: Obesidade Mórbida");

        }

    }

    }






