package tableware;

// Abstract class for tableware. Expected to be extended by cup, plate, fork ...etc.
public abstract class Tableware {

    private int size;
    private String color;
    protected String usecase;

    Tableware(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return this.size;
    }

    public String getColor() {
        return this.color;
    }

    public abstract void use();
}
