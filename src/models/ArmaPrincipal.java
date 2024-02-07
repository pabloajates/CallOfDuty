package models;

public class ArmaPrincipal extends Arma {

    private String nombre;
    private String tipo;

    public ArmaPrincipal(int espacioMochila, String tipo, String nombre) {
        super(espacioMochila);
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public ArmaPrincipal() {

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
