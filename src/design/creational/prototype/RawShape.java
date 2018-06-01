package design.creational.prototype;

/**
 * Created by anandu on 14/6/16.
 */
public class RawShape extends AbstractShape {

    @Override
    public void draw() {
        System.out.println(this.name + "Drawn");
    }

    public RawShape clone() throws CloneNotSupportedException {
        Object shape = null;
        shape =  super.clone();
        return (RawShape)shape;
    }

}
