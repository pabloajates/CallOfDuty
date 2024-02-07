package presentation;

import models.Inventario;
import models.Usuario;

public class Main {
    public static void main(String[] args){

        Inventario inventario = new Inventario();
        Usuario user = new Usuario("Pedro", 8);

    inventario.agregarArmaPrincipal();
    inventario.agregarArmaPrincipal();
    

    inventario.mostrarInventario();

    inventario.equipar(user);

    user.verObjetosEquipados();

    inventario.desEquipar(user);

    user.verObjetosEquipados();

    }
}