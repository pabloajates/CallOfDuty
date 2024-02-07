package models;

public class ArmaSecundaria extends Arma {

    private String nombre;
    private String calibre;

    public ArmaSecundaria(int espacioMochila, String calibre, String nombre) {
        super(espacioMochila);
        this.calibre = calibre;
        this.nombre = nombre;
    }
    public ArmaSecundaria() {

    }

    public String getCalibre() {
        return calibre;
    }

    public void setCalibre(String calibre) {
        this.calibre = calibre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
