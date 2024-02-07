package models;

public class Accesorio {

    private String nombre;
    private int peso;

    private int espacioMochila;

    public Accesorio(String nombre, int peso, int espacioMochila) {
        this.nombre = nombre;
        this.peso = peso;
        this.espacioMochila = espacioMochila;
    }

    public Accesorio() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEspacioMochila() {
        return espacioMochila;
    }

    public void setEspacioMochila(int espacioMochila) {
        this.espacioMochila = espacioMochila;
    }
}
