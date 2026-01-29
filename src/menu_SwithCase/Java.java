package menu_SwithCase;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o codico do produto: ");
        int menu = scanner.nextInt();
        switch (menu){
            case 101:
                System.out.println("Cachorro quente: 20 R$");
                break;
            case 102:
                System.out.println("Pastel: 30 R$ ");
                break;
            case 103:
                System.out.println("Coxinha 40 R$ ");
                break;
        }
    }
}
