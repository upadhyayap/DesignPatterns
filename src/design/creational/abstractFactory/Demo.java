package design.creational.abstractFactory;

/**
 * Abstract factory provides an interface for creating family of objects without specifying their concrete classes.
 * It is tuff to add new object family. We need to change the interfaces and need to do subclassing.
 * we can use prototype to solve this problem
 * Created by anandu on 14/6/16.
 */
public class Demo {

    public static void main(String args[]) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        shapeFactory.getShape("rectangle").draw();
        colorFactory.getColor("Red").fill();

        shapeFactory.getShape("Circle").draw();
        colorFactory.getColor("green").fill();

        Circle c = new Circle();
        c.draw();

        Rectangle r = new Rectangle();
        r.draw();

    }
}
