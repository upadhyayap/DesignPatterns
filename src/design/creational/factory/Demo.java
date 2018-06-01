package design.creational.factory;

/**This pattern provides an interface for creating objects
 * but let subclass decide which object to create.
 * It has provided Factory as an interface to create objects but
 * ShapeFactory is deciding which concrete class to instantiate
 *
 * Created by anandu on 14/6/16.
 */
public class Demo {

    public static void main(String args[]) {

        Factory shapeFactory = new ShapeFactory();

        shapeFactory.getShape("rectangle").draw();
    }
}
