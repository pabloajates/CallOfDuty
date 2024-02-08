package presentation;

import models.Inventario;
import models.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Inventario inventario = new Inventario();
        Usuario user = new Usuario("Pedro", 8);
        boolean exit = false;

        do {
            System.out.println("--------------------------------");
            System.out.println("|       MENU PRINCIPAL         |");
            System.out.println("--------------------------------");
            System.out.println("| 1. Ver inventario            |");
            System.out.println("| 2. Añadir arma principal     |");
            System.out.println("| 3. Añadir arma secundaria    |");
            System.out.println("| 4. Añadir accesorios         |");
            System.out.println("| 5. Eliminar armas/accesorios |");
            System.out.println("| 6. Equipar al usuario        |");
            System.out.println("| 7. Desequipar al usuario     |");
            System.out.println("| 8. Ver armas equipadas       |");
            System.out.println("| 9. Exit                      |");
            System.out.println("--------------------------------");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    inventario.mostrarInventario();
                    break;
                case 2:
                    inventario.agregarArmaPrincipal();
                    break;
                case 3:
                    inventario.agregarArmaSecun();
                    break;
                case 4:
                    inventario.agregarAccesorio();
                    break;
                case 5:
                    System.out.println("Que arma quieres eliminar \n" +
                            "1. Arma principal \n" +
                            "2. Arma secundaria \n" +
                            "3. Accesorios");
                    int eliminar = sc.nextInt();
                    switch (eliminar){
                        case 1:
                            inventario.eliminarArmaPrincipal();
                            break;
                        case 2:
                            inventario.eliminarArmaSecundaria();
                            break;
                        case 3:
                            inventario.eliminarAccesorio();
                            break;
                        default:
                            System.out.println("Ese arma/accesorio no lo tenemos");
                            break;
                    }
                    break;
                case 6:
                    inventario.equipar(user);
                    break;
                case 7:
                    inventario.desEquipar(user);
                    break;
                case 8:
                    user.verObjetosEquipados();
                    break;
                case 9:
                    exit = true;
            }
        } while (!exit);
    }
}