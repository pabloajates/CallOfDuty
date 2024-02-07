package models;

public class ArmasSecundarias extends Armas{

    private String color;

    public ArmasSecundarias(int espacioMochila, String color) {
        super(espacioMochila);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
