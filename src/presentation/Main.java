package presentation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int option= 0;

        do {
            System.out.println("------------------------------");
            System.out.println("|       MENU PRINCIPAL       |");
            System.out.println("------------------------------");
            System.out.println("| 1. Open inventory          |");
            System.out.println("| 2. Add a weapon            |");
            System.out.println("| 3. Add accessories         |");
            System.out.println("| 4. Equip on character      |");
            System.out.println("| 5. Exit                    |");
            System.out.println("------------------------------");
            System.out.println("|  Write the option number.  |");
            System.out.println("------------------------------");

            option = sc.nextInt();

            switch (option) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    exit = true;
                    break;


            }

        }while(exit);


    }

}