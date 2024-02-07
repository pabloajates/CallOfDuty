package models;

public class ArmaPrincipal extends Armas{

    private String tipo;

    public ArmaPrincipal(int espacioMochila, String tipo) {
        super(espacioMochila);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
