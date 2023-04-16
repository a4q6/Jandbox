package playground.lib.tableware;

public class Teacup extends Tableware {

    public Teacup(int size, String color) {
        super(size, color);
        this.usecase = "tea";
    }

    public void use() {
        System.out.println("I'm a " + this.getColor() + " teacup(" + this.getSize() + ")! Let's have a break!");
    }
}
