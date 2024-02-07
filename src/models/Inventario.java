package models;

import java.util.Scanner;

public class Inventario {
    public static Scanner sc = new Scanner(System.in);
    private ArmaPrincipal[] armaPrincipal = new ArmaPrincipal[10];
    private ArmaSecundaria[] armaSecundaria = new ArmaSecundaria[10];
    private Accesorio[] accesorio = new Accesorio[10];

    private Usuario usuario;

    public Inventario() {
    }

    public ArmaPrincipal[] getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(ArmaPrincipal[] armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public ArmaSecundaria[] getArmaSecundaria() {
        return armaSecundaria;
    }

    public void setArmaSecundaria(ArmaSecundaria[] armaSecundaria) {
        this.armaSecundaria = armaSecundaria;
    }

    public Accesorio[] getAccesorio() {
        return accesorio;
    }

    public void setAccesorio(Accesorio[] accesorio) {
        this.accesorio = accesorio;
    }

    public void agregarArmaPrincipal() {
        System.out.println("----------- NUEVA ARMA PRINCIPAL----------");
        ArmaPrincipal principal = new ArmaPrincipal();
        System.out.println("Dame el nombre");
        principal.setNombre(sc.next());
        System.out.println("Dame el tipo");
        principal.setTipo(sc.next());

        boolean agregado = false;

        for (int i = 0; i < armaPrincipal.length; i++) {
            if (armaPrincipal[i] == null) {
                armaPrincipal[i] = principal;
                agregado = true;
                break;
            }
        }
        if (!agregado) {
            System.out.println("Ya tengo lleno el inventario de armas principales");
        }
    }

    public void agregarArmaSecun() {
        System.out.println("----------- NUEVA ARMA SECUNDARIA  ----------");
        ArmaSecundaria secundaria = new ArmaSecundaria();
        System.out.println("Dame el nombre");
        secundaria.setNombre(sc.next());
        System.out.println("Dame el calibre");
        secundaria.setCalibre(sc.next());

        boolean agregado = false;

        for (int i = 0; i < armaSecundaria.length; i++) {
            if (armaSecundaria[i] == null) {
                armaSecundaria[i] = secundaria;
                agregado = true;
                break;
            }
        }

        if (!agregado) {
            System.out.println("Ya tengo lleno el inventario de armas secundarias");
        }
    }

    public void eliminarArmaSecundaria() {
        System.out.println("Dame el nombre del arma a eliminar");
        String nombre = sc.next();
        boolean encontrado = false;

        for (int i = 0; i < armaSecundaria.length; i++) {
            if (armaSecundaria[i].getNombre().equals(nombre)) {
                armaSecundaria[i] = null;
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Esa arma secundaria no la tengo");
        }
    }

    public void agregarAccesorio() {
        System.out.println("----------- NUEVO ACCESORIO ----------");
        Accesorio acce = new Accesorio();
        System.out.println("Dame el nombre");
        acce.setNombre(sc.next());
        System.out.println("Dame el peso");
        acce.setPeso(sc.nextInt());

        boolean agregado = false;

        for (int i = 0; i < accesorio.length; i++) {
            if (accesorio[i] == null) {
                accesorio[i] = acce;
                agregado = true;
                break;
            }
        }

        if (!agregado) {
            System.out.println("Ya tengo lleno el inventario de accesorios");
        }
    }

    public void eliminarAccesorio() {
        System.out.println("Dame el nombre del accesorio a eliminar");
        String nombre = sc.next();
        boolean encontrado = false;

        for (int i = 0; i < accesorio.length; i++) {
            if (accesorio[i].getNombre().equals(nombre)) {
                accesorio[i] = null;
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Ese accesorio no lo tengo no lo tengo");
        }
    }

    public void mostrarInventario() {
        System.out.println("----------------- Armas principales --------------------------");
        for (int i = 0; i < armaPrincipal.length; i++) {
            if (armaPrincipal[i] != null) {
                System.out.println("Nombre: " + armaPrincipal[i].getNombre() + " Tipo: " + armaPrincipal[i].getTipo());
            }
        }
        System.out.println("----------------- Armas secundarias --------------------------");

        for (int i = 0; i < armaSecundaria.length; i++) {
            if (armaSecundaria[i] != null) {
                System.out.println("Nombre: " + armaSecundaria[i].getNombre() + " Calibre: " + armaSecundaria[i].getCalibre());
            }
        }

        System.out.println("-------------------- Accesorios -----------------------");

        for (int i = 0; i < accesorio.length; i++) {
            if (accesorio[i] != null) {
                System.out.println("Nombre: " + accesorio[i].getNombre() + " Peso: " + accesorio[i].getPeso() + "gr");
            }
        }
    }

    public void equipar(Usuario usuario) {

        char otra = ' ';
        do {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que quieres equiparte \n" +
                "1. Arma principal \n" +
                "2. Arma secundaria \n" +
                "3. Accesorios");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Qué arma principal quieres equiparte:");
                String nombreArmaPrincipal = sc.next().toLowerCase();

                boolean armaEncontrada = false;
                for (int i = 0; i < armaPrincipal.length; i++) {
                    if (armaPrincipal[i] != null && armaPrincipal[i].getNombre().equals(nombreArmaPrincipal)) {
                        usuario.setArmaPrincipal(armaPrincipal[i]);
                        armaEncontrada = true;
                        break;
                    }
                }

                if (!armaEncontrada) {
                    System.out.println("No se encontró el arma principal especificada en el inventario.");
                }
                break;
            case 2:
                System.out.println("Qué arma secundaria quieres equiparte:");
                String nombreArmaSecundaria = sc.next().toLowerCase();
                boolean armaSecundariaEncontrada = false;
                for (int i = 0; i < armaSecundaria.length; i++) {
                    if (armaSecundaria[i] != null && armaSecundaria[i].getNombre().equals(nombreArmaSecundaria)) {
                        usuario.setArmaSecundaria(armaSecundaria[i]);
                        armaSecundariaEncontrada = true;
                        break;
                    }
                }

                if (!armaSecundariaEncontrada) {
                    System.out.println("No se encontró el arma secundaria especificada en el inventario.");
                }
                break;
            case 3:
                System.out.println("¿Quieres equipar accesorios? (S/N)");
                char respuesta = sc.next().charAt(0);
                if (respuesta == 'S' || respuesta == 's') {
                    do {
                        System.out.println("Dame el nombre del accesorio: ");
                        String nombreAccesorio = sc.next();
                        boolean accesorioEncontrado = false;
                        for (int i = 0; i < accesorio.length; i++) {
                            if (accesorio[i] != null && accesorio[i].getNombre().equals(nombreAccesorio)) {
                                usuario.agregarAccesorio(accesorio[i]);
                                accesorioEncontrado = true;
                                break;
                            }
                        }
                        if (!accesorioEncontrado) {
                            System.out.println("El accesorio especificado no se encuentra en el inventario.");
                        }
                        System.out.println("¿Quieres equipar otro accesorio? (S/N)");
                        respuesta = sc.next().charAt(0);
                    } while (respuesta == 'S' || respuesta == 's');
                }
                break;
        }
        System.out.println("Agregamos otro arma/accesorio  s/n");
        otra = sc.next().charAt(0);
        } while (otra != 'n');
    }

    public void desEquipar(Usuario usuario) {

        char otra = ' ';
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Que quieres desequiparte \n" +
                    "1. Arma principal \n" +
                    "2. Arma secundaria \n" +
                    "3. Accesorios");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    if(usuario.getArmaPrincipal() != null) {
                        usuario.setArmaPrincipal(null);
                        System.out.println("Arma principal desequipada con exito");
                    } else {
                        System.out.println("No puedo quitarte ese arma porque no tienes niguna equipada");
                    }
                    break;
                case 2:
                    if(usuario.getArmaSecundaria() != null) {
                        usuario.setArmaSecundaria(null);
                        System.out.println("Dame el nombre del accesorio que desequipar: ");
                    } else {
                        System.out.println("No puedo quitarte ese arma porque no tienes niguna equipada");
                    }

                    break;
                case 3:
                        System.out.println("Dame el nombre del accesorio que desequipar: ");
                        String nombreAccesorio = sc.next();
                        boolean accesorioEncontrado = false;
                        for (int i = 0; i < accesorio.length; i++) {
                            if (accesorio[i] != null && accesorio[i].getNombre().equals(nombreAccesorio)) {
                                usuario.agregarAccesorio(null);
                                accesorioEncontrado = true;
                                break;
                            }
                        }
                        if (!accesorioEncontrado) {
                            System.out.println("El accesorio especificado no se encuentra equipado");
                        }
                break;
            }
            System.out.println("Quieres desequipar otro arma/accesorio  s/n");
            otra = sc.next().charAt(0);
        } while (otra != 'n');
    }
}