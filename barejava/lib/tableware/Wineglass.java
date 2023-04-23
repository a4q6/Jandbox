package barejava.lib.tableware;

public class Wineglass extends Tableware {

    public Wineglass(int size, String color) {
        super(size, color);
        this.usecase = "wine";
    }

    public void use() {
        System.out.println(
                "I'm a " + this.getColor() + " wineglass(" + this.getSize() + ")! Shall we finish our work tonight?");
    }
}
