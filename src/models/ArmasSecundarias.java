package models;

public class ArmasSecundarias extends Armas{

    private String calibre;

    public ArmasSecundarias(int espacioMochila, String calibre) {
        super(espacioMochila);
        this.calibre = calibre;
    }

    public String getCalibre() {
        return calibre;
    }

    public void setCalibre(String calibre) {
        this.calibre = calibre;
    }
}
