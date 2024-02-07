package presentation;

import models.Inventario;
import models.Usuario;

public class Main {
    public static void main(String[] args){

        Inventario inventario = new Inventario();
        Usuario user = new Usuario("Pedro", 8);

    inventario.agregarArmaPrincipal();

    inventario.agregarArmaSecun();

    inventario.agregarAccesorio();
    inventario.agregarAccesorio();
    inventario.agregarAccesorio();
    inventario.agregarAccesorio();

    inventario.mostrarInventario();

    inventario.equipar(user);

    user.verObjetosEquipados();

    }
}