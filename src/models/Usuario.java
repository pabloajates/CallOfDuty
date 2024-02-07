package models;

public class Usuario {

    private String nombre;
    private int espaciosMochila;
    private ArmaPrincipal armaPrincipal;
    private ArmaSecundaria armaSecundaria;
    private Accesorio[] accesorio = new Accesorio[3];

    public Usuario(String nombre, int espaciosMochila, ArmaPrincipal armaPrincipal, ArmaSecundaria armaSecundaria) {
        this.nombre = nombre;
        this.espaciosMochila = espaciosMochila;
        this.armaPrincipal = armaPrincipal;
        this.armaSecundaria = armaSecundaria;
    }

    public Usuario(String nombre, int espaciosMochila) {
        this.nombre = nombre;
        this.espaciosMochila = espaciosMochila;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEspaciosMochila() {
        return espaciosMochila;
    }

    public void setEspaciosMochila(int espaciosMochila) {
        this.espaciosMochila = espaciosMochila;
    }

    public ArmaPrincipal getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(ArmaPrincipal armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public ArmaSecundaria getArmaSecundaria() {
        return armaSecundaria;
    }

    public void setArmaSecundaria(ArmaSecundaria armaSecundaria) {
        this.armaSecundaria = armaSecundaria;
    }

    public Accesorio[] getAccesorio() {
        return accesorio;
    }

    public void setAccesorio(Accesorio[] accesorio) {
        this.accesorio = accesorio;
    }

    public void agregarAccesorio(Accesorio nuevoAccesorio) {
        boolean lleno = true;
        for (int i = 0; i < accesorio.length; i++) {
            if (accesorio[i] == null) {
                accesorio[i] = nuevoAccesorio;
                System.out.println("Se agregó el accesorio '" + nuevoAccesorio.getNombre());
                lleno = true;
                break;
            } else {
                lleno = false;
            }
        }
        if (!lleno){
            System.out.println("Ya no entran mas accesorios");
        }


    }

    public void verObjetosEquipados() {
        System.out.println("--------- Arma principal ----------");
        if (armaPrincipal != null) {

            System.out.println("Nombre: " + armaPrincipal.getNombre() + " Tipo: " + armaPrincipal.getTipo());
        } else {
            System.out.println("Todavía no tienes un arma principal");
        }

        System.out.println("--------- Arma secundaria ----------");
        if (armaSecundaria != null) {
            System.out.println("Nombre: " + armaSecundaria.getNombre() + " Calibre: " + armaSecundaria.getCalibre());
        } else {
            System.out.println("Todavía no tienes un arma secundaria");
        }

        System.out.println("--------- Accesorios ----------");
        boolean accesoriosEquipados = false;
        for (int i = 0; i < accesorio.length; i++) {
            if (accesorio[i] != null) {
                System.out.println("Nombre: " + accesorio[i].getNombre() + " Peso: " + accesorio[i].getPeso());
                accesoriosEquipados = true;
            }
        }
        if (!accesoriosEquipados) {
            System.out.println("No tienes ningún accesorio equipado");
        }
    }
}
