package uaslp.objetos.figuras;

public abstract class Figura implements DrawableItem{
    private final String name;
    private final String description;

    public Figura(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
